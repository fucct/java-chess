package chess.domain;

import chess.domain.state.ChessGameState;

import java.util.function.UnaryOperator;

public enum Command {
    START(ChessGameState::start),
    END(ChessGameState::end);

    UnaryOperator<ChessGameState> operator;

    Command(UnaryOperator<ChessGameState> operator) {
        this.operator = operator;
    }

    public boolean isSameCommand(String userInput) {
        return this.toString().equals(userInput.toUpperCase());
    }

    public ChessGameState run(ChessGameState state) {
        return operator.apply(state);
    }
}
