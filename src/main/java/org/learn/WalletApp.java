package org.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WalletApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DebitCard.class);

		
		DebitCard debitCard = context.getBean("debitCard", DebitCard.class);
		System.out.println("La wallet se fondeo con: $"+debitCard.fund());
		context.close();
	}
}
