package chess.controller.dto;

import chess.domain.board.position.Position;

import java.util.Map;

public class ResponseDto {
    Map<Position, String> boardDto;

    public ResponseDto(Map<Position, String> boardDto) {
        this.boardDto = boardDto;
    }

    public Map<Position, String> getBoardDto() {
        return boardDto;
    }
}
