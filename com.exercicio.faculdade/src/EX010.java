import java.util.Scanner;

public class EX010 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = input2.nextDouble();

        double comissao = 0.03;
        double comissaoExtra = 0.05;
        double limiteComissao = 1500.00;
        double totalComissao;

        if (valorVendas <= limiteComissao) {
            totalComissao = valorVendas * comissao;
        } else {
            totalComissao = (limiteComissao * comissao) + ((valorVendas - limiteComissao) * comissaoExtra);
        }

        double salarioTotal = salarioFixo + totalComissao;

        System.out.println("Salário total do vendedor: R$ " + salarioTotal);

        input.close();
        input2.close();
    }
}

