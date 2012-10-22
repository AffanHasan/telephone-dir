package org.jboss.as.quickstarts.kitchensink.model;

import java.io.Serializable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.as.quickstarts.kitchensink.model.enums.RegistrationType;

/**
 * Represents an application user
 * 
 * @author AffanHasan
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 7966562061346334686L;
	
	@Id
	@Email(message = "Incorrect email")
	@NotNull(message = "Email address required")
	private String email;

	@NotEmpty(message = "Password Required")
	@Size(min = 3, message = "Password required")
	//TODO length of column in DB ? 
	private String password;
	
	@NotEmpty(message = "User name required")
	@Size(min = 3, message = "Must contain at least 3 characters")
	@Pattern(regexp = "[A-Za-z ]*", message = "Must contain only letters and spaces")
	//TODO length of column in DB ?
	private String name;
	
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private RegistrationType registrationType;
}