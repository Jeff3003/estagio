import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        //número de entrada
        System.out.println("Digite um número: ");
        int numeroDigitado = numero.nextInt();

        int a=0, b=1;
        boolean fibonaci = false;
        while(b<=numeroDigitado){
            if(b==numeroDigitado){
                fibonaci = true;
                break;
            }
            int temporario = a;
            a = b;
            b = temporario + b;
            int total = b;
            System.out.print(total + " ");
        }

        System.out.println();
        if(fibonaci){
            System.out.println(numeroDigitado + " Pertence a sequência de Fibonaci! ");
        }else{
            System.out.println(numeroDigitado + " Não pertence a sequência de Fibonaci.");
        }

    }
}
