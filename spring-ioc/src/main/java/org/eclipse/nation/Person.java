package org.eclipse.nation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Car c;
	public void drive() {
	System.out.println("Je suis pret a conduire");
	c.start();
	}

}
