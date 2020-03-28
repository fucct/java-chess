package chess.domain;

import chess.domain.state.ChessGameState;

import java.util.List;
import java.util.function.UnaryOperator;

public enum Command {
    START(ChessGameState::start),
    END(ChessGameState::end),
    MOVE(null);

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

    public ChessGameState move(ChessGameState state, List<String> parameters) {
        return state.move(parameters);
    }

//    public ChessGameState run(ChessGameState state, List<String> parameters) {
//        if (this != MOVE) {
//            throw new IllegalCommandException("올바르지 않은 명령어 입니다.");
//        }
//        return state.move(parameters);
//    }
}
