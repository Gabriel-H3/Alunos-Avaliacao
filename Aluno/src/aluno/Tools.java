/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author gomes
 */
public class Tools {
    Scanner sc = new Scanner(System.in);
    public Tools(){

    }
    
    public void Pergunta(){
        
        System.out.println("Digite as operações \n"
                + "1 - Cadastrar Aluno\n"
                + "2 - Média de Aluno\n"
                + "3 - Lista dos Alunos, Aprovados e Reprovados\n"
                + "4 - Sair");
        
    }
    
    public void PerguntaAluno(){
        
        System.out.println("Qual o nome do Aluno que deseja cadastrar: ");
        
    }
    
    public void PerguntaAlunoMedia(ArrayList<String> Lista){
        System.out.println("Aqui sua Lista de Alunos: " + Lista + "\n");
        
        System.out.println("Digite aqui o nome do Aluno que deseja calcular a média: ");
  
    }
    
    public void AprovadoReprovado(ArrayList<String> Aprovados, ArrayList<String> Reprovados, String Nome){

        double nota1, nota2, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2;
        if(media < 5){
             System.out.println("Aluno(a) " + Nome + " não foi aprovado(a), pois sua média foi de apenas " + media);
             Reprovados.add(Nome);
        } else{
             System.out.println("Aluno(a) " + Nome + " foi aprovado(a), pois sua média alcançou " + media);
             Aprovados.add(Nome);
        }
    }
    
    public void ListaAproReprob(ArrayList<String> Aprovados, ArrayList<String> Reprovados, ArrayList<String> Lista){
             
            int operacao;
                    
                 System.out.println("1 - Lista de Alunos\n"
                 + "2 - Lista de Aprovados\n"
                 + "3 - Lista de Reprovados\n"
                         + "4 - Voltar\n");
                 try { 
                 operacao = sc.nextInt();
                  sc.nextLine();
               
                     
                   switch(operacao){
                       case 1:
                            System.out.println("\nAlunos: " + Lista + "\n");
                           break;
                       case 2:
                            System.out.println("\nAprovados: " + Aprovados + "\n");
                           break;
                       case 3:
                            System.out.println("\nReprovados: " + Reprovados + "\n");
                           break;
                       case 4:
                           break;
                        default:
                           System.out.println("Operação Inválida");
                           
                   }
                
                } catch (InputMismatchException e) {
                 System.out.println("É necessário um número de operação!");
                  sc.nextLine();
                }

    }
   
    
}



