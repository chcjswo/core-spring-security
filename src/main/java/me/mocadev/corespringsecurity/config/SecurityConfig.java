package me.mocadev.corespringsecurity.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-03-27
 **/
@Slf4j
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.anyRequest().authenticated();
		http
			.formLogin()
			.loginPage("/loginPage")
			.defaultSuccessUrl("/")
			.failureUrl("/login")
			.loginProcessingUrl("/login-proc")
			.successHandler((request, response, authentication) -> {
				log.info("authentication = {}", authentication.getName());
				response.sendRedirect("/");
			})
			.failureHandler((request, response, exception) -> {
				log.error("exception = {}", exception.getMessage());
				response.sendRedirect("/loginPage");
			})
			.permitAll();
	}
}
