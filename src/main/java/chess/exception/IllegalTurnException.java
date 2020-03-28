package chess.exception;

public class IllegalTurnException extends IllegalArgumentException {
    public IllegalTurnException(String message) {
        super(message);
    }
}
