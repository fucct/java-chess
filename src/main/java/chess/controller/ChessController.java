package chess.controller;

import chess.controller.dto.RequestDto;
import chess.controller.dto.ResponseDto;
import chess.domain.ChessGame;
import chess.domain.MoveParameter;
import chess.domain.board.Board;
import chess.domain.position.Position;
import chess.view.InputView;
import chess.view.OutputView;

import java.util.Map;
import java.util.stream.Collectors;

public class ChessController {
    private ChessGame chessGame = new ChessGame();

    public void run() {
        OutputView.printInitialMessage();
        while (!chessGame.isEnd()) {
            try {
                RequestDto requestDto = InputView.inputRequest();
                switch (requestDto.getCommand()) {
                    case START:
                        chessGame.start();
                        Board board = chessGame.getBoard();
                        ResponseDto responseDto = ResponseDto.of(createBoardDto(board));
                        OutputView.printResponse(responseDto);
                        break;
                    case END:
                        chessGame.end();
                        OutputView.printStatus(chessGame.getStatus());
                        OutputView.printWinner(chessGame.getWinner());
                        break;
                    case MOVE:
                        chessGame.move(MoveParameter.of(requestDto.getParameter()));
                        if (chessGame.isEnd()) {
                            OutputView.printWinner(chessGame.getWinner());
                            break;
                        }
                        chessGame.move(MoveParameter.of(requestDto.getParameter()));

                        board = chessGame.getBoard();

                    case STATUS:
                        chessGame.status();
                        OutputView.printStatus(chessGame.getStatus());
                        break;
                    case UNKNOWN:
                        throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Map<Position, String> createBoardDto(Board board) {
        return board.getBoard()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().getFigure()
                ));
    }
}
