import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SalaGiochi {
    HashSet<Player> listOfPlayers = new HashSet<>();
    HashSet<Game> listOfGames = new HashSet<>();
    LinkedList<Partita> listOfPartita = new LinkedList<>();

    public Player addPlayer(String nickname){
        Player player = new Player(nickname);
        listOfPlayers.add(player);
        return player;
    }
    public UUID addGame(String name, int difficulty){
        Game game = new Game(name, difficulty);
        listOfGames.add(game);
        return game.getId();
    }

    public void newPartita(Player player, Game game, int score){
        listOfPartita.addFirst(new Partita(player, game, score));
    }

    public void classificaVideogame(Game game){
        List<Partita> classifica = listOfPartita.stream();
        listOfPartita.stream()
                .filter(x->x.getGame().equals(game))
               // .sorted((x,y)->Integer.compare(y.getScore(), x.getScore()))
                .sorted(Comparator.comparingInt(Partita::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
        classifica.forEach();
    }
}
