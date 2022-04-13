package com.avi.splitwise;

import com.avi.splitwise.services.command.RegisterUserCommand;
import com.avi.splitwise.services.command.UpdateProfileCommand;
import com.avi.splitwise.services.command.registry.CommandRegistry;
import com.avi.splitwise.services.command.registry.CommandRegistryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitwiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);

        RegisterUserCommand registerUserCommand = new RegisterUserCommand();
        UpdateProfileCommand updateProfileCommand = new UpdateProfileCommand();

        CommandRegistry commandRegistry = new CommandRegistryImpl();

        commandRegistry.registerCommand(registerUserCommand);
        commandRegistry.registerCommand(updateProfileCommand);

        String input = "Register vinsmokesanji 003 namisswwaann";
        commandRegistry.executeCommand(input);
    }

}
