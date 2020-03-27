package chess.domain.state;

import chess.controller.dto.ResponseDto;
import chess.domain.board.Board;

public class Finished extends Started {
    private final Board board;

    public Finished(Board board, Board board1) {
        super(board);
        this.board = board1;
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public ChessGameState start() {
        return null;
    }

    @Override
    public ChessGameState end() {
        return null;
    }

    @Override
    public ResponseDto getResponse() {
        return null;
    }
}
