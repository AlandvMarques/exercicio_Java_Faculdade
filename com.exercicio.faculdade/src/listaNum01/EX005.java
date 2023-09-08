package listaNum01;
import java.util.Scanner;

public class EX005 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digiti o ano do seu nascimento: ");
        int anoDenascimento = input2.nextInt();

        int idadeDeVotacao = anoAtual - anoDenascimento;

        if(idadeDeVotacao >= 16){
            System.out.println("Você poderá votar! \n você tem " + idadeDeVotacao);
        }else{
            System.out.println("Você não poderá votar! \n você tem " + idadeDeVotacao);
        }
    
        input.close();
    }

}



/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou 
não votar este ano (não é necessário considerar o mês em que a pessoa nasceu)
*/