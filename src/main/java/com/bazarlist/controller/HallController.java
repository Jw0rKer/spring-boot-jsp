/**
 *
 */
package com.bazarlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bazarlist.service.dec.IHallService;

/**
 * @author JK
 *
 */
@RestController
public class HallController {

	@Autowired
	private IHallService service;



}
