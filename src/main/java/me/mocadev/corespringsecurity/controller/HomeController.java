package me.mocadev.corespringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-04-07
 **/
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
}
