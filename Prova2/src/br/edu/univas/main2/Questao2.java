package br.edu.univas.main2;

public class Questao2 {
	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		Ponto p = new Ponto();
		p1.x = 10;
		p1.y = 10;
		p2.x = 20;
		p2.y = 20;
		r.inicio = p1;
		r.fim = p2;

		p.x = 1;
		p.y = 2;
		System.out.println(estaDentro(r, p));
	}

	public static boolean estaDentro(Retangulo retangulo, Ponto p) {
		Ponto inicio = retangulo.inicio;
		Ponto fim = retangulo.fim;
		if (inicio.x >= p.x && fim.x <= p.x && inicio.y >= p.y && fim.y <= p.y)
			return true;

		return false;

	}
}
