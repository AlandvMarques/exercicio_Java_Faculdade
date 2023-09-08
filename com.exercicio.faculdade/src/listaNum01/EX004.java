package listaNum01;
import java.util.Scanner;

public class EX004 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota: ");
        float nota2 = input2.nextFloat();

        float media = (nota1 + nota2) /2 ;

        if( media >= 6){
            System.out.println("Você foi aprovado!\n sua media foi:" + media);
        }else{ 
            System.out.println("Você foi reprovado! \n sua media foi: "+ media);
        }


        
        input.close();
    }
}
