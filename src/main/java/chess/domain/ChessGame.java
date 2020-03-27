package chess.domain;

import chess.controller.dto.RequestDto;
import chess.controller.dto.ResponseDto;
import chess.domain.state.ChessGameState;
import chess.domain.state.Ready;

public class ChessGame {
    private ChessGameState currentState;

    private ChessGame() {
        this.currentState = new Ready();
    }

    public static ChessGame newGame() {
        return new ChessGame();
    }

    public boolean isEnd() {
        return currentState.isEnd();
    }

    public ResponseDto play(RequestDto request) {
        currentState = request.getCommand().run(currentState);
        return currentState.getResponse();
    }
}
