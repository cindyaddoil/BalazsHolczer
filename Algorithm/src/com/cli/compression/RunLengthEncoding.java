package com.cli.compression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding {
	public static String encode(String source) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			int count = 1;
			while (i+1 <source.length()&&(source.charAt(i) == source.charAt(i+1))) {
				count++;
				i++;
			}
			sb.append(count);
			sb.append(source.charAt(i));
		}
		return sb.toString();
	}
	public static String decode(String source) {
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("[0-9]+|[a-zA-Z]");
		Matcher m = p.matcher(source);
		while (m.find()) {
			int num = Integer.valueOf(m.group());
			m.find();
			String c = m.group();
			for (int i = 0; i < num; i++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = "AAAAABBB";
		System.out.println(encode(s));
		String sd = "3A2B";
		System.out.println(decode(sd));
		
	}
}
