package entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_person")
	private Long idPerson;
	
	@OneToMany(mappedBy = "personM", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Record> listRecords;

	@Column(name = "sha_key")
	private String shaKey;
	
	@Column(name = "name")
	private String name;

	public Person() {
		
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public Set<Record> getListRecords() {
		return listRecords;
	}

	public void setListRecords(Set<Record> listRecords) {
		this.listRecords = listRecords;
	}

	public String getShaKey() {
		return shaKey;
	}

	public void setShaKey(String shaKey) {
		this.shaKey = shaKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	

	
	
	
	
}
