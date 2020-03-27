package chess.domain.board.position;

import java.util.Arrays;

public class Position {
    File file;
    Rank rank;

    public Position(File file, Rank rank) {
        this.file = file;
        this.rank = rank;
    }

    public static Position of(String key) {
        return Arrays.stream(File.values())
                .flatMap(file ->
                        Arrays.stream(Rank.values())
                                .filter(rank -> (file.toString() + rank.toString()).equals(key.toUpperCase()))
                                .map((rank) -> new Position(file, rank))
                )
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }
}
