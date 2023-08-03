package atividade_6_0;

// Atividade POO Continuar

import atividade_6_1.Filme;
import atividade_6_2.Serie;
import java.util.Scanner;

public class MainFilmes {

	public static void main(String[] args) {

		String escolha;

		Scanner sc = new Scanner(System.in);

		System.out.println("Atividade 6.1 - Início aos estudos de POO\n");

		System.out.println("Digite o que você deseja assistir:");
		escolha = sc.nextLine();

		switch (escolha) {

		case "1","Filme","filme":

			System.out.println("\nDigite o nome do filme: ");
			String nome = sc.nextLine();

			System.out.println("\nDigite o categoria do filme: ");
			String categoria = sc.nextLine();

			System.out.println("\nDigite a forma de transmissão do filme: ");
			String transmissao = sc.nextLine();

			System.out.println("\nDigite a duração do filme: ");
			int duracao = sc.nextInt();

			System.out.println("\nFilme: \n");

			Filme filme1 = new Filme(nome, categoria, transmissao, duracao);

			filme1.mostrarDadosFilme();

			return;

		case "2","Série", "série", "Serie", "serie":

			System.out.println("\nDigite o nome da série: ");
			String nomeS = sc.nextLine();

			System.out.println("\nDigite a categoria da série: ");
			String categoriaS = sc.nextLine();

			System.out.println("\nDigite a forma de transmissão da série: ");
			String transmissaoS = sc.nextLine();

			System.out.println("\nDigite quantas temporadas a série possui: ");
			int temporada = sc.nextInt();

			System.out.println("\nDigite quantos episódios por temporada, a série possui: ");
			int episodio = sc.nextInt();

			System.out.println("\nEm média, em minutos, cada episódio será de quanto tempo? ");
			int duracaoEp = sc.nextInt();

			System.out.println("\nA série possui spinoff? ");
			String spinoff = sc.nextLine();

			System.out.println("\nSérie: \n");

			Serie serie1 = new Serie(nomeS, categoriaS, transmissaoS, temporada, episodio, duracaoEp, spinoff);

			serie1.mostrarDadosSerie();

			return;
			
		default:	
			System.out.println("\nPor favor, reinicie a aplicação manualmente.");
		}
	}

}
