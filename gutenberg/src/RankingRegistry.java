import java.awt.print.Book;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RankingRegistry {
    private HashMap<String, GetBook> bookRankings;

    public RankingRegistry() {
        bookRankings = new HashMap<>();
    }

    public void addBook(String name, long[] arrayLetters){
        Set<String> keys = addEntryandGetKeys(name, arrayLetters);
        GetBook newBook = bookRankings.get(name);
        for (String key : keys){
            GetBook currentBook = bookRankings.get(key);
            double distance = vectorDistance(arrayLetters, currentBook.getLettersArray());
            currentBook.updateRanking(name, distance);
            newBook.updateRanking(currentBook.getFileName(), distance);
        }
    }

    private synchronized Set<String> addEntryandGetKeys(String name, long[] arrayLetters){
        Set<String> keys = new HashSet<>(bookRankings.keySet());
        bookRankings.put(name, new GetBook(name, arrayLetters));
        return keys;
    }

    private static double vectorDistance(long[] first, long[] second){
        int p = first.length;
        double result = 0;
        for (int i = 0; i < p; i++){
            result += Math.pow(Math.abs(first[i] - second[i]), p);
        }
        return  Math.pow(result, 1.0 / p);
    }

    @Override
    public String toString() {
        String result = "";
        for (String k : bookRankings.keySet()){
            result += bookRankings.get(k).toString()+ "\n\n\n\n";
        }
        return result;
    }
}
