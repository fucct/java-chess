package chess.controller;

import chess.controller.dto.RequestDto;
import chess.controller.dto.ResponseDto;
import chess.domain.ChessGame;
import chess.view.InputView;
import chess.view.OutputView;

public class ChessController {
    public void run() {
        OutputView.printGameStartMessage();
        ChessGame chessGame = ChessGame.newGame();
        while (!chessGame.isEnd()) {
            try {
                RequestDto request = InputView.inputRequest();
                ResponseDto responseDto = chessGame.play(request);
                OutputView.printResponse(responseDto);
            } catch (Exception e) {
                continue;
            }
        }
    }
}
