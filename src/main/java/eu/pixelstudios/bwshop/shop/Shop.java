package eu.pixelstudios.bwshop.shop;

import cn.nukkit.Player;
import cn.nukkit.block.BlockID;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.potion.Potion;
import cn.nukkit.utils.DyeColor;
import com.nukkitx.fakeinventories.inventory.ChestFakeInventory;
import eu.pixelstudios.bwshop.listener.ShopListener;

public class Shop {

    public static void onMainShop(Player player){
        ChestFakeInventory inventory = new ChestFakeInventory();
        inventory.setName("§l§dBedwars Shop");

        player.getCursorInventory().clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item sandstone = Item.get(BlockID.SANDSTONE, 0, 32);
        sandstone.setCustomName("§e32x §fSandstone §c8 Bronze");
        sandstone.setNamedTag(sandstone.getNamedTag().putInt("b", 8));

        Item stick = Item.get(ItemID.STICK, 0, 1);
        stick.setCustomName("§e1x §fStick §c8 Bronze");
        stick.setNamedTag(stick.getNamedTag().putInt("b", 8));
        stick.addEnchantment(Enchantment.get(Enchantment.ID_KNOCKBACK).setLevel(1));

        Item pickaxe = Item.get(ItemID.WOODEN_PICKAXE, 0, 1);
        pickaxe.setCustomName("§e1x §fWooden Pickaxe §c4 Bronze");
        pickaxe.setNamedTag(pickaxe.getNamedTag().putInt("b", 4));

        Item swordLV1 = Item.get(ItemID.GOLDEN_SWORD, 0, 1);
        swordLV1.setCustomName("§e1x §fSword - Lvl1 §71 Iron");
        swordLV1.addEnchantment(Enchantment.get(9).setLevel(1));
        swordLV1.setNamedTag(swordLV1.getNamedTag().putInt("i", 1));

        Item helmet = Item.get(ItemID.LEATHER_CAP, 0, 1);
        helmet.setCustomName("§e1x §fHelmet §c1 Bronze");
        helmet.setNamedTag(helmet.getNamedTag().putInt("b", 1));

        Item armorLV1 = Item.get(ItemID.CHAIN_CHESTPLATE, 0, 1);
        armorLV1.setCustomName("§e1x §fArmor - Lvl1 §71 Iron");
        armorLV1.setNamedTag(armorLV1.getNamedTag().putInt("i", 1));
        armorLV1.addEnchantment(Enchantment.get(Enchantment.ID_PROTECTION_ALL).setLevel(1));

        Item leggins = Item.get(ItemID.LEATHER_PANTS, 0, 1);
        leggins.setCustomName("§e1x §fLeggings §c1 Bronze");
        leggins.setNamedTag(leggins.getNamedTag().putInt("b", 1));

        Item boots = Item.get(ItemID.LEATHER_BOOTS, 0, 1);
        boots.setCustomName("§e1x §fBoots §c1 Bronze");
        boots.setNamedTag(boots.getNamedTag().putInt("b", 1));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, stick);
        inventory.setItem(19, sandstone);
        inventory.setItem(20, pickaxe);
        inventory.setItem(22, swordLV1);
        inventory.setItem(23, helmet);
        inventory.setItem(24, armorLV1);
        inventory.setItem(25, leggins);
        inventory.setItem(26, boots);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(21, placeholder2);
        inventory.setItem(8, placeholder);

        inventory.addListener(ShopListener::onShop);
        player.addWindow(inventory);
    }

    public static void onOverview(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item sandstone = Item.get(BlockID.SANDSTONE, 0, 32);
        sandstone.setCustomName("§e32x §fSandstone §c8 Bronze");
        sandstone.setNamedTag(sandstone.getNamedTag().putInt("b", 8));

        Item stick = Item.get(ItemID.STICK, 0, 1);
        stick.setCustomName("§e1x §fStick §c8 Bronze");
        stick.setNamedTag(stick.getNamedTag().putInt("b", 8));
        stick.addEnchantment(Enchantment.get(Enchantment.ID_KNOCKBACK).setLevel(1));

        Item pickaxe = Item.get(ItemID.WOODEN_PICKAXE, 0, 1);
        pickaxe.setCustomName("§e1x §fWooden Pickaxe §c4 Bronze");
        pickaxe.setNamedTag(pickaxe.getNamedTag().putInt("b", 4));

        Item swordLV1 = Item.get(ItemID.GOLDEN_SWORD, 0, 1);
        swordLV1.setCustomName("§e1x §fSword - Lvl1 §71 Iron");
        swordLV1.setNamedTag(swordLV1.getNamedTag().putInt("i", 1));

        Item helmet = Item.get(ItemID.LEATHER_CAP, 0, 1);
        helmet.setCustomName("§e1x §fHelmet §c1 Bronze");
        helmet.setNamedTag(helmet.getNamedTag().putInt("b", 1));

        Item armorLV1 = Item.get(ItemID.CHAIN_CHESTPLATE, 0, 1);
        armorLV1.setCustomName("§e1x §fArmor - Lvl1 §71 Iron");
        armorLV1.setNamedTag(armorLV1.getNamedTag().putInt("i", 1));
        armorLV1.addEnchantment(Enchantment.get(Enchantment.ID_PROTECTION_ALL).setLevel(1));

        Item leggins = Item.get(ItemID.LEATHER_PANTS, 0, 1);
        leggins.setCustomName("§e1x §fLeggings §c1 Bronze");
        leggins.setNamedTag(leggins.getNamedTag().putInt("b", 1));

        Item boots = Item.get(ItemID.LEATHER_BOOTS, 0, 1);
        boots.setCustomName("§e1x §fBoots §c1 Bronze");
        boots.setNamedTag(boots.getNamedTag().putInt("b", 1));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, stick);
        inventory.setItem(19, sandstone);
        inventory.setItem(20, pickaxe);
        inventory.setItem(22, swordLV1);
        inventory.setItem(23, helmet);
        inventory.setItem(24, armorLV1);
        inventory.setItem(25, leggins);
        inventory.setItem(26, boots);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(21, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onBuild(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item sandstone = Item.get(BlockID.SANDSTONE, 0, 32);
        sandstone.setCustomName("§e32x §fSandstone §c8 Bronze");
        sandstone.setNamedTag(sandstone.getNamedTag().putInt("b", 8));

        Item sandstone1 = Item.get(BlockID.SANDSTONE, 0, 4);
        sandstone1.setCustomName("§e4x §fSandstone §c1 Bronze");
        sandstone1.setNamedTag(sandstone1.getNamedTag().putInt("b", 1));

        Item endstone = Item.get(BlockID.END_STONE, 0, 1);
        endstone.setCustomName("§e1x §fEndstone §c8 Bronze");
        endstone.setNamedTag(endstone.getNamedTag().putInt("b", 8));

        Item iron = Item.get(BlockID.IRON_BLOCK, 0, 1);
        iron.setCustomName("§e1x §fIron block §73 Iron");
        iron.setNamedTag(iron.getNamedTag().putInt("i", 3));

        Item web = Item.get(BlockID.COBWEB, 0, 1);
        web.setCustomName("§e1x §fCobweb §c16 Bronze");
        web.setNamedTag(web.getNamedTag().putInt("b", 16));

        Item chest = Item.get(BlockID.CHEST, 0, 1);
        chest.setCustomName("§e1x §fChest §71 Iron");
        chest.setNamedTag(chest.getNamedTag().putInt("i", 1));

        Item glass = Item.get(BlockID.GLASS, 0, 1);
        glass.setCustomName("§e1x §fGlass §c6 Bronze");
        glass.setNamedTag(glass.getNamedTag().putInt("b", 6));

        Item slime = Item.get(BlockID.SLIME_BLOCK, 0, 1);
        slime.setCustomName("§e1x §fSlime §71 Iron");
        slime.setNamedTag(slime.getNamedTag().putInt("i", 1));

        Item ladder = Item.get(BlockID.LADDER, 0, 1);
        ladder.setCustomName("§e1x §fLadder §c2 Bronze");
        ladder.setNamedTag(ladder.getNamedTag().putInt("b", 2));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, sandstone);
        inventory.setItem(19, sandstone1);
        inventory.setItem(20, ladder);
        inventory.setItem(21, endstone);
        inventory.setItem(22, iron);
        inventory.setItem(23, web);
        inventory.setItem(24, chest);
        inventory.setItem(25, glass);
        inventory.setItem(26, slime);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onPickaxes(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item pickaxe1 = Item.get(ItemID.WOODEN_PICKAXE, 0, 1);
        pickaxe1.setCustomName("§e1x §fWooden Pickaxe §c4 Bronze");
        pickaxe1.setNamedTag(pickaxe1.getNamedTag().putInt("b", 4));

        Item pickaxe2 = Item.get(ItemID.STONE_PICKAXE, 0, 1);
        pickaxe2.setCustomName("§e1x §fStone Pickaxe §72 Iron");
        pickaxe2.setNamedTag(pickaxe2.getNamedTag().putInt("i", 2));

        Item pickaxe3 = Item.get(ItemID.IRON_PICKAXE, 0, 1);
        pickaxe3.setCustomName("§e1x §fIron Pickaxe §61 Gold");
        pickaxe3.setNamedTag(pickaxe3.getNamedTag().putInt("g", 1));

        Item pickaxe4 = Item.get(ItemID.DIAMOND_PICKAXE, 0, 1);
        pickaxe4.setCustomName("§e1x §fDiamond Pickaxe §610 Gold");
        pickaxe4.setNamedTag(pickaxe4.getNamedTag().putInt("g", 10));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, pickaxe1);
        inventory.setItem(19, pickaxe2);
        inventory.setItem(20, pickaxe3);
        inventory.setItem(21, pickaxe4);
        inventory.setItem(22, placeholder);
        inventory.setItem(23, placeholder);
        inventory.setItem(24, placeholder);
        inventory.setItem(25, placeholder);
        inventory.setItem(26, placeholder);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onArmor(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item helmet = Item.get(ItemID.LEATHER_CAP, 0, 1);
        helmet.setCustomName("§e1x §fHelmet §c1 Bronze");
        helmet.setNamedTag(helmet.getNamedTag().putInt("b", 1));

        Item armor1 = Item.get(ItemID.CHAIN_CHESTPLATE, 0, 1);
        armor1.setCustomName("§e1x §fArmor - Lvl1 §71 Iron");
        armor1.addEnchantment(Enchantment.get(Enchantment.ID_PROTECTION_ALL).setLevel(1));
        armor1.setNamedTag(armor1.getNamedTag().putInt("i", 1));

        Item armor2 = Item.get(ItemID.CHAIN_CHESTPLATE, 0, 1);
        armor2.setCustomName("§e1x §fArmor - Lvl2 §73 Iron");
        armor2.addEnchantment(Enchantment.get(Enchantment.ID_PROTECTION_ALL).setLevel(2));
        armor2.setNamedTag(armor2.getNamedTag().putInt("i", 3));

        Item leggings = Item.get(ItemID.LEATHER_PANTS, 0, 1);
        leggings.setCustomName("§e1x §fLeggings §c1 Bronze");
        leggings.setNamedTag(leggings.getNamedTag().putInt("b", 1));

        Item boots = Item.get(ItemID.LEATHER_BOOTS, 0, 1);
        boots.setCustomName("§e1x §fBoots §c1 Bronze");
        boots.setNamedTag(boots.getNamedTag().putInt("b", 1));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, armor1);
        inventory.setItem(19, armor2);
        inventory.setItem(20, placeholder);
        inventory.setItem(21, placeholder);
        inventory.setItem(22, placeholder);
        inventory.setItem(23, helmet);
        inventory.setItem(24, armor1);
        inventory.setItem(25, leggings);
        inventory.setItem(26, boots);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onSwords(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item stick = Item.get(ItemID.STICK, 0, 1);
        stick.setCustomName("§e1x §fStick §c8 Bronze");
        stick.setNamedTag(stick.getNamedTag().putInt("b", 8));
        stick.addEnchantment(Enchantment.get(Enchantment.ID_KNOCKBACK).setLevel(1));

        Item sword1 = Item.get(ItemID.GOLDEN_SWORD, 0, 1);
        sword1.setCustomName("§e1x §fSword - Lvl1 §71 Iron");
        sword1.addEnchantment(Enchantment.get(9).setLevel(1));
        sword1.setNamedTag(sword1.getNamedTag().putInt("i", 1));

        Item sword2 = Item.get(ItemID.GOLDEN_SWORD, 0, 1);
        sword2.setCustomName("§e1x §fSword - Lvl2 §73 Iron");
        sword2.addEnchantment(Enchantment.get(9).setLevel(2));
        sword2.setNamedTag(sword2.getNamedTag().putInt("i", 3));

        Item sword3 = Item.get(ItemID.IRON_SWORD, 0, 1);
        sword3.setCustomName("§e1x §fSword - Lvl3 §65 Gold");
        sword3.addEnchantment(Enchantment.get(9).setLevel(1));
        sword3.setNamedTag(sword3.getNamedTag().putInt("g", 5));

        Item bow = Item.get(ItemID.BOW, 0, 1);
        bow.setCustomName("§e1x §fBow §64 Gold");
        bow.setNamedTag(bow.getNamedTag().putInt("g", 4));

        Item arrow = Item.get(ItemID.ARROW, 0, 1);
        arrow.setCustomName("§e1x §fArrow §61 Gold");
        arrow.setNamedTag(arrow.getNamedTag().putInt("g", 1));

        Item rod = Item.get(ItemID.FISHING_ROD, 0, 1);
        rod.setCustomName("§e1x §fRod §75 Iron");
        rod.setNamedTag(rod.getNamedTag().putInt("i", 5));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, sword1);
        inventory.setItem(19, sword2);
        inventory.setItem(20, sword3);
        inventory.setItem(21, placeholder);
        inventory.setItem(22, placeholder);
        inventory.setItem(23, rod);
        inventory.setItem(24, placeholder);
        inventory.setItem(25, bow);
        inventory.setItem(26, arrow);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onPotions(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item potion_healing = Item.get(ItemID.SPLASH_POTION, Potion.INSTANT_HEALTH, 1);
        potion_healing.setCustomName("§e1x §fHealing Potion §75 Iron");
        potion_healing.setNamedTag(potion_healing.getNamedTag().putInt("i", 5));

        Item potion_strength = Item.get(ItemID.SPLASH_POTION, Potion.STRENGTH, 1);
        potion_strength.setCustomName("§e1x §fStrength Potion §67 Gold");
        potion_strength.setNamedTag(potion_strength.getNamedTag().putInt("g", 7));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, potion_healing);
        inventory.setItem(19, potion_strength);
        inventory.setItem(20, placeholder);
        inventory.setItem(21, placeholder);
        inventory.setItem(22, placeholder);
        inventory.setItem(23, placeholder);
        inventory.setItem(24, placeholder);
        inventory.setItem(25, placeholder);
        inventory.setItem(26, placeholder);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onFood(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item apple = Item.get(ItemID.APPLE, 0, 1);
        apple.setCustomName("§e1x §fApple §c1 Bronze");
        apple.setNamedTag(apple.getNamedTag().putInt("b", 1));

        Item gold_apple = Item.get(ItemID.GOLDEN_APPLE, 0, 1);
        gold_apple.setCustomName("§e1x §fGold Apple §61 Gold");
        gold_apple.setNamedTag(gold_apple.getNamedTag().putInt("g", 1));

        Item porkchop = Item.get(ItemID.COOKED_PORKCHOP, 0, 1);
        porkchop.setCustomName("§e1x §fSteak §c2 Bronze");
        porkchop.setNamedTag(porkchop.getNamedTag().putInt("b", 2));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, apple);
        inventory.setItem(19, gold_apple);
        inventory.setItem(20, porkchop);
        inventory.setItem(21, placeholder);
        inventory.setItem(22, placeholder);
        inventory.setItem(23, placeholder);
        inventory.setItem(24, placeholder);
        inventory.setItem(25, placeholder);
        inventory.setItem(26, placeholder);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }

    public static void onExtras(Inventory inventory){
        inventory.clearAll();

        Item placeholder = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.GRAY.getDyeData(), 1);
        Item placeholder2 = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getDyeData(), 1);

        Item tnt = Item.get(BlockID.TNT, 0, 1);
        tnt.setCustomName("§e1x §fTNT §64 Gold");
        tnt.setNamedTag(tnt.getNamedTag().putInt("g", 4));
        tnt.setNamedTag(tnt.getNamedTag().putString("itemnametag", "§cTNT"));

        Item fire = Item.get(ItemID.FLINT_AND_STEEL, 0, 1);
        fire.setCustomName("§e1x §fLighter §75 Iron");
        fire.setNamedTag(fire.getNamedTag().putInt("i", 5));
        fire.setNamedTag(fire.getNamedTag().putString("itemnametag", "§bLighter"));

        Item ender = Item.get(ItemID.ENDER_PEARL, 0, 1);
        ender.setCustomName("§e1x §fEnderpearl §612 Gold");
        ender.setNamedTag(ender.getNamedTag().putInt("g", 12));
        ender.setNamedTag(ender.getNamedTag().putString("itemnametag", "§5Enderpearl"));

        Item safe = Item.get(ItemID.BLAZE_ROD, 0, 1);
        safe.setCustomName("§e1x §fRescue platform §63 Gold");
        safe.setNamedTag(safe.getNamedTag().putInt("g", 3));
        safe.setNamedTag(safe.getNamedTag().putString("itemnametag", "§eRescue platform"));

        Item base = Item.get(ItemID.GUNPOWDER, 0, 1);
        base.setCustomName("§e1x §fBaseteleporter §73 Iron");
        base.setNamedTag(base.getNamedTag().putInt("i", 3));
        base.setNamedTag(base.getNamedTag().putString("itemnametag", "§dBaseteleporter"));

        Item speedShop = Item.get(ItemID.BED, DyeColor.RED.getDyeData(), 1);
        speedShop.setCustomName("§eSpeed Shop");

        Item blocks = Item.get(BlockID.BRICKS, 0, 1);
        blocks.setCustomName("§eBlocks");

        Item pickaxes = Item.get(ItemID.NETHERITE_PICKAXE, 0, 1);
        pickaxes.setCustomName("§ePickaxes");

        Item armors = Item.get(ItemID.NETHERITE_CHESTPLATE, 0, 1);
        armors.setCustomName("§eArmors");

        Item swords = Item.get(ItemID.NETHERITE_SWORD, 0, 1);
        swords.setCustomName("§eSwords");

        Item potions = Item.get(ItemID.DRAGON_BREATH, 0, 1);
        potions.setCustomName("§ePotions");

        Item food = Item.get(ItemID.APPLE, 0, 1);
        food.setCustomName("§eFood");

        Item extra = Item.get(ItemID.EXPERIENCE_BOTTLE, 0, 1);
        extra.setCustomName("§eExtras");

        inventory.setItem(18, tnt);
        inventory.setItem(19, fire);
        inventory.setItem(20, ender);
        inventory.setItem(21, safe);
        inventory.setItem(22, base);
        inventory.setItem(23, placeholder);
        inventory.setItem(24, placeholder);
        inventory.setItem(25, placeholder);
        inventory.setItem(26, placeholder);
        inventory.setItem(13, speedShop);

        inventory.setItem(1, blocks);
        inventory.setItem(2, pickaxes);
        inventory.setItem(3, armors);
        inventory.setItem(4, swords);
        inventory.setItem(5, potions);
        inventory.setItem(6, food);
        inventory.setItem(7, extra);

        inventory.setItem(0, placeholder);
        inventory.setItem(9, placeholder2);
        inventory.setItem(10, placeholder2);
        inventory.setItem(11, placeholder2);
        inventory.setItem(12, placeholder2);
        inventory.setItem(14, placeholder2);
        inventory.setItem(15, placeholder2);
        inventory.setItem(16, placeholder2);
        inventory.setItem(17, placeholder2);
        inventory.setItem(8, placeholder);
    }
}
