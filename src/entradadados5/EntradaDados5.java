/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadados5;

/**
 *
 * @author JONAS
 */

import java.util.Scanner;

public class EntradaDados5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Treinamento - Aula entrada de dados tipo string, 
        NextLine, Concatenação */
        //Jonas valereo - Técnico em informática 
        
        //Declarando as variaveis tipo string
        
        String nome; 
        String sobrenome;
        String idade; 
        String cidade; 
        String cep;
        String estado;
        String pais;
        
        //Declrando o cogido Scanner entrada de dados
        
        Scanner entrada = new Scanner(System.in);
       
    /*Declarando o codigo entrada de dado, nextLine imprimir 
        varias palavras no console */
        
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite seus obrenome: ");
        sobrenome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextLine();
         System.out.println("Digite sua cidade: ");
        cidade = entrada.nextLine();
        System.out.println("Digite seu cep: ");
        cep = entrada.nextLine();
        System.out.println("Digite seu estado: ");
        estado = entrada.nextLine();
        System.out.println("Digite seu pais: ");
        pais = entrada.nextLine();
        
        //Declarando o codigo imprimir saida de dados no console, Concatenção
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu sobrome é: " + sobrenome);
        System.out.println("Sua idade é: " +  idade);
        System.out.println("Sua cidade é: " + cidade);
        System.out.println("Seu cep é: " + cep);
        System.out.println("Seu estado é: " + estado);
        System.out.println("Seu pais é: " + pais);
        
        //Declarando a saida da aplicação e descarrega a memoria 
        
        System.exit(0);
        
        //Fim do programa
         
    }
    
}