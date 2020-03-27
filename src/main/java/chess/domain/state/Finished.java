package chess.domain.state;

import chess.controller.dto.ResponseDto;

public class Finished extends Started {
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
