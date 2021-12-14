package com.tc.webapp01.controller;

import java.util.HashMap;
import java.util.Map;

import com.tc.webapp01.controller.imp.*;

public final class CommandProvider {
	private final Map<String, Command> commands = new HashMap<String, Command>();

	public CommandProvider() {
		commands.put("logination", new GoToLoginPageCommand());
		commands.put("registration", new GoToRegPageCommand());
		commands.put("main", new GoToIndexPageCommand());
		commands.put("login", new LoginationCommand());
		commands.put("register", new RegistrationCommand());
		commands.put("GO_TO_NEWHELLOPAGE", new GoToNewHelloPage());
		commands.put("GO_TO_MAINPAGE", new GoToMainPage());
	}
	
	public final Command getCommand(String commandName) {
		Command command = commands.get(commandName);
		return command;
	}
}
