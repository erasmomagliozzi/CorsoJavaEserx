import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Anagrafe anagrafe = new Anagrafe();
        //List<Persona> anagrafe = new ArrayList<>();
        Persona erasmo = new Persona("Erasmo", "Magliozzi", 22, "MGLRSM", "Lungomare");
        Persona mario = new Persona("Mario", "Belli", 30, "BLLMRO", "Corso");
        Persona ale = new Persona("Ale", "Belli", 40, "BLLMRO", "Corso");
        Persona marco = new Persona("Marco", "Bravi", 50, "BLLMRO", "Corso");


        anagrafe.inserisciPersona(erasmo);
        anagrafe.inserisciPersona(mario);
        anagrafe.inserisciPersona(ale);
        anagrafe.inserisciPersona(marco);
        //anagrafe.rimuoviPersona("BLLMRO");
        System.out.println(anagrafe.getAnziani());
       // System.out.println(anagrafe.getPersone("erasmo"));
        System.out.println(anagrafe);

    }
}
