package com.metaxcrew.socialsplugin.Socials;

import com.metaxcrew.socialsplugin.SocialsPlugin;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class WebSite implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            // Dobi povezavo iz Configa
            String websiteLink = SocialsPlugin.plugin.getConfig().getString("WEBSITE");

            // Component
            BaseComponent[] website =
                    new ComponentBuilder("★ ").color(ChatColor.of(new Color(161, 255, 234))).append("Website: ").color(ChatColor.of(new Color(100, 100, 100)))
                            .append("Click me").color(ChatColor.of(new Color(173, 173, 173))).bold(true).event(new ClickEvent(ClickEvent.Action.OPEN_URL, websiteLink)).create();

            // Poslje sporocilo igralcu
            ((Player) sender).getPlayer().spigot().sendMessage(website);
        }


        // Old code
        /*
        if (sender instanceof Player) {
            Player player = (Player) sender;
            BaseComponent[] website =
                    new ComponentBuilder("★ ").color(ChatColor.of(new Color(161, 255, 234))).append("Website: ").color(ChatColor.of(new Color(100, 100, 100)))
                            .append("Click me").color(ChatColor.of(new Color(173, 173, 173))).bold(true).event(new ClickEvent(ClickEvent.Action.OPEN_URL, websiteLink)).create();

            player.spigot().sendMessage(website);
        }
        */
        return false;
    }
}
