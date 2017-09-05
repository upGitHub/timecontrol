package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "records")
public class Record implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_record")
	private Long idRecord;
	
	@ManyToOne
    @JoinColumn(name = "id_person")
	private Person personM;

	@Column(name = "time_control")
	private Long time;
	
	@Column(name = "device_control")
	private String device;
	
	@Column(name = "status_on_work")
	private Byte event;

	public Record() {
	}
	
	





	public Record(Person personM, Long time, String device, Byte event) {
		this.personM = personM;
		this.time = time;
		this.device = device;
		this.event = event;
	}







	






	public Long getIdRecord() {
		return idRecord;
	}







	public void setIdRecord(Long idRecord) {
		this.idRecord = idRecord;
	}







	public Person getPersonM() {
		return personM;
	}







	public void setPersonM(Person personM) {
		this.personM = personM;
	}







	public Long getTime() {
		return time;
	}







	public void setTime(Long time) {
		this.time = time;
	}







	public String getDevice() {
		return device;
	}







	public void setDevice(String device) {
		this.device = device;
	}














	
}
