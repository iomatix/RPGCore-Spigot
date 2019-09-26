package iomatix.spigot.RPGCore.Listeners;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import iomatix.spigot.RPGCore.Main;

public class CoreListeners implements Listener {
	public CoreListeners() {
	}
	@EventHandler
	public void onEntityTookDamage(EntityDamageEvent event) {
		if(!event.isCancelled()) {
			
			if(event.getEntity() instanceof LivingEntity){
				final DamageCause cause = event.getCause();
				final LivingEntity entity = (LivingEntity)event.getEntity();
		
			if(cause == DamageCause.BLOCK_EXPLOSION) {
				if(Main.instance.isBlockexplosionEnabled())
				{
					
				 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getBlockexplosionPercent());
					
				}
			}else if(cause == DamageCause.CONTACT)
			{
				if(Main.instance.isContactEnabled())
				{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getContactPercent());
					
				}
			}else if(cause == DamageCause.CRAMMING)
			{
				if(Main.instance.isCrammingEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getCrammingPercent());
				} 
			}
			else if(cause == DamageCause.DRAGON_BREATH)
			{
				if(Main.instance.isDragonbreathEnabled())
				{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getDragonbreathPercent());
				}
			}
			else if(cause == DamageCause.DROWNING)
			{
				 if(Main.instance.isDrowningEnabled())
					{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getDrowningPercent());
					}
			}
			else if(cause == DamageCause.DRYOUT)
			{
				 if(Main.instance.isDryoutEnabled())
					{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getDryoutPercent());
					}
			}
			else if(cause == DamageCause.FALL)
			{
				 if(Main.instance.isFallEnabled())
					{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getFallPercent());
					}
			}
			else if(cause == DamageCause.FALLING_BLOCK)
			{
				 if(Main.instance.isFallingblockEnabled())
					{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getFallingblockPercent());
					} 
			}
			else if(cause == DamageCause.FIRE)
			{
				if(Main.instance.isFireEnabled())
				{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getFirePercent());
				}
			}
			else if(cause == DamageCause.FIRE_TICK)
			{
				 if(Main.instance.isFiretickEnabled())
					{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getFiretickPercent());
					} 
			}
			else if(cause == DamageCause.FLY_INTO_WALL)
			{
				if(Main.instance.isFlyintowallEnabled())
				{
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getFlyintowallPercent());
				}
			}
			else if(cause == DamageCause.HOT_FLOOR)
			{
				 if(Main.instance.isHotfloorEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getHotfloorPercent());
					}
			}
			else if(cause == DamageCause.LAVA)
			{
				 if(Main.instance.isLavaEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getLavaPercent());
					} 
			}
			else if(cause == DamageCause.LIGHTNING)
			{
				if(Main.instance.isLightningEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getLightningPercent());
				}	
			}
			else if(cause == DamageCause.MAGIC)
			{
				 if(Main.instance.isMagicEnabled()){
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getMagicPercent());
					}
			}
			else if(cause == DamageCause.MELTING)
			{
				 if(Main.instance.isMeltingEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getMeltingPercent());
					} 	
			}
			else if(cause == DamageCause.POISON)
			{
				if(Main.instance.isPoisonEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getPoisonPercent());
				} 
			}
			else if(cause == DamageCause.STARVATION)
			{
				if(Main.instance.isStarvationEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getStarvationPercent());
				} 
			}
			else if(cause == DamageCause.SUFFOCATION)
			{
				if(Main.instance.isSuffocationEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getSuffocationPercent());
				} 
			}
			else if(cause == DamageCause.THORNS)
			{
				if(Main.instance.isThornsEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getThornsPercent());
				} 
			}
			else if(cause == DamageCause.VOID)
			{
				if(Main.instance.isVoidEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getVoidPercent());
				} 
			}else if(cause == DamageCause.WITHER) {
				if(Main.instance.isWitherEnabled()) {
					 event.setDamage(event.getDamage()*entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()*Main.instance.getWitherPercent());	
				}
			}


			}
		}
	}
}
