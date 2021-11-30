package com.tc.webapp01.controller;

import java.util.HashMap;
import java.util.Map;

import com.tc.webapp01.controller.imp.GoToIndexPageCommand;
import com.tc.webapp01.controller.imp.GoToRegPageCommand;
import com.tc.webapp01.controller.imp.RegistrationCommand;
import com.tc.webapp01.controller.imp.GoToHelloPage;
import com.tc.webapp01.controller.imp.GoToLoginPageCommand;
import com.tc.webapp01.controller.imp.GoToMainPage;
import com.tc.webapp01.controller.imp.LoginationCommand;

public final class CommandProvider {
	private final Map<String, Command> commands = new HashMap<String, Command>();

	public CommandProvider() {
		commands.put("logination", new GoToLoginPageCommand());
		commands.put("registration", new GoToRegPageCommand());
		commands.put("main", new GoToIndexPageCommand());
		commands.put("login", new LoginationCommand());
		commands.put("register", new RegistrationCommand());
		commands.put("GO_TO_HELLOPAGE", new GoToHelloPage());
		commands.put("GO_TO_MAINPAGE", new GoToMainPage());
	}
	
	public final Command getCommand(String commandName) {
		Command command = commands.get(commandName);
		return command;
	}
}
