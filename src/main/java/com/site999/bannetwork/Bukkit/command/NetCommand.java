package com.site999.bannetwork.Bukkit.command;

import com.site999.bannetwork.Bukkit.command.NetSubCommand.ConfigNetSubCommand;
import com.site999.bannetwork.Bukkit.command.NetSubCommand.GUINetSubCommand;
import com.site999.bannetwork.Bukkit.command.NetSubCommand.HelpNetSubCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class NetCommand implements CommandExecutor {

    private CommandExecutor guiNetSubCommand = new GUINetSubCommand();
    private CommandExecutor helpNetSubCommand = new HelpNetSubCommand();
    private CommandExecutor configNetSubCommand = new ConfigNetSubCommand();

    public NetCommand() {
        // Charge toutes les sous-commandes du package
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Vérifie si la sous-commande est valide
        if (args.length < 1) {
            return helpNetSubCommand.onCommand(sender, command, label, args);
        }

        String subCommandName = args[0];

        if (subCommandName.equalsIgnoreCase("gui")) {
            return guiNetSubCommand.onCommand(sender, command, label, args);
        } else if (subCommandName.equalsIgnoreCase("help")) {
            return helpNetSubCommand.onCommand(sender, command, label, args);
        } else if (subCommandName.equalsIgnoreCase("config")) {
            return configNetSubCommand.onCommand(sender, command, label, args);
        } else {
            return helpNetSubCommand.onCommand(sender, command, label, args);
        }
    }
}