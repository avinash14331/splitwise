package com.avi.splitwise.services.command;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RegisterUserCommand implements Command{
    private static final int size = 4;
    @Override
    public boolean matches(String input) {
        // Register vinsmokesanji 003 namisswwaann
        List<String> inputs = Arrays.stream(input.split("\\s")).collect(Collectors.toList());
        if(inputs.size()==size && inputs.get(0).equals(CommandKeywords.RegisterUserCommand))
            return true;
        return false;
    }

    @Override
    public void execute(String input) {
        System.out.println("Registering");
    }
}
