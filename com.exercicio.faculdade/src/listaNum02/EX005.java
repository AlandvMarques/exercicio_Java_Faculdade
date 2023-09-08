import java.util.Scanner;

public class EX005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2;
        
        // Solicita e lê a primeira nota até que um valor válido seja inserido
        do {
            System.out.print("Informe a primeira nota (0 a 10): ");
            nota1 = input.nextDouble();
        } while (nota1 < 0 || nota1 > 10);
        
        // Solicita e lê a segunda nota até que um valor válido seja inserido
        do {
            System.out.print("Informe a segunda nota (0 a 10): ");
            nota2 = input.nextDouble();
        } while (nota2 < 0 || nota2 > 10);
        
        // Calcula a média simples das notas
        double media = (nota1 + nota2) / 2;
        
        // Imprime a média
        System.out.println("A média do aluno é: " + media);
        
        input.close();
    }
}
