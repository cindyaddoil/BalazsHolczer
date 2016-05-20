package com.cli.DijkstraInterpreter;

public class App {
	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();
		algorithm.interpretExpression("(( 7 + 2 ) / (6 - 3 ))");
		algorithm.result();
	}
}
