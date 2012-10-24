package org.jboss.as.quickstarts.kitchensink.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Address book
 *
 * @author AffanHasan
 */
@Entity
@Table(name="contacts_book")
public class ContactsBook implements Serializable {

	private static final long serialVersionUID = -3837264140021293456L;

	@Id
	@GeneratedValue(generator = "id_generator")
	private Long id;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "contactsBook", fetch = FetchType.LAZY)
	private List<Group> group;
}