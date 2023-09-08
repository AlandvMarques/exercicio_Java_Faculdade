package listaNum01;
import java.util.Scanner;

public class EX003 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs: ");
        int quantMacas = input.nextInt();

        double valorTotal;

        if (quantMacas > 12) {
            valorTotal = quantMacas * 1.00;
        } else {
            valorTotal = quantMacas * 1.30;
        }

        System.out.println("O valor total da compra foi de R$ " + valorTotal);

        input.close();
    } 
}
