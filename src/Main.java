import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero você vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i< vect.length; i++){
            System.out.print("Digite um numero: ");
            sc.nextLine();
            vect[i] = sc.nextDouble();
        }

        System.out.println("");
        System.out.print("Valores= ");
        for(int i=0; i< vect.length; i++){
            System.out.printf("%.2f" + "  ", vect[i]);
        }

        double media = 0;
        double sum = 0;
        for(int i=0; i< vect.length; i++){
            sum += vect[i];
        }
        media = sum / n;

        System.out.println("");
        System.out.printf("Soma: %.2f%n", sum);
        System.out.printf("Media: %.2f%n", media);




        sc.close();
    }

}