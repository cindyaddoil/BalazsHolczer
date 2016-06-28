package com.cli.dijkstraInterpretor;

public class App {
	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();
		algorithm.interpreteExpression("(3/2) * 7");
		algorithm.result();
	}
}
