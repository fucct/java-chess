package chess.view;

import chess.controller.dto.RequestDto;
import chess.domain.Command;
import chess.exception.IllegalCommandException;

import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static RequestDto inputRequest() {
        System.out.println("명령어를 입력해주세요");
        String userInput = scanner.nextLine();
        Command command = validateCommand(userInput);
        return RequestDto.of(command);
    }

    private static Command validateCommand(String userInput) {
        return Arrays.stream(Command.values())
                .filter(command -> command.isSameCommand(userInput.toUpperCase()))
                .findAny()
                .orElseThrow(() -> new IllegalCommandException("올바르지 않은 명령어 입니다."));
    }
}
