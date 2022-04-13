package com.avi.splitwise.services.command;

public interface Command {
    boolean matches(String input);
    void execute(String input);
}
