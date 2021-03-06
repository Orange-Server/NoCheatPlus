package fr.neatmonster.nocheatplus.command.actions;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import fr.neatmonster.nocheatplus.NoCheatPlus;
import fr.neatmonster.nocheatplus.command.NCPCommand;
import fr.neatmonster.nocheatplus.permissions.Permissions;

public class UnKickCommand extends NCPCommand {

	public UnKickCommand(NoCheatPlus plugin) {
		super(plugin, "unkick", Permissions.ADMINISTRATION_UNKICK);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (args.length != 2) return false;
		if (NoCheatPlus.allowLogin(args[1])) sender.sendMessage(TAG + "Allow to login again: " + args[1].trim());
		else sender.sendMessage(TAG + "Was not denied to login: " + args[1].trim());
		return true;
	}

}
