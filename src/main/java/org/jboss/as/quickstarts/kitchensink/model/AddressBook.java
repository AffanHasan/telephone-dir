package org.jboss.as.quickstarts.kitchensink.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Address book
 *
 * @author AffanHasan
 */
@Entity
@Table(name="address_book")
public class AddressBook implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "id_generator", table = "id_generator"
		, pkColumnName = "gen_name", valueColumnName = "gen_name", pkColumnValue = "address_book_id_gen")
	@GeneratedValue(generator = "id_generator")
	private Long id;
	
	@NotEmpty(message = "Name required")
	@Size(min = 3, message = in.name)
	private String name;
	
	private String address;
	private String comments;

	public AddressBook() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	//TODO To Be Removed Just For Proof Of Concepts
	static class in{
		
		public static final String name = "Affan Hasan";
	}
}