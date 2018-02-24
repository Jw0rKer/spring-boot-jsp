/**
 *
 */
package com.bazarlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author JK
 */
@Controller
public class ApplicationController {

	@GetMapping("/")
	public String homePage(Model model) {
		return "/index.jsp";
	}

}
