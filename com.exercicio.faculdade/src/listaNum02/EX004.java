import java.util.Scanner;

public class EX004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiroValor, segundoValor;
        
        System.out.println("Informe o primeiro valor: ");
        primeiroValor = input.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        segundoValor = input.nextDouble();
        
        while (segundoValor == 0) {
            System.out.println("VALOR INVÁLIDO: O segundo valor não pode ser zero. Tente novamente.");
            segundoValor = input.nextDouble();
        }
        
        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);
        
        input.close();
    }
}