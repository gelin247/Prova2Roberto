package br.edu.univas.main3;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		lerRetangulo();

	}

	public static Retangulo lerRetangulo() {
		Scanner s = new Scanner(System.in);
		Retangulo r = new Retangulo();
		r.xIni = s.nextInt();
		r.xFim = s.nextInt();
		r.yIni = s.nextInt();
		r.yFim = s.nextInt();
		return r;
	}

}
