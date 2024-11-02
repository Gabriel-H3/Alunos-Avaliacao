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
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tools tl = new Tools(); 
        
       boolean onOff = true;
       int operacao = 0;
       String nomes;
       String nomesVerificacao;
       
       ArrayList<String> Alunos = new ArrayList<>();
       ArrayList<String> AlunosAprovados = new ArrayList<>();
       ArrayList<String> AlunosReprovados = new ArrayList<>();
      
       
       System.out.println("Bem-vindo ao Sistema Professor-Nota");
       
      
       
        while(onOff == true){
            
           tl.Pergunta();
           
           
          try{ 
           operacao = sc.nextInt();
           sc.nextLine();
            switch(operacao){
                
                case 1:
                    tl.PerguntaAluno();
                    nomes = sc.next();
                    Alunos.add(nomes);
                    System.out.println("Sucesso");
                    break;
                case 2:
                    tl.PerguntaAlunoMedia(Alunos);
                    nomesVerificacao = sc.next();
                    if(Alunos.contains(nomesVerificacao)){
                        tl.AprovadoReprovado(AlunosAprovados, AlunosReprovados, nomesVerificacao);
                    } else {
                        System.out.println("Este nome não está cadastado, verifique novamente!");
                    }
                    break;
                case 3:
                    tl.ListaAproReprob(AlunosAprovados, AlunosReprovados, Alunos);
                    break;
                case 4:
                    System.out.print("Saindo...");
                    onOff = false;
                    break;
                default:
                    System.out.println("Operação Inválida");
            }
          }catch(InputMismatchException e) {
                 System.out.println("É necessário um número de operação!");
                  sc.nextLine();
           } 
        }
       
        
        
        
    }
    
}
