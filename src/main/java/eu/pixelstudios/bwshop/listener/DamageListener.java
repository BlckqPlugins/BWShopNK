package eu.pixelstudios.bwshop.listener;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.passive.EntityVillager;
import cn.nukkit.entity.passive.EntityVillagerV1;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import eu.pixelstudios.bwshop.shop.Shop;

public class DamageListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof EntityVillagerV1 || entity instanceof EntityVillager) {
            Entity damager = event.getDamager();
            if (damager instanceof Player && !((Player) damager).isSpectator()) {
                Shop.onMainShop((Player) damager);
            }
            event.setCancelled();
        }
    }
}
