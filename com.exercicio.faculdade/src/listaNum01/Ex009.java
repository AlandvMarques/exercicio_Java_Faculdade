package listaNum01;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {

        int horasSemanais = 40;
        int semanasPorMes = 4;
        double salarioTotal;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o salário por hora: ");
        double salarioPorHora = input2.nextDouble();

        if (horasTrabalhadas <= horasSemanais * semanasPorMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - (horasSemanais * semanasPorMes);
            double salarioHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasSemanais * semanasPorMes * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        System.out.println("Salário total do funcionário: R$ " + salarioTotal);

        input.close();
    }
}
    
