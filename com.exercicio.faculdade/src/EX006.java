import java.util.Scanner;

public class EX006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float num1 = input.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite outro número: ");
        float num2 = input2.nextFloat();


        if(num1 > num2){
            System.out.println("O número maior é:" + num1);
        }else{
            System.out.println("O número maior é:" + num2);
        }

        input.close();
    }
}
