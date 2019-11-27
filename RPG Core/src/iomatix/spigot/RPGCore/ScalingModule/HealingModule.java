package iomatix.spigot.RPGCore.ScalingModule;

import org.bukkit.configuration.file.FileConfiguration;

import iomatix.spigot.RPGCore.Main;

public class HealingModule {
	private boolean customEnabled;
	private double customPercent;
	private boolean eatingEnabled;
	private double eatingPercent;
	private boolean endercrystalEnabled;
	private double endercrystalPercent;
	private boolean magicEnabled;
	private double magicPercent;
	private boolean magicregenEnabled;
	private double magicregenPercent;
	private boolean regenEnabled;
	private double regenPercent;
	private boolean satiatedEnabled;
	private double satiatedPercent;
	private boolean witherEnabled;
	private double witherPercent;
	private boolean witherspawnEnabled;
	private double witherspawnPercent;
	public HealingModule(){
		
		loadHealingSettings(Main.instance.getConfig());	
	}
	public void loadHealingSettings(FileConfiguration settings) {
		String path = "regen-settings.";
		settings.addDefault(path + "custom", false);
		settings.addDefault(path + "custom-percent", 0.0);
		settings.addDefault(path + "eating", true);
		settings.addDefault(path + "eating-percent", 5.0);
		settings.addDefault(path + "ender-crystal", true);
		settings.addDefault(path + "ender-crystal-percent", 15.0);
		settings.addDefault(path + "magic", true);
		settings.addDefault(path + "magic-percent", 5.0);
		settings.addDefault(path + "magic-regen", true);
		settings.addDefault(path + "magic-regen-percent", 3.5);
		settings.addDefault(path + "regen", true);
		settings.addDefault(path + "regen-percent", 3.5);
		settings.addDefault(path + "satiated", true);
		settings.addDefault(path + "satiated-percent", 3.0);
		settings.addDefault(path + "wither", true);
		settings.addDefault(path + "wither-percent", 3.0);
		settings.addDefault(path + "wither-spawn", true);
		settings.addDefault(path + "wither-spawn-percent", 3.5);

		settings.options().copyDefaults(true);
		Main.instance.saveConfig();
		
		this.setCustomEnabled(settings.getBoolean(path + "custom"));
		this.setCustomPercent(settings.getDouble(path + "custom-percent"));
		
		this.setEatingEnabled(settings.getBoolean(path + "eating"));
		this.setEatingPercent(settings.getDouble(path + "eating-percent"));
		this.setEndercrystalEnabled(settings.getBoolean(path + "ender-crystal"));
		this.setEndercrystalPercent(settings.getDouble(path + "ender-crystal-percent"));
		this.setMagicEnabled(settings.getBoolean(path + "magic"));
		this.setMagicPercent(settings.getDouble(path + "magic-percent"));
		this.setMagicregenEnabled(settings.getBoolean(path + "magic-regen"));
		this.setMagicregenPercent(settings.getDouble(path + "magic-regen-percent"));
		this.setRegenEnabled(settings.getBoolean(path + "regen"));
		this.setRegenPercent(settings.getDouble(path + "regen-percent"));
		this.setSatiatedEnabled(settings.getBoolean(path + "satiated"));
		this.setSatiatedPercent(settings.getDouble(path + "satiated-percent"));
		this.setWitherEnabled(settings.getBoolean(path + "wither"));
		this.setWitherPercent(settings.getDouble(path + "wither-percent"));
		this.setWitherspawnEnabled(settings.getBoolean(path + "wither-spawn"));
		this.setWitherspawnPercent(settings.getDouble(path + "wither-spawn-percent"));
	}
	
	public boolean isCustomEnabled() {
		return customEnabled;
	}
	public void setCustomEnabled(boolean customEnabled) {
		this.customEnabled = customEnabled;
	}
	public double getCustomPercent() {
		return customPercent;
	}
	public void setCustomPercent(double customPercent) {
		this.customPercent = customPercent / 100;
	}
	public boolean isEatingEnabled() {
		return eatingEnabled;
	}
	public void setEatingEnabled(boolean eatingEnabled) {
		this.eatingEnabled = eatingEnabled;
	}
	public double getEatingPercent() {
		return eatingPercent;
	}
	public void setEatingPercent(double eatingPercent) {
		this.eatingPercent = eatingPercent / 100;
	}
	public boolean isEndercrystalEnabled() {
		return endercrystalEnabled;
	}
	public void setEndercrystalEnabled(boolean endercrystalEnabled) {
		this.endercrystalEnabled = endercrystalEnabled;
	}
	public double getEndercrystalPercent() {
		return endercrystalPercent;
	}
	public void setEndercrystalPercent(double endercrystalPercent) {
		this.endercrystalPercent = endercrystalPercent / 100;
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
		this.magicPercent = magicPercent / 100;
	}
	public boolean isMagicregenEnabled() {
		return magicregenEnabled;
	}
	public void setMagicregenEnabled(boolean magicregenEnabled) {
		this.magicregenEnabled = magicregenEnabled;
	}
	public double getMagicregenPercent() {
		return magicregenPercent;
	}
	public void setMagicregenPercent(double magicregenPercent) {
		this.magicregenPercent = magicregenPercent / 100;
	}
	public boolean isRegenEnabled() {
		return regenEnabled;
	}
	public void setRegenEnabled(boolean regenEnabled) {
		this.regenEnabled = regenEnabled;
	}
	public double getRegenPercent() {
		return regenPercent;
	}
	public void setRegenPercent(double regenPercent) {
		this.regenPercent = regenPercent / 100;
	}
	public boolean isSatiatedEnabled() {
		return satiatedEnabled;
	}
	public void setSatiatedEnabled(boolean satiatedEnabled) {
		this.satiatedEnabled = satiatedEnabled;
	}
	public double getSatiatedPercent() {
		return satiatedPercent;
	}
	public void setSatiatedPercent(double satiatedPercent) {
		this.satiatedPercent = satiatedPercent / 100;
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
		this.witherPercent = witherPercent / 100;
	}
	public boolean isWitherspawnEnabled() {
		return witherspawnEnabled;
	}
	public void setWitherspawnEnabled(boolean witherspawnEnabled) {
		this.witherspawnEnabled = witherspawnEnabled;
	}
	public double getWitherspawnPercent() {
		return witherspawnPercent;
	}
	public void setWitherspawnPercent(double witherspawnPercent) {
		this.witherspawnPercent = witherspawnPercent / 100;
	}
}
