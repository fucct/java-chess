package chess.controller.dto;

import chess.domain.Command;

import java.util.List;

public class RequestDto {

    private final Command command;
    private final List<String> parameters;

    private RequestDto(Command command, List<String> parameters) {
        this.command = command;
        this.parameters = parameters;
    }

    public static RequestDto of(Command command) {
        return new RequestDto(command, null);
    }

    public static RequestDto of(Command command, List<String> parameters) {
        return new RequestDto(command, parameters);
    }


    public Command getCommand() {
        return command;
    }

    public List<String> getParameters() {
        return parameters;
    }
}
