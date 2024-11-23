package com.site999.bannetwork.Bukkit;

import com.site999.bannetwork.Bukkit.GUI.NetCommand.SubCommand.ConfigGUI;
import com.site999.bannetwork.Bukkit.command.NetCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class BanNetworkSpigot extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("net").setExecutor(new NetCommand());
        getServer().getPluginManager().registerEvents(new ConfigGUI(), this);

    }
}
