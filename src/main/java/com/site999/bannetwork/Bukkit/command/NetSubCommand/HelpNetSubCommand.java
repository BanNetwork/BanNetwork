package com.site999.bannetwork.Bukkit.command.NetSubCommand;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelpNetSubCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Affiche la liste des sous-commandes disponibles
        sender.sendMessage(ChatColor.GOLD+"Liste des sous-commandes disponibles :");
        sender.sendMessage(ChatColor.BLUE+"/net help : Affiche cette liste");
        sender.sendMessage(ChatColor.GREEN+"/net gui : Ouvre le gui de ban");
        sender.sendMessage(ChatColor.GREEN+"/net config : Ouvre le gui de config");

        return true;
    }
}