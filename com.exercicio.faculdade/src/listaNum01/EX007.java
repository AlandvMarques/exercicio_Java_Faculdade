package listaNum01;

import java.util.Scanner;

public class EX007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float num1 = input.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite outro número: ");
        float num2 = input2.nextFloat();

        if(num1 < num2){
            System.out.println(num1 + "," + num2);
        }else{
            System.out.println(num2 + "," + num1);
        }
        
    }
}
