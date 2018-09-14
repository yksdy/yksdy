package com.yksdy.demo;

public class StringSplit {
	public static void main(String[] args) {
		String abc = "abc_000001";
		String[] a = abc.split("_");
		for(String s :a) {
			System.out.println(s);
		}
	}
}
