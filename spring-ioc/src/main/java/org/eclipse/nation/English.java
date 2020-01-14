package org.eclipse.nation;

import org.springframework.stereotype.Component;

@Component //("eng")
public class English implements European {
	public int saluer(int i) {
		System.out.println("Hello");
		return i;
		}
}
