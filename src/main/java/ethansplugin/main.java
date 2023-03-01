package ethansplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getOnlinePlayers;

public final class main extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this,this);
run();
    }

    public void run() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {
            if (getOnlinePlayers().size() == 0) {
                return;
            }
            Bukkit.broadcastMessage("(AUTOMATED MESSAGE) If you think someone is hacking! Message a staff memeber and we can handle it :D");


        }, 6000L, 0L);}
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Welcome to ZacksRain! " +
                "Make sure to read the rules and have fun!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
