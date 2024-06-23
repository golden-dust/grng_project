package com.blnk.grng.command;

import org.springframework.ui.Model;

public interface Command {
	
	public int execute(Model model);

}
