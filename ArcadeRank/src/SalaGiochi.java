package packageClass;

import java.util.HashSet;

public class SalaGiochi {
    HashSet<Player> listOfPlayers = new HashSet<>();
    HashSet<Game> listOfGames = new HashSet<>();

    public Player addPlayer(String nickname){
        Player player = new Player(nickname);
        listOfPlayers.add(player);
        return player;
    }
}
