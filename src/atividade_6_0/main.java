package atividade_6_0;

import java.util.Scanner;

public class main {

    static String categoria;
    static String transmissao;
    static int duracao = 0;

    public static void main(String[] args) {

        main movie = new main();

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite qual categoria de filme você deseja assistir:");
        categoria = sc1.next();

        System.out.println("\nDigite qual a forma de transmissão do filme que você deseja assistir:");
        transmissao = sc1.next();

        calcular_tempo();

        System.out.println("\nSeu filme é da categoria: " + movie.categoria);
        
        System.out.println("Seu filme será transmitido pela: " + movie.transmissao);
        
        System.out.println("Seu filme terá " + movie.duracao + " hora(s) de filme");
        
        categorizarMetragem();
        
    }

    public static void calcular_tempo() {
    	
        Scanner sc2 = new Scanner(System.in);

        int tempo_min = 60;

        System.out.println("\nDigite quanto tempo em minutos, o filme que você deseja assistir:");
        
        int get_tempo = sc2.nextInt();

        if (get_tempo < 60) {
        	
            System.out.println("Favor, informe uma quantidade de tempo válida em minutos");
            
            calcular_tempo();
            
        } else {
        	
            duracao = get_tempo / tempo_min;
            
            System.out.println("A duração do filme convertida em horas, é de: " + duracao + " hora(s)");
           
        }        

    }

    public static void categorizarMetragem() {
    	
        int duracaoMetragem = duracao;
    	
    	 if (duracaoMetragem < 0.25) {
         	
             System.out.println("Seu  filme é um: Curta-metragem");
             
         } else if (duracaoMetragem > 0.25 && duracaoMetragem < 1.1) {
         	
             System.out.println("Seu filme é um: Média-metragem");
             
         } else if (duracaoMetragem > 1.1) {
         	
             System.out.println("Seu filme é um: Longa-metragem");
         }
    	
    }
    
}

