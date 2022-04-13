package com.avi.splitwise.services.command;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpdateProfileCommand implements Command{
    private static final int size = 3;
    @Override
    public boolean matches(String input) {
        //u1 UpdateProfile robinchwan
        List<String> inputs = Arrays.stream(input.split("\\s")).collect(Collectors.toList());
        if(inputs.size()==size && inputs.get(1).equals(CommandKeywords.UpdateProfileCommand))
            return true;
        return false;
    }

    @Override
    public void execute(String input) {

    }
}
