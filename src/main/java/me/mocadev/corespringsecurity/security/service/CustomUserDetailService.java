package me.mocadev.corespringsecurity.security.service;

import lombok.RequiredArgsConstructor;
import me.mocadev.corespringsecurity.domain.Account;
import me.mocadev.corespringsecurity.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-10
 **/
@Service("userDetailService")
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

	private final UserRepository userDetailsService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = userDetailsService.findByUsername(username);
		if (account == null) {
			throw new UsernameNotFoundException("user not found");
		}

		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority(account.getRole()));

		return new AccountContext(account, roles);
	}
}
