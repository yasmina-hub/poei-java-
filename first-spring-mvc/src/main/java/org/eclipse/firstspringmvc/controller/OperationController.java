package org.eclipse.firstspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OperationController {

	@GetMapping(value = "/operation/{op}")
	public void sayHello(@PathVariable String op, @RequestParam(value = "x", defaultValue = "0") int s,
			@RequestParam(value = "y", defaultValue = "1") int t) {

		if (op.equals("plus")) {
			System.out.println(s + t);
		} else if (op.equals("moins")) {
			System.out.println(s - t);
		} else if (op.equals("div")) {
			System.out.println(s / t);
		} else if (op.equals("fois")) {
			System.out.println(s * t);
		}
	}

}
