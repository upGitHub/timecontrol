package controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dao.PersonDAO;
import dao.RecordDAO;
import entity.Person;
import entity.Record;

@RestController
@Transactional
public class RecordsController {

	@Autowired
	RecordDAO recordDAO;
	
	@Autowired
	PersonDAO personDAO;

	@RequestMapping(value = "/listrecord", method = RequestMethod.GET)
	public List<Record> getListRecord() {
		return recordDAO.getAllRecords();

	}
	
	@RequestMapping(value = "/personrecord", method = RequestMethod.GET)
	public List<Person> getListPerson() {
		return personDAO.getAllPersons();

	}
}
