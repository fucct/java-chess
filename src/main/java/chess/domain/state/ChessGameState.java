package chess.domain.state;

import chess.controller.dto.ResponseDto;
import chess.exception.IllegalCommandException;

import java.util.List;

public interface ChessGameState {

    boolean isEnd();

    ChessGameState start();

    ChessGameState move(List<String> parameters);

    ChessGameState end();

    default void exception() {
        throw new IllegalCommandException("올바르지 않은 명령어 입니다.");
    }

    ResponseDto getResponse();
}
