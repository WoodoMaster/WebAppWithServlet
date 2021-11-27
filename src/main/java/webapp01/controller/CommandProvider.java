package webapp01.controller;





import webapp01.controller.imp.*;

import java.util.HashMap;
import java.util.Map;

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
