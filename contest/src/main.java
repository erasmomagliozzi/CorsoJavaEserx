import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        getAllLines("/Users/erasmomagliozzi/Desktop/REPOS/CorsoJavaEserx/contest/src/Matricione.txt");

    }

    public static List<Integer> getAllLines(String filename) throws IOException {
        int[][] matrice = new int[2000][2000];
        List<Integer> listaInteri = new ArrayList<>();

        List<Integer> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] splited = line.split(";");
                for(String key : splited){
                    int element = Integer.parseInt(key.trim());
                    lines.add(element);
                }
            }
        }
        System.out.println(lines);
        int somma = 0;
        for (int x = 0; x < lines.size(); x++){
            somma = somma + lines.get(x);
        }
        System.out.println("somma" + somma);
        return lines;
    }


}
