package iomatix.spigot.RPGCore;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import iomatix.spigot.RPGCore.Commands.RPGcoreCmdModule;
import iomatix.spigot.RPGCore.Listeners.CoreListeners;
import org.bukkit.ChatColor;


public class Main extends JavaPlugin {

	private boolean drowningEnabled;
	private double drowningPercent;
	private boolean dryoutEnabled;
	private double dryoutPercent;
	private boolean fallEnabled;
	private double fallPercent;
	private boolean fallingblockEnabled;
	private double fallingblockPercent;
	private boolean fireEnabled;
	private double firePercent;
	private boolean firetickEnabled;
	private double firetickPercent;
	private boolean flyintowallEnabled;
	private double flyintowallPercent;
	private boolean hotfloorEnabled;
	private double hotfloorPercent;
	private boolean contactEnabled;
	private double contactPercent;
	private boolean lavaEnabled;
	private double lavaPercent;
	private boolean lightningEnabled;
	private double lightningPercent;
	private boolean meltingEnabled;
	private double meltingPercent;
	private boolean voidEnabled;
	private double voidPercent;
	private boolean starvationEnabled;
	private double starvationPercent;
	private boolean blockexplosionEnabled;
	private double blockexplosionPercent;
	private boolean crammingEnabled;
	private double crammingPercent;
	private boolean dragonbreathEnabled;
	private double dragonbreathPercent;
	private boolean magicEnabled;
	private double magicPercent;
	private boolean poisonEnabled;
	private double poisonPercent;
	private boolean witherEnabled;
	private double witherPercent;
	private boolean thornsEnabled;
	private double thornsPercent;
	private boolean suffocationEnabled;
	private double suffocationPercent;
	
	public static Main instance;
	public FileConfiguration settings;
	public CoreListeners listeners;
	
	@Override
	public void onEnable() {
		instance = this;
		loadConfig();
		registerAllEvents();
		registerAllCommands();
		System.out.println(ChatColor.GRAY +"["+ChatColor.GOLD + "RPGCore"+ ChatColor.GRAY+"] "+ ChatColor.GREEN + "RPG Core Enabled!");
	}

	@Override
	public void onDisable() {
		System.out.println(ChatColor.GRAY +"["+ChatColor.GOLD + "RPGCore"+ ChatColor.GRAY+"] "+ ChatColor.GRAY + "RPG Core Disabled!");
	}
	
	public void ReloadSettings() {
		this.reloadConfig();
		this.loadConfig();
	}
	

	
	
	
	public void registerAllEvents()
	{
		listeners = new CoreListeners();
		getServer().getPluginManager().registerEvents(listeners, this);
	}
	public void registerAllCommands()
	{
		this.getCommand("rpgcore").setExecutor(new RPGcoreCmdModule());
	}
	public void loadConfig() {
		settings = this.getConfig();
		this.loadEnvDamageSettings();

		
	}
	public void loadEnvDamageSettings()
	{
	    String path = "env-damage-settings.";
	    settings.addDefault(path+"drowning", true);
	    settings.addDefault(path+"drowning-percent", 3.0);
	    settings.addDefault(path+"dryout", true);
	    settings.addDefault(path+"dryout-percent", 3.0);
	    settings.addDefault(path+"fall", true);
	    settings.addDefault(path+"fall-percent", 5.0);
	    settings.addDefault(path+"falling-block", true);
	    settings.addDefault(path+"falling-block-percent", 10.0);
	    settings.addDefault(path+"fire", true);
	    settings.addDefault(path+"fire-percent", 5.0);
	    settings.addDefault(path+"fire-tick", true);
	    settings.addDefault(path+"fire-tick-percent", 3.0);
	    settings.addDefault(path+"fly-into-wall", true);
	    settings.addDefault(path+"fly-into-wall-percent", 15.0);
	    settings.addDefault(path+"hot-floor", true);
	    settings.addDefault(path+"hot-floor-percent", 1.0);
	    settings.addDefault(path+"contact", true);
	    settings.addDefault(path+"contact-percent", 2.0);
	    settings.addDefault(path+"lava", true);
	    settings.addDefault(path+"lava-percent", 10.0);
	    settings.addDefault(path+"lightning", true);
	    settings.addDefault(path+"lightning-percent", 15.0);
	    settings.addDefault(path+"melting", true);
	    settings.addDefault(path+"melting-percent", 3.0);
	    settings.addDefault(path+"void", true);
	    settings.addDefault(path+"void-percent", 10.0);
	    settings.addDefault(path+"starvation", true);
	    settings.addDefault(path+"starvation-percent", 1.5);
	    settings.addDefault(path+"block-explosion", true);
	    settings.addDefault(path+"block-explosion-percent", 20.0);
	    settings.addDefault(path+"cramming", true);
	    settings.addDefault(path+"cramming-percent", 2.0);
	    settings.addDefault(path+"dragon-breath", true);
	    settings.addDefault(path+"dragon-breath-percent", 3.5);
	    settings.addDefault(path+"magic", true);
	    settings.addDefault(path+"magic-percent", 3.0);
	    settings.addDefault(path+"poison", true);
	    settings.addDefault(path+"poison-percent", 2.5);
	    settings.addDefault(path+"wither", true);
	    settings.addDefault(path+"wither-percent", 3.5);
	    settings.addDefault(path+"thorns", true);
	    settings.addDefault(path+"thorns-percent", 1.0);
	    settings.addDefault(path+"suffocation", true);
	    settings.addDefault(path+"suffocation-percent", 2.5);
		settings.options().copyDefaults(true);
		this.saveConfig();
		
		this.setDrowningEnabled(settings.getBoolean(path+"drowning"));
		this.setDrowningPercent(settings.getDouble(path+"drowning-percent"));
		this.setDryoutEnabled(settings.getBoolean(path+"dryout"));
		this.setDryoutPercent(settings.getDouble(path+"dryout-percent"));		
		this.setFallEnabled(settings.getBoolean(path+"fall"));
		this.setFallPercent(settings.getDouble(path+"fall-percent"));
		this.setFallingblockEnabled(settings.getBoolean(path+"falling-block"));
		this.setFallingblockPercent(settings.getDouble(path+"falling-block-percent"));
		this.setFireEnabled(settings.getBoolean(path+"fire"));
		this.setFirePercent(settings.getDouble(path+"fire-percent"));
		this.setFiretickEnabled(settings.getBoolean(path+"fire-tick"));
		this.setFiretickPercent(settings.getDouble(path+"fire-tick-percent"));		
		this.setFlyintowallEnabled(settings.getBoolean(path+"fly-into-wall"));
		this.setFlyintowallPercent(settings.getDouble(path+"fly-into-wall-percent"));
		this.setHotfloorEnabled(settings.getBoolean(path+"hot-floor"));
		this.setHotfloorPercent(settings.getDouble(path+"hot-floor-percent"));
		this.setContactEnabled(settings.getBoolean(path+"contact"));
		this.setContactPercent(settings.getDouble(path+"contact-percent"));
		this.setLavaEnabled(settings.getBoolean(path+"lava"));
		this.setLavaPercent(settings.getDouble(path+"lava-percent"));
		this.setLightningEnabled(settings.getBoolean(path+"lightning"));
		this.setLightningPercent(settings.getDouble(path+"lightning-percent"));
		this.setMeltingEnabled(settings.getBoolean(path+"melting"));
		this.setMeltingPercent(settings.getDouble(path+"melting-percent"));
		this.setVoidEnabled(settings.getBoolean(path+"void"));
		this.setVoidPercent(settings.getDouble(path+"void-percent"));
		this.setStarvationEnabled(settings.getBoolean(path+"starvation"));
		this.setStarvationPercent(settings.getDouble(path+"starvation-percent"));
		this.setBlockexplosionEnabled(settings.getBoolean(path+"block-explosion"));
		this.setBlockexplosionPercent(settings.getDouble(path+"block-explosion-percent"));
		this.setCrammingEnabled(settings.getBoolean(path+"cramming"));
		this.setCrammingPercent(settings.getDouble(path+"cramming-percent"));
		this.setDragonbreathEnabled(settings.getBoolean(path+"dragon-breath"));
		this.setDragonbreathPercent(settings.getDouble(path+"dragon-breath-percent"));
		this.setMagicEnabled(settings.getBoolean(path+"magic"));
		this.setMagicPercent(settings.getDouble(path+"magic-percent"));
		this.setPoisonEnabled(settings.getBoolean(path+"poison"));
		this.setPoisonPercent(settings.getDouble(path+"poison-percent"));
		this.setWitherEnabled(settings.getBoolean(path+"wither"));
		this.setWitherPercent(settings.getDouble(path+"wither-percent"));
		this.setThornsEnabled(settings.getBoolean(path+"thorns"));
		this.setThornsPercent(settings.getDouble(path+"thorns-percent"));
		this.setSuffocationEnabled(settings.getBoolean(path+"suffocation"));
		this.setSuffocationPercent(settings.getDouble(path+"suffocation-percent"));
	
	}

	public boolean isDrowningEnabled() {
		return drowningEnabled;
	}

	public void setDrowningEnabled(boolean drowningEnabled) {
		this.drowningEnabled = drowningEnabled;
	}

	public double getDrowningPercent() {
		return drowningPercent;
	}

	public void setDrowningPercent(double drowningPercent) {
		this.drowningPercent = drowningPercent/100;
	}

	public double getDryoutPercent() {
		return dryoutPercent;
	}

	public void setDryoutPercent(double dryoutPercent) {
		this.dryoutPercent = dryoutPercent/100;
	}

	public boolean isDryoutEnabled() {
		return dryoutEnabled;
	}

	public void setDryoutEnabled(boolean dryoutEnabled) {
		this.dryoutEnabled = dryoutEnabled;
	}

	public boolean isFallEnabled() {
		return fallEnabled;
	}

	public void setFallEnabled(boolean fallEnabled) {
		this.fallEnabled = fallEnabled;
	}

	public double getFallPercent() {
		return fallPercent;
	}

	public void setFallPercent(double fallPercent) {
		this.fallPercent = fallPercent/100;
	}

	public boolean isFallingblockEnabled() {
		return fallingblockEnabled;
	}

	public void setFallingblockEnabled(boolean fallingblockEnabled) {
		this.fallingblockEnabled = fallingblockEnabled;
	}

	public double getFallingblockPercent() {
		return fallingblockPercent;
	}

	public void setFallingblockPercent(double fallingblockPercent) {
		this.fallingblockPercent = fallingblockPercent/100;
	}

	public boolean isFireEnabled() {
		return fireEnabled;
	}

	public void setFireEnabled(boolean fireEnabled) {
		this.fireEnabled = fireEnabled;
	}

	public double getFirePercent() {
		return firePercent;
	}

	public void setFirePercent(double firePercent) {
		this.firePercent = firePercent/100;
	}

	public boolean isFiretickEnabled() {
		return firetickEnabled;
	}

	public void setFiretickEnabled(boolean firetickEnabled) {
		this.firetickEnabled = firetickEnabled;
	}

	public double getFiretickPercent() {
		return firetickPercent;
	}

	public void setFiretickPercent(double firetickPercent) {
		this.firetickPercent = firetickPercent/100;
	}

	public boolean isFlyintowallEnabled() {
		return flyintowallEnabled;
	}

	public void setFlyintowallEnabled(boolean flyintowallEnabled) {
		this.flyintowallEnabled = flyintowallEnabled;
	}

	public double getFlyintowallPercent() {
		return flyintowallPercent;
	}

	public void setFlyintowallPercent(double flyintowallPercent) {
		this.flyintowallPercent = flyintowallPercent/100;
	}

	public boolean isHotfloorEnabled() {
		return hotfloorEnabled;
	}

	public void setHotfloorEnabled(boolean hotfloorEnabled) {
		this.hotfloorEnabled = hotfloorEnabled;
	}

	public double getHotfloorPercent() {
		return hotfloorPercent;
	}

	public void setHotfloorPercent(double hotfloorPercent) {
		this.hotfloorPercent = hotfloorPercent/100;
	}

	public boolean isContactEnabled() {
		return contactEnabled;
	}

	public void setContactEnabled(boolean contactEnabled) {
		this.contactEnabled = contactEnabled;
	}

	public double getContactPercent() {
		return contactPercent;
	}

	public void setContactPercent(double contactPercent) {
		this.contactPercent = contactPercent/100;
	}

	public boolean isLavaEnabled() {
		return lavaEnabled;
	}

	public void setLavaEnabled(boolean lavaEnabled) {
		this.lavaEnabled = lavaEnabled;
	}

	public double getLavaPercent() {
		return lavaPercent;
	}

	public void setLavaPercent(double lavaPercent) {
		this.lavaPercent = lavaPercent/100;
	}

	public boolean isLightningEnabled() {
		return lightningEnabled;
	}

	public void setLightningEnabled(boolean lightningEnabled) {
		this.lightningEnabled = lightningEnabled;
	}

	public double getLightningPercent() {
		return lightningPercent;
	}

	public void setLightningPercent(double lightningPercent) {
		this.lightningPercent = lightningPercent/100;
	}

	public boolean isMeltingEnabled() {
		return meltingEnabled;
	}

	public void setMeltingEnabled(boolean meltingEnabled) {
		this.meltingEnabled = meltingEnabled;
	}

	public double getMeltingPercent() {
		return meltingPercent;
	}

	public void setMeltingPercent(double meltingPercent) {
		this.meltingPercent = meltingPercent/100;
	}

	public boolean isVoidEnabled() {
		return voidEnabled;
	}

	public void setVoidEnabled(boolean voidEnabled) {
		this.voidEnabled = voidEnabled;
	}

	public double getVoidPercent() {
		return voidPercent;
	}

	public void setVoidPercent(double voidPercent) {
		this.voidPercent = voidPercent/100;
	}

	public boolean isStarvationEnabled() {
		return starvationEnabled;
	}

	public void setStarvationEnabled(boolean starvationEnabled) {
		this.starvationEnabled = starvationEnabled;
	}

	public double getStarvationPercent() {
		return starvationPercent;
	}

	public void setStarvationPercent(double starvationPercent) {
		this.starvationPercent = starvationPercent/100;
	}

	public boolean isBlockexplosionEnabled() {
		return blockexplosionEnabled;
	}

	public void setBlockexplosionEnabled(boolean blockexplosionEnabled) {
		this.blockexplosionEnabled = blockexplosionEnabled;
	}

	public double getBlockexplosionPercent() {
		return blockexplosionPercent;
	}

	public void setBlockexplosionPercent(double blockexplosionPercent) {
		this.blockexplosionPercent = blockexplosionPercent/100;
	}

	public boolean isCrammingEnabled() {
		return crammingEnabled;
	}

	public void setCrammingEnabled(boolean crammingEnabled) {
		this.crammingEnabled = crammingEnabled;
	}

	public double getCrammingPercent() {
		return crammingPercent;
	}

	public void setCrammingPercent(double crammingPercent) {
		this.crammingPercent = crammingPercent/100;
	}

	public boolean isDragonbreathEnabled() {
		return dragonbreathEnabled;
	}

	public void setDragonbreathEnabled(boolean dragonbreathEnabled) {
		this.dragonbreathEnabled = dragonbreathEnabled;
	}

	public double getDragonbreathPercent() {
		return dragonbreathPercent;
	}

	public void setDragonbreathPercent(double dragonbreathPercent) {
		this.dragonbreathPercent = dragonbreathPercent/100;
	}

	public boolean isMagicEnabled() {
		return magicEnabled;
	}

	public void setMagicEnabled(boolean magicEnabled) {
		this.magicEnabled = magicEnabled;
	}

	public double getMagicPercent() {
		return magicPercent;
	}

	public void setMagicPercent(double magicPercent) {
		this.magicPercent = magicPercent/100;
	}

	public boolean isPoisonEnabled() {
		return poisonEnabled;
	}

	public void setPoisonEnabled(boolean poisonEnabled) {
		this.poisonEnabled = poisonEnabled;
	}

	public double getPoisonPercent() {
		return poisonPercent;
	}

	public void setPoisonPercent(double poisonPercent) {
		this.poisonPercent = poisonPercent/100;
	}

	public boolean isWitherEnabled() {
		return witherEnabled;
	}

	public void setWitherEnabled(boolean witherEnabled) {
		this.witherEnabled = witherEnabled;
	}

	public double getWitherPercent() {
		return witherPercent;
	}

	public void setWitherPercent(double witherPercent) {
		this.witherPercent = witherPercent/100;
	}

	public boolean isThornsEnabled() {
		return thornsEnabled;
	}

	public void setThornsEnabled(boolean thornsEnabled) {
		this.thornsEnabled = thornsEnabled;
	}

	public double getThornsPercent() {
		return thornsPercent;
	}

	public void setThornsPercent(double thornsPercent) {
		this.thornsPercent = thornsPercent/100;
	}

	public boolean isSuffocationEnabled() {
		return suffocationEnabled;
	}

	public void setSuffocationEnabled(boolean suffocationEnabled) {
		this.suffocationEnabled = suffocationEnabled;
	}

	public double getSuffocationPercent() {
		return suffocationPercent;
	}

	public void setSuffocationPercent(double suffocationPercent) {
		this.suffocationPercent = suffocationPercent/100;
	}

}
