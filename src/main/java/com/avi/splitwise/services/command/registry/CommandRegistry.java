package com.avi.splitwise.services.command.registry;

import com.avi.splitwise.services.command.Command;

public interface CommandRegistry {
    void registerCommand(Command command);
    void executeCommand(String command);
}
