import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class Game {
    private UUID id;
    private String name;
    private int difficulty;

    Game(String name, int difficulty) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.difficulty = difficulty;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
