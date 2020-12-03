package br.edu.univas.main;

public class Questao1 {
	public static void main(String[] args) {

		Data data = new Data();
		Periodo periodo = new Periodo();
		Data inicio = new Data();
		Data fim = new Data();
		inicio.dia = 15;
		inicio.mes = 8;
		inicio.ano = 2020;
		fim.dia = 20;
		fim.mes = 2;
		fim.ano = 2020;
		data.dia = 4;
		data.mes = 2;
		data.ano = 2020;
		periodo.inicio = inicio;
		periodo.fim = fim;
		System.out.println(estaDentro(periodo, data));

	}

	public static boolean estaDentro(Periodo periodo, Data data) {
		Data inicio = periodo.inicio;
		Data fim = periodo.fim;

		if (data.dia >= inicio.dia && data.mes >= inicio.mes && data.ano >= inicio.ano) {
			if (data.dia <= fim.dia && data.mes <= fim.mes && fim.ano <= inicio.ano) {
				return true;
			}
			return false;
		}

		return false;

	}

}
