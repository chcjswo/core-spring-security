package me.mocadev.corespringsecurity.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-09
 **/
@Entity
@Data
public class Account {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String password;
	private String email;
	private String age;
	private String role;
}
