package org.jboss.as.quickstarts.kitchensink.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Represents an application user
 * 
 * @author AffanHasan
 */
public class User {
	
	@Id
	@TableGenerator(name = "id_generator", table = "id_generator"
		, pkColumnName = "gen_name", valueColumnName = "gen_name", pkColumnValue = "user_id_gen")
	@GeneratedValue(generator = "id_generator")
	private Long id;
	
	@NotEmpty(message = "User name required")
	@Size(min = 3, message = "Must contain at least 3 characters")
	@Pattern(regexp = "[A-Za-z ]*", message = "Must contain only letters and spaces")
	private String name;
	
	@Email(message = "Incorrect email")
	@NotNull(message = "Email address required")
	private String email;
	
	@NotEmpty(message = "Password Required")
	private String password;
}