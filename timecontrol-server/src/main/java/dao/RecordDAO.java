package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Record;
import util.HibernateUtil;

@Repository
public class RecordDAO {
	
	@Autowired
    private HibernateUtil hibernateUtil;  

	public void createRecord(Record record) {
		
		 hibernateUtil.create(record);
	}


	public void deleteRecord(Long id) {
		hibernateUtil.delete(id, Record.class);
	}


	public List<Record> getAllRecords() {
		
		return hibernateUtil.fetchAll(Record.class);
	}

	
	public Record getRecordsById(Long id) {
		return hibernateUtil.fetchById(id, Record.class);
	}
	
}
