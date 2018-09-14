package com.yksdy.desigin.patterns.structural.proxy;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");
		
		image.display();
		image.display();
	}

}
