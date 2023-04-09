package me.mocadev.corespringsecurity.repository;

import me.mocadev.corespringsecurity.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-09
 **/
public interface UserRepository extends JpaRepository<Account, Long> {

	Account findByUsername(String username);
}
