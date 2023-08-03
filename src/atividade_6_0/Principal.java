package atividade_6_0;

import atividade_6_1.Filme;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
		

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10);
		meuFilme.avalia(5);
		meuFilme.avalia(8);
		meuFilme.avalia(4);
		System.out.println("Total de avaliação: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média de avaliações do filme:  " + meuFilme.pegaMedia());
		
	}
}