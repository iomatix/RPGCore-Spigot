package iomatix.spigot.RPGCore;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import iomatix.spigot.RPGCore.Commands.RPGcoreCmdModule;
import iomatix.spigot.RPGCore.Listeners.CoreListeners;
import iomatix.spigot.RPGCore.ScalingModule.DamageModule;
import iomatix.spigot.RPGCore.ScalingModule.HealingModule;

import org.bukkit.ChatColor;

public class Main extends JavaPlugin {

	
	


	public static Main instance;
	public FileConfiguration settings;
	public CoreListeners listeners;
	public DamageModule damageModule;
	public HealingModule healingModule;

	@Override
	public void onEnable() {
		instance = this;
		loadConfig();
		registerAllEvents();
		registerAllCommands();
		System.out.println(ChatColor.GRAY + "[" + ChatColor.GOLD + "RPGCore" + ChatColor.GRAY + "] " + ChatColor.GREEN
				+ "RPG Core Enabled!");
	}

	@Override
	public void onDisable() {
		System.out.println(ChatColor.GRAY + "[" + ChatColor.GOLD + "RPGCore" + ChatColor.GRAY + "] " + ChatColor.GRAY
				+ "RPG Core Disabled!");
	}

	public void ReloadSettings() {
		this.reloadConfig();
		this.loadConfig();
	}

	public void registerAllEvents() {
		listeners = new CoreListeners();
		getServer().getPluginManager().registerEvents(listeners, this);
	}

	public void registerAllCommands() {
		this.getCommand("rpgcore").setExecutor(new RPGcoreCmdModule());
	}

	public void loadConfig() {
		settings = this.getConfig();
		this.damageModule = new DamageModule();
		this.healingModule = new HealingModule();
		

	}




}
