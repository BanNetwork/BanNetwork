package com.site999.bannetwork.Bukkit.command.NetSubCommand;

import com.site999.bannetwork.Bukkit.GUI.NetCommand.SubCommand.ConfigGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.swing.text.PlainDocument;

public class ConfigNetSubCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Vous devez jouer pour utiliser cette commande.");
            return false;
        }
        Player player = (Player) sender;
        ConfigGUI.openGUI(player);
        return true;
    }
}
