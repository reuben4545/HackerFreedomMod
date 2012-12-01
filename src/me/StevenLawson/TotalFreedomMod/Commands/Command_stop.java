package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = ADMIN_LEVEL.SUPER, source = SOURCE_TYPE_ALLOWED.BOTH, ignore_permissions = false)
public class Command_stop extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {

        TFM_Util.bcastMsg("Server is going offline!", ChatColor.LIGHT_PURPLE);

        for (Player p : server.getOnlinePlayers())
        {
            p.kickPlayer("Server is going offline, come back in a few minutes.");
        }

        server.shutdown();

        return true;
    }
}
