package iomatix.spigot.RPGCore.Listeners;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;

import iomatix.spigot.RPGCore.Main;

public class CoreListeners implements Listener {
	public CoreListeners() {
	}

	@EventHandler
	public void onEntityTookDamage(EntityDamageEvent event) {
		if (!event.isCancelled()) {

			if (event.getEntity() instanceof LivingEntity) {
				final DamageCause cause = event.getCause();
				final LivingEntity entity = (LivingEntity) event.getEntity();

				if (cause == DamageCause.BLOCK_EXPLOSION) {
					if (Main.instance.damageModule.isBlockexplosionEnabled()) {

						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getBlockexplosionPercent());

					}
				} else if (cause == DamageCause.CONTACT) {
					if (Main.instance.damageModule.isContactEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getContactPercent());

					}
				} else if (cause == DamageCause.CRAMMING) {
					if (Main.instance.damageModule.isCrammingEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getCrammingPercent());
					}
				} else if (cause == DamageCause.DRAGON_BREATH) {
					if (Main.instance.damageModule.isDragonbreathEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getDragonbreathPercent());
					}
				} else if (cause == DamageCause.DROWNING) {
					if (Main.instance.damageModule.isDrowningEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getDrowningPercent());
					}
				} else if (cause == DamageCause.DRYOUT) {
					if (Main.instance.damageModule.isDryoutEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getDryoutPercent());
					}
				} else if (cause == DamageCause.FALL) {
					if (Main.instance.damageModule.isFallEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getFallPercent());
					}
				} else if (cause == DamageCause.FALLING_BLOCK) {
					if (Main.instance.damageModule.isFallingblockEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getFallingblockPercent());
					}
				} else if (cause == DamageCause.FIRE) {
					if (Main.instance.damageModule.isFireEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getFirePercent());
					}
				} else if (cause == DamageCause.FIRE_TICK) {
					if (Main.instance.damageModule.isFiretickEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getFiretickPercent());
					}
				} else if (cause == DamageCause.FLY_INTO_WALL) {
					if (Main.instance.damageModule.isFlyintowallEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getFlyintowallPercent());
					}
				} else if (cause == DamageCause.HOT_FLOOR) {
					if (Main.instance.damageModule.isHotfloorEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getHotfloorPercent());
					}
				} else if (cause == DamageCause.LAVA) {
					if (Main.instance.damageModule.isLavaEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getLavaPercent());
					}
				} else if (cause == DamageCause.LIGHTNING) {
					if (Main.instance.damageModule.isLightningEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getLightningPercent());
					}
				} else if (cause == DamageCause.MAGIC) {
					if (Main.instance.damageModule.isMagicEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getMagicPercent());
					}
				} else if (cause == DamageCause.MELTING) {
					if (Main.instance.damageModule.isMeltingEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getMeltingPercent());
					}
				} else if (cause == DamageCause.POISON) {
					if (Main.instance.damageModule.isPoisonEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getPoisonPercent());
					}
				} else if (cause == DamageCause.STARVATION) {
					if (Main.instance.damageModule.isStarvationEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getStarvationPercent());
					}
				} else if (cause == DamageCause.SUFFOCATION) {
					if (Main.instance.damageModule.isSuffocationEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getSuffocationPercent());
					}
				} else if (cause == DamageCause.THORNS) {
					if (Main.instance.damageModule.isThornsEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getThornsPercent());
					}
				} else if (cause == DamageCause.VOID) {
					if (Main.instance.damageModule.isVoidEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getVoidPercent());
					}
				} else if (cause == DamageCause.WITHER) {
					if (Main.instance.damageModule.isWitherEnabled()) {
						event.setDamage(event.getDamage() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.damageModule.getWitherPercent());
					}
				}

			}
		}
	}

	@EventHandler
	public void onEntityHealing(EntityRegainHealthEvent event) {
		if (!event.isCancelled()) {
			if (event.getEntity() instanceof LivingEntity) {
				final RegainReason cause = event.getRegainReason();
				final LivingEntity entity = (LivingEntity) event.getEntity();
				if (cause == RegainReason.CUSTOM) {
					if (Main.instance.healingModule.isCustomEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getCustomPercent());

					}
				} else if (cause == RegainReason.EATING) {
					if (Main.instance.healingModule.isEatingEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getEatingPercent());

					}
				} else if (cause == RegainReason.ENDER_CRYSTAL) {
					if (Main.instance.healingModule.isEndercrystalEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getEndercrystalPercent());

					}
				} else if (cause == RegainReason.MAGIC) {
					if (Main.instance.healingModule.isMagicEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getMagicPercent());

					}
				} else if (cause == RegainReason.MAGIC_REGEN) {
					if (Main.instance.healingModule.isMagicregenEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getMagicregenPercent());

					}
				} else if (cause == RegainReason.REGEN) {
					if (Main.instance.healingModule.isRegenEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getRegenPercent());

					}
				} else if (cause == RegainReason.SATIATED) {
					if (Main.instance.healingModule.isSatiatedEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getSatiatedPercent());

					}
				} else if (cause == RegainReason.WITHER) {
					if (Main.instance.healingModule.isWitherEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getWitherPercent());

					}
				} else if (cause == RegainReason.WITHER_SPAWN) {
					if (Main.instance.healingModule.isWitherspawnEnabled()) {

						event.setAmount(event.getAmount() * entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
								* Main.instance.healingModule.getWitherspawnPercent());

					}

				}
			}
		}
	}
}
