package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Person;
import util.HibernateUtil;

@Repository
public class PersonDAO {
	
	@Autowired
    private HibernateUtil hibernateUtil;  

	public void createPerson(Person person) {
		
		 hibernateUtil.create(person);
	}


	public void deletePerson(Long id) {
		hibernateUtil.delete(id, Person.class);
	}


	public List<Person> getAllPersons() {
		
		return hibernateUtil.fetchAll(Person.class);
	}

	
	public Person getPersonsById(Long id) {
		return hibernateUtil.fetchById(id, Person.class);
	}
}
