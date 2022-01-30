package com.github.crafttogether.weg.listeners;

import com.github.crafttogether.weg.Weg;
import com.github.crafttogether.weg.events.ReturnEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ReturnListener implements ReturnEvent {
    @Override
    public void invoke(Player player) {
        Weg.removeAfkPlayer(player.getUniqueId());
        player.sendMessage(ChatColor.GRAY + "You are no longer afk");
    }
}