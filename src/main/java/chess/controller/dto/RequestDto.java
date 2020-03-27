package chess.controller.dto;

import chess.domain.Command;

public class RequestDto {

    private final Command command;

    private RequestDto(Command command) {
        this.command = command;
    }

    public static RequestDto of(Command command) {
        return new RequestDto(command);
    }

    public Command getCommand() {
        return command;
    }
}
