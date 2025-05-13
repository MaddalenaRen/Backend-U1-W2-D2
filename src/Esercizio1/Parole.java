package Esercizio1;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Parole {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int N= scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleDiverse= new HashSet<>();
        Set<String> paroleRipetute= new HashSet<>();

        for (int i = 0; i < N ; i++) {
            System.out.println("Inserisci parola: ");
            String parola = scanner.nextLine().trim();

            if (!paroleDiverse.add(parola)){
                paroleRipetute.add(parola);
            }

        }

        System.out.println("parole ripetute: "+ paroleRipetute);
        System.out.println("numero parole inserite diverse tra loro: " + paroleDiverse.size());

        for (String s : paroleDiverse) {
            System.out.print("lista parole inserite, diverse tra loro: ");
            System.out.println(s);
        }


    }
}
