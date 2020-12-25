import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {


    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Marco");
        nomi.add("Andrea");
        nomi.add("Franco");
        nomi.add("Francesco");
        nomi.add("Ferdinando");

        //Metodo Imperiale
        /*for (String nome: nomi) {
            int somma = 0;
            char iniziale = nome.charAt(0);
            if(Character.toString(iniziale).equals("F")){
                somma = somma + nome.length();
            }
            System.out.println(somma);
        }*/

        //Metodo Stream

        int somma = nomi.stream()
                .filter(s -> s.startsWith("F"))
                .mapToInt(String::length).sum();
        System.out.println(somma);

    }
}
