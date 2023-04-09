package me.mocadev.corespringsecurity.service.impl;

import lombok.RequiredArgsConstructor;
import me.mocadev.corespringsecurity.domain.Account;
import me.mocadev.corespringsecurity.repository.UserRepository;
import me.mocadev.corespringsecurity.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-09
 **/
@Service("userService")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Transactional
	@Override
	public void createUser(Account account) {
		userRepository.save(account);
	}
}
