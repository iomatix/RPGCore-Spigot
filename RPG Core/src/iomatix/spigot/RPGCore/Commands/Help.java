package iomatix.spigot.RPGCore.Commands;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Help {
	enum PageType {
		CMDS(1), DONATE(2);

		private int value;
		private static Map<Object, Object> map = new HashMap<>();

		private PageType(int value) {
			this.value = value;
		}

		static {
			for (PageType pageType : PageType.values()) {
				map.put(pageType.value, pageType);
			}
		}

		public static PageType valueOf(int pageType) {
			return (PageType) map.get(pageType);
		}

		public int getValue() {
			return value;
		}
	}

	static void HelpExecute(CommandSender sender, int page) {
		if (page < 1)
			page = 1;

		if (page == PageType.CMDS.getValue()) {

			sender.sendMessage(ChatColor.YELLOW + "| Commands |");
			sender.sendMessage(ChatColor.GOLD + "/rpgcore help [page] " + ChatColor.GREEN + "-> shows help and more detailed information");
			sender.sendMessage(ChatColor.GOLD + "/rpgcore reload " + ChatColor.GREEN + "-> reloads the config file");

		} else if (page == PageType.DONATE.getValue()) {
			sender.sendMessage(ChatColor.YELLOW + "| This plugin is made by " + ChatColor.GOLD + "iomatix"
					+ ChatColor.YELLOW + " |");
			sender.sendMessage(ChatColor.GOLD + "| Donate if you like it |");
			sender.sendMessage(ChatColor.GREEN + "https://www.paypal.me/iomatix");

		} else {

			sender.sendMessage(ChatColor.RED + "This page is empty!");

		}
		sender.sendMessage(ChatColor.DARK_GREEN + "------------ " + ChatColor.GREEN + "RPG Core " + ChatColor.GRAY + "| "
				+ ChatColor.DARK_GREEN + "Page " + ChatColor.GREEN + page + ChatColor.DARK_GREEN + " ------------");
	}

}