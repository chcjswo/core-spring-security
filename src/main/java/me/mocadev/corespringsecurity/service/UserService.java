package me.mocadev.corespringsecurity.service;

import me.mocadev.corespringsecurity.domain.Account;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-09
 **/
public interface UserService {

	void createUser(Account account);
}
