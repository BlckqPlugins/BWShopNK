package eu.pixelstudios.bwshop.listener;

import cn.nukkit.Player;
import cn.nukkit.block.BlockSandstone;
import cn.nukkit.event.Listener;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import com.nukkitx.fakeinventories.FakeInventoriesListener;
import com.nukkitx.fakeinventories.inventory.FakeInventoryListener;
import com.nukkitx.fakeinventories.inventory.FakeSlotChangeEvent;
import eu.pixelstudios.bwshop.shop.Shop;

public class ShopListener implements Listener {

    public static Integer count(Player player, int itemID){
        int all = 0;
        Inventory inventory = player.getInventory();
        for (Item item : inventory.getContents().values()){
            if (item.getId() == itemID){
                int c = item.getCount();
                all = all + c;
            }
        }
        return all;
    }

    public static void buyItem(Player player, Item item){
        if (item.getNamedTag().contains("i")){
            Item needed = Item.get(ItemID.IRON_INGOT);
            if (count(player, needed.getId()) >= item.getNamedTag().getInt("i")){
                player.getInventory().removeItem(Item.get(Item.IRON_INGOT, 0, item.getNamedTag().getInt("i")));

                item.clearCustomName();

                if (item.getNamedTag().contains("itemnametag")){
                    item.setCustomName(item.getNamedTag().getString("itemnametag"));
                }

                player.getInventory().addItem(item);
                player.sendMessage("§aYou have bought §e" + item.getName() + " x" + item.getCount() + "§7.");
            } else {
                player.sendMessage("§cYou don't have enough iron.");
            }
        } else if (item.getNamedTag().contains("b")){
            Item needed = Item.get(ItemID.BRICK);

            if (item.getBlock() instanceof BlockSandstone){
                if (item.getNamedTag().getInt("b") == 8) {
                    if (count(player, needed.getId()) > item.getNamedTag().getInt("b")) {
                        item.setCount(item.getNamedTag().getInt("b") * 4);
                        player.getInventory().removeItem(Item.get(Item.BRICK, 0, item.getNamedTag().getInt("b")));

                        item.clearCustomName();

                        if (item.getNamedTag().contains("itemnametag")){
                            item.setCustomName(item.getNamedTag().getString("itemnametag"));
                        }

                        player.getInventory().addItem(item);
                        player.sendMessage("§aYou have bought §e" + item.getName() + " x" + item.getCount() + "§7.");
                    } else if (count(player, needed.getId()) > 0) {
                        item.setCount(count(player, needed.getId()) * 4);
                        player.getInventory().removeItem(Item.get(Item.BRICK, 0, item.getNamedTag().getInt("b")));

                        item.clearCustomName();

                        if (item.getNamedTag().contains("itemnametag")){
                            item.setCustomName(item.getNamedTag().getString("itemnametag"));
                        }

                        player.getInventory().addItem(item);
                        player.sendMessage("§aYou have bought §e" + item.getName() + " x" + item.getCount() + "§7.");
                    } else player.sendMessage("§cYou don't have enough bronze.");
                } else if (item.getNamedTag().getInt("b") == 1){
                    if (count(player, needed.getId()) >= item.getNamedTag().getInt("b")) {
                        item.setCount(item.getNamedTag().getInt("b") * 4);
                        player.getInventory().removeItem(Item.get(Item.BRICK, 0, item.getNamedTag().getInt("b")));

                        item.clearCustomName();

                        if (item.getNamedTag().contains("itemnametag")){
                            item.setCustomName(item.getNamedTag().getString("itemnametag"));
                        }

                        player.getInventory().addItem(item);
                        player.sendMessage("§aYou have bought §e" + item.getName() + " x" + item.getCount() + "§7.");
                    } else player.sendMessage("§cYou don't have enough bronze.");
                }
                return;
            }

            if (count(player, needed.getId()) >= item.getNamedTag().getInt("b")){
                player.getInventory().removeItem(Item.get(Item.BRICK, 0, item.getNamedTag().getInt("b")));

                item.clearCustomName();

                if (item.getNamedTag().contains("itemnametag")){
                    item.setCustomName(item.getNamedTag().getString("itemnametag"));
                }

                player.getInventory().addItem(item);
                player.sendMessage("§aYou have bought §e" + item.getName() + " x" + item.getCount() + "§7.");
            } else {
                player.sendMessage("§cYou don't have enough bronze.");
            }
        } else if (item.getNamedTag().contains("g")){
            Item needed = Item.get(ItemID.GOLD_INGOT);
            if (count(player, needed.getId()) >= item.getNamedTag().getInt("g")){
                player.getInventory().removeItem(Item.get(Item.GOLD_INGOT, 0, item.getNamedTag().getInt("g")));

                item.clearCustomName();

                if (item.getNamedTag().contains("itemnametag")){
                    item.setCustomName(item.getNamedTag().getString("itemnametag"));
                }

                player.getInventory().addItem(item);
                player.sendMessage("§aYou have bought §e" + item.getName() + " x" + item.getCount() + "§7.");
            } else {
                player.sendMessage("§cYou don't have enough gold.");
            }
        }
    }

    public static void onShop(FakeSlotChangeEvent event){

        Player player = event.getPlayer();

        if (event.getInventory() == null){
            event.setCancelled();
            return;
        }

        event.setCancelled();

        if (player != null){
            Item clickedItem = event.getAction().getSourceItem();
            if (clickedItem != null){
                if (clickedItem.getNamedTag() == null){
                    return;
                }

                if (clickedItem.getNamedTag().contains("b") || clickedItem.getNamedTag().contains("i") || clickedItem.getNamedTag().contains("g")){
                    buyItem(player, clickedItem);
                } else {
                    if (clickedItem.getCustomName().equals("§eSpeed Shop")){
                        Shop.onOverview(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§eBlocks")){
                        Shop.onBuild(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§ePickaxes")){
                        Shop.onPickaxes(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§eArmors")){
                        Shop.onArmor(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§eSwords")){
                        Shop.onSwords(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§ePotions")){
                        Shop.onPotions(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§eFood")){
                        Shop.onFood(event.getInventory());
                    }

                    if (clickedItem.getCustomName().equals("§eExtras")){
                        Shop.onExtras(event.getInventory());
                    }
                }
            }
        }
    }
}
