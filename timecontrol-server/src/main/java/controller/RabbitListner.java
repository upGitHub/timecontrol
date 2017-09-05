package controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dao.PersonDAO;
import dao.RecordDAO;
import entity.Person;
import entity.Record;

@Controller
@Transactional
public class RabbitListner implements MessageListener {

	@Autowired
	AmqpTemplate template;

	@Autowired
	RecordDAO recordDAO;

	@Autowired
	PersonDAO pesonDAO;

	@RabbitListener(queues = "qr")
	@Override
	public void onMessage(Message message) {
		byte[] body = message.getBody();
		String incomingMessage = new String(body);

		List<Person> personList = pesonDAO.getAllPersons();

		personList.forEach(person -> {
			if (person.getShaKey().equals(incomingMessage)) {
				recordDAO.createRecord(new Record(person, System.currentTimeMillis(), "Device 1 Enter", (byte) 1));
				template.convertAndSend("qr-response", "Access enable for " + person.getName());
				return;
			}
		});

	}

}
