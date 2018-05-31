package com.string.basic;

public class StringEqualityTest {

	public static void main(String[] args) {
		String s1 = "Yasin";
		String s2 = "Yasin";
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1 == s2);
		String s3 = new String("Yasin");
		System.out.println(s1 == s3);
		System.out.println(s1.hashCode() + "::" + s2.hashCode() + "::" +  s3.hashCode());
	}
}
