package com.example.patterns.structural.proxy;

public class Runner {
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("cbs.org");
			internet.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
