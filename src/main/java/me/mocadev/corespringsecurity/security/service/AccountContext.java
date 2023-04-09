package me.mocadev.corespringsecurity.security.service;

import me.mocadev.corespringsecurity.domain.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-10
 **/
public class AccountContext extends User {

	private final Account account;

	public AccountContext(Account account, Collection<? extends GrantedAuthority> authorities) {
		super(account.getUsername(), account.getPassword(), authorities);
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
}
