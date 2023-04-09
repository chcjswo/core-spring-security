package me.mocadev.corespringsecurity.domain;

import lombok.Data;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-09
 **/
@Data
public class AccountDto {

	private Long id;
	private String username;
	private String password;
	private String email;
	private String age;
	private String role;
}
