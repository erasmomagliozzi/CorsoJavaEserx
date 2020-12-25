package packageClass;

import java.util.UUID;

public class Partita {
    private UUID idPlayer;
    private UUID idGame;
    private int score;

    public Partita(UUID idPlayer, UUID idGame, int score) {
        this.idPlayer = idPlayer;
        this.idGame = idGame;
        this.score = score;
    }
}
