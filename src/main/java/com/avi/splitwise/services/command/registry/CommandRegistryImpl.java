package com.avi.splitwise.services.command.registry;

import com.avi.splitwise.services.command.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistryImpl implements CommandRegistry{
    List<Command> registeredCommands = new ArrayList<>();
    @Override
    public void registerCommand(Command command) {
        registeredCommands.add(command);
    }

    @Override
    public void executeCommand(String input) {
        for(Command c:registeredCommands){
            if(c.matches(input)){
                c.execute(input);
                return;
            }
        }
    }
}
