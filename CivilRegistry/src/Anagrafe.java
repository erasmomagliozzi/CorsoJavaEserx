import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrafe {
    private Set<Persona> abitanti;
    Persona persona;


    public Anagrafe() {
        this.abitanti = new HashSet<>();

    }

    public Set<Persona> getAbitanti() {
        return abitanti;
    }

    public void inserisciPersona(Persona persona){
        abitanti.add(persona);
    }

    public void rimuoviPersona(String codiceFis)
    {
        abitanti = abitanti.stream()
                .filter(p -> !p.getCodiceFiscale().equals(codiceFis))
                .collect(Collectors.toSet());
    }

    public Set<Persona> ottieniPersona(String nome){
        String lowerCaseName = nome.toLowerCase().trim();
        return abitanti.stream()
                .filter(person -> person.getNome().equals(nome) || person.getNome().startsWith(nome))
                .collect(Collectors.toSet());
    }

    public List<Persona> getAnziani(){
       return abitanti.stream()
                .sorted(Comparator.comparing(Persona::getEta).reversed())
                .limit(3)
                .collect(Collectors.toList());

    }
    public Set<String> getAddressesByName(String name){
        return ottieniPersona(name).stream()
                .map(Persona::getIndirizzoResidenza)
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "Anagrafe{ " + abitanti +
                '}';
    }
}
