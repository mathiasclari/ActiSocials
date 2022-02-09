package com.metaxcrew.socialsplugin;

import com.metaxcrew.socialsplugin.Socials.WebSite;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public final class SocialsPlugin extends JavaPlugin {
    private final YamlConfiguration conf = new YamlConfiguration();
    @Override
    public void onEnable() {
        File co = new File(getDataFolder(), "config.yml");
        if(!co.exists()) saveResource("config.yml", false);

        try{
            this.conf.load(co);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

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
    public YamlConfiguration getConf() { return this.conf; }
}
