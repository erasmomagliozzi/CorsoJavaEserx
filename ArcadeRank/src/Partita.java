import java.util.UUID;

public class Partita {
    private Player player;
    private Game game;
    private int score;

    public Partita(Player player, Game game, int score) {
        this.player = player;
        this.game = game;
        this.score = score;
    }

    public Game getGame() {
        return game;
    }

    public Player getPlayer() {
        return player;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return player.getNickname() +
                ":" + game.getName();
    }
}
