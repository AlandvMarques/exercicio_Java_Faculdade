package listaNum01;
import java.util.Scanner;

public class EX008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita a hora do íbnicio do jogo: ");
        int horaInicial = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digita a hor do fim do jogo: ");
        int horaFinal = input2.nextInt();

        int duracao;

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial; 
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("A duração do jogo foi " + duracao + " horas!");
    }
}
