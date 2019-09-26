package iomatix.spigot.RPGCore.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import iomatix.spigot.RPGCore.Commands.Reload;
import iomatix.spigot.RPGCore.Commands.Help;

public class RPGcoreCmdModule implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (args.length < 1) {
			Help.HelpExecute(sender, Help.PageType.DONATE.getValue());
			return false;
		}

		if (args[0].equalsIgnoreCase("help")) {
			int page = 0;
			if (args.length > 1 && Integer.valueOf(args[1]) != null)
				page = Integer.valueOf(args[1]);
			Help.HelpExecute(sender, page);
			return false;
		}
		if (args[0].equalsIgnoreCase("reload")) {
			Reload.ReloadExecute(sender);
		}
		return false;
	}

}
