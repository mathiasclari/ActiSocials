package com.metaxcrew.socialsplugin;

import com.metaxcrew.socialsplugin.Socials.WebSite;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class SocialsPlugin extends JavaPlugin {

    public static SocialsPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

        // Spigot Config.yml (start)
        reloadConfig();
        FileConfiguration config = getConfig();
        config.options().copyDefaults(true);
        saveDefaultConfig();
        // Spigot Config.yml (end)

        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]=================[" + ChatColor.of(new Color(100, 100, 100)) + ChatColor.BOLD + "ActiSocials" + ChatColor.GRAY + "]=================[]");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Name:" + ChatColor.of(new Color(100, 100, 100)) + " ActiSocials");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Developer:" + ChatColor.of(new Color(100, 100, 100)) + " Mat");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Discord:" + ChatColor.of(new Color(100, 100, 100)) + " Mat#5000");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Type:" + ChatColor.of(new Color(100, 100, 100)) + "Open Source");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]===============================================[]");

        //Commands
        getCommand("website").setExecutor(new WebSite());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
