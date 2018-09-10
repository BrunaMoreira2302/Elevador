/*Crie uma classe denominada Elevador para armazenar as informações de um 
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo), capacidade do elevador e 
quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
*Inicializa : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (os elevadores sempre começam no térreo e vazio);
*Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
*Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
*Sobe : para subir um andar (não deve subir se já estiver no último andar);
*Desce : para descer um andar (não deve descer se já estiver no térreo);
*Encapsular todos os atributos da classe (criar os métodos set e get).
*/
package revisao_ex02;

import java.util.Scanner;

public class Revisao_ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Elevador e1 = new Elevador();
        int opcao = 1;
        
        
        while(opcao != 0){

            System.out.println("Escolha a opção desejada: \n"
                    + "1 - Entra \n"
                    + "2 - Sai \n"
                    + "3 - Sobe \n"
                    + "4 - Desce \n"
                    + "0 - Para o programa");
            opcao = in.nextInt();
            
            switch(opcao){
                case 1:
                    e1.entra();
                    System.out.println("Estamos no andar: " + e1.getAndar_atual() + " e temos: " + e1.getQnt_atual() + " pessoas no elevador.");
                    break;
                 
                case 2:
                    e1.sai();
                    System.out.println("Estamos no andar: " + e1.getAndar_atual() + " e temos: " + e1.getQnt_atual() + " pessoas no elevador.");
                    break;
                    
                case 3:
                    e1.sobe();
                    System.out.println("Estamos no andar: " + e1.getAndar_atual() + " e temos: " + e1.getQnt_atual() + " pessoas no elevador.");
                    break;
                    
                case 4:
                    e1.desce();
                    System.out.println("Estamos no andar: " + e1.getAndar_atual() + " e temos: " + e1.getQnt_atual() + " pessoas no elevador.");
                    break;
                 
                    //QUANDO ENCERRA O PROGRAMA ENTRA EM DEFAULT
                default:
                    System.out.println("ERRO! Comando inválido!");
                    break;
            }
        }
    }
    
}
