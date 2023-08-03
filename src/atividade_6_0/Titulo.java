package atividade_6_0;

import atividade_6_1.Filme;
import atividade_6_2.Serie;

public class Titulo {

	// Variáveis Globais

	private String nome;
	private String categoria;
	private String transmissao;
	private String spinoff;
	private String nomeS;
	private String categoriaS;
	private String transmissaoS;
	private int duracao;
	private int temporada;
	private int episodio;
	private int duracaoEp;

	// Construtor Filme

	public Titulo(String nome, String categoria, String transmissao, int duracao, int episodio, int duracaoEp, String spinoff) {

		this.nome = nome;
		this.categoria = categoria;
		this.transmissao = transmissao;
		this.duracao = duracao;

	}

	// Construtor Série

	public Titulo(int temporada, int episodio, int duracaoEp, String nome, String categoria, String transmissao,
			String spinoff) {

		this.nome = nome;
		this.categoria = categoria;
		this.transmissao = transmissao;
		this.temporada = temporada;
		this.episodio = episodio;
		this.duracaoEp = duracaoEp;
		this.spinoff = spinoff;

	}

	// Método

	public void mostrarDadosFilme() {

		int horas = duracao / 60;
		int minutos = duracao % 60;

		System.out.println("Seu filme é: " + nomeS);

		System.out.println("Seu filme é da categoria: " + categoriaS);

		System.out.println("Seu filme será transmitido pela: " + transmissaoS);

		System.out.println("Seu filme terá " + horas + " hora(s) e " + minutos + " minutos de filme");

		if (horas < 0.25) {

			System.out.println("Seu filme é um: Curta-metragem");

		} else if (horas > 0.25 && horas < 1.1) {

			System.out.println("Seu filme é um: Média-metragem");

		} else if (horas > 1.1) {

			System.out.println("Seu filme é um: Longa-metragem");
		}

	}

	public void mostrarDadosSerie() {

		int horasEp = duracaoEp / 60;

		System.out.println("Sua série é: " + nomeS);

		System.out.println("Sua série é da categoria: " + categoria);

		System.out.println("Sua série será transmitido pela: " + transmissao);

		System.out.println("Sua série terá " + episodio + " episódios por temporada, com " + horasEp
				+ " hora(s) de duração por episódio");

		}

	// Encapsulamento - Gets e Sets - Filme e Série

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}
	
	public String getNomeS() {
		return nome;
	}

	public void setNomeS(String nomeS) {
		this.nomeS = nomeS;
	}

	public String getCategoriaS() {
		return categoriaS;
	}

	public void setCategoriaS(String categoriaS) {
		this.categoriaS = categoriaS;
	}

	public String getTransmissaoS() {
		return transmissaoS;
	}

	public void setTransmissaoS(String transmissaoS) {
		this.transmissaoS = transmissaoS;
	}

	public int getDuracao() {

		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public int getEpisodio() {
		return temporada;
	}

	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}

	public int getDuracaoEp() {
		return duracaoEp;
	}

	public void setDuracaoEp() {
		this.duracaoEp = duracaoEp;
	}

	public String getSpinoff() {
		return spinoff;
	}

	public void setSpinoff() {
		this.spinoff = spinoff;
	}
}
