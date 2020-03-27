package chess.view;

import chess.controller.dto.ResponseDto;
import chess.domain.board.position.File;
import chess.domain.board.position.Position;
import chess.domain.board.position.Rank;

import java.util.Map;

public class OutputView {
    public static void printGameStartMessage() {
        System.out.println("체스 게임을 시작합니다.");
        System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요.");
    }

    public static void printResponse(ResponseDto responseDto) {
        Map<Position, String> boardDto = responseDto.getBoardDto();

        System.out.println();
        for (Rank rank : Rank.values()) {
            for (File file : File.values()) {
                String piece = boardDto.entrySet()
                        .stream()
                        .filter(entry -> {
                            Position position = entry.getKey();
                            return position.getFile() == file && position.getRank() == rank;
                        })
                        .map(Map.Entry::getValue)
                        .findAny()
                        .orElse("[]");
                System.out.print("[" + piece + "]");
            }
            System.out.println();
        }
    }

    public static void printErrorMessage(Exception exception) {
        System.out.println(exception.getMessage());
    }
}