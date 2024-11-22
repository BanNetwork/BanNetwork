package com.site999.bannetwork.Bukkit;

import com.site999.bannetwork.Bukkit.command.NetCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class BanNetworkSpigot extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("net").setExecutor(new NetCommand());
    }
}
