package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumeriRandom {

    public static List<Integer> OrdinaNumeriRandom(int N) {
        List<Integer> numeri = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int numero = random.nextInt(101);
            numeri.add(numero);
        }

        Collections.sort(numeri);
        return numeri;
    }

    public static List<Integer> OrdineInversoNumeriRandom(List<Integer> lista){
        List<Integer> listaNumeriInvertiti = new ArrayList<>(lista);
        Collections.reverse(listaNumeriInvertiti);
        return listaNumeriInvertiti;
    }

    public static void stampaPariDispari(List<Integer> lista, boolean number){
        for (int i = 0; i < lista.size(); i++) {
            if(number && i % 2 == 0){
                System.out.println("Posizione " + i + ": " + lista.get(i));
            } else if (!number && i % 2 != 0) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
                
            }

        }
    }

    public static void main(String[] args) {
        int N = 11;

        // 1. Lista ordinata di numeri casuali
        List<Integer> listaOrdinata = OrdinaNumeriRandom(N);
        System.out.println("Lista ordinata casuale:");
        System.out.println(listaOrdinata);

        // 2. Aggiunta degli stessi numeri in ordine inverso
        List<Integer> listaInversa = OrdineInversoNumeriRandom(listaOrdinata);
        List<Integer> listaEstesa = new ArrayList<>(listaOrdinata);
        listaEstesa.addAll(listaInversa);
        System.out.println("Lista con elementi + inverso:");
        System.out.println(listaEstesa);

        // 3. Stampa posizioni pari
        System.out.println("Valori in posizioni pari:");
        stampaPariDispari(listaEstesa, true);

        // 4. Stampa posizioni dispari
        System.out.println("Valori in posizioni dispari:");
        stampaPariDispari(listaEstesa, false);
    }

}
