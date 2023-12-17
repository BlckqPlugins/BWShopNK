package eu.pixelstudios.bwshop;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.service.RegisteredServiceProvider;
import com.nukkitx.fakeinventories.inventory.FakeInventories;
import eu.pixelstudios.bwshop.listener.DamageListener;
import eu.pixelstudios.bwshop.listener.ShopListener;
import eu.pixelstudios.bwshop.shop.Shop;

import java.util.Objects;

public class Main extends PluginBase {

    public static RegisteredServiceProvider<FakeInventories> provider = null;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new DamageListener(), this);

        provider = getServer().getServiceManager().getProvider(FakeInventories.class);

        if (provider == null || provider.getProvider() == null) {
            this.getServer().getPluginManager().disablePlugin(this);
        }

        this.getServer().getPluginManager().registerEvents(new ShopListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}