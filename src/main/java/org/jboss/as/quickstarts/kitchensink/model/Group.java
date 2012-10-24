package org.jboss.as.quickstarts.kitchensink.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Group
 * 
 * @author AffanHasan
 */
@Entity
@Table(name="group")
public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "id_generator")
	private Long id;
	private String name;
	
	@ManyToOne
	private ContactsBook contactsBook;

	public Group() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}