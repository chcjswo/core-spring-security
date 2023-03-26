package me.mocadev.corespringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-03-27
 **/
@RestController
public class SecurityController {

	@GetMapping("/main")
	public String main() {
		return "main";
	}

	@GetMapping("/loginPage")
	public String loginForm() {
		return "loginPage";
	}

}
