package iomatix.spigot.RPGCore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import iomatix.spigot.RPGCore.Main;

public class Reload {

	static void ReloadExecute(CommandSender sender) {
		Main.instance.ReloadSettings();
		sender.sendMessage(ChatColor.GREEN + "RPG Core reloaded !");
	}

}
