package com.site999.bannetwork.Bukkit.GUI.NetCommand.SubCommand;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ConfigGUI implements Listener {

    public static void openGUI(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 54, "Configuration BanNetwork");

        ItemStack glassPaneStack = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemMeta glassPaneMeta = glassPaneStack.getItemMeta();
        if (glassPaneMeta != null) {
            glassPaneMeta.setDisplayName(" ");
            glassPaneStack.setItemMeta(glassPaneMeta);
        }

        for (int i = 0; i < 54; i++) {
            inventory.setItem(i, glassPaneStack);
        }

        player.openInventory(inventory);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("Configuration BanNetwork")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        if (event.getView().getTitle().equals("Configuration BanNetwork")) {
            event.setCancelled(true);
        }
    }
}
