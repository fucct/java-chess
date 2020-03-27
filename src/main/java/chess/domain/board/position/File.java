package chess.domain.board.position;

public enum File {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);

    private final int file;

    File(int file) {
        this.file = file;
    }

//    public int getFile() {
//        return file;
//    }
}
