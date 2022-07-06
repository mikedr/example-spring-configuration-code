package org.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.learn")
public class DebitCard {
	
	public int fund() {
		return 100;
	}
}
