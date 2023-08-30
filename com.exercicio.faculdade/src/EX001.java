import java.util.Scanner;

public class EX001 {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual sua idade?");

        int idade = input.nextInt();

        if(idade > 10){
            System.out.println("MAIOR QUE 10!");
        }else{
            System.out.println("MAIOR QUE 10!");
        }

    }
}
