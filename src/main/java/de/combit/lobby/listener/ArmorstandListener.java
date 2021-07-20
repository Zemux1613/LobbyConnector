package de.combit.lobby.listener;

import com.sun.org.apache.xerces.internal.parsers.NonValidatingConfiguration;
import de.combit.lobby.LobbyConnector;
import de.combit.lobby.util.ServerUtil;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

/**
 * @author 1combit
 */
public class ArmorstandListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();
        event.setCancelled(true);

        FileConfiguration configuration = LobbyConnector.instance.getSettingsConfig();

        if (entity.getCustomName() != null) {
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-1.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-1.GROUP"), configuration.getString("Gui-1.Name") , configuration.getString("Gui-1.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-2.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-2.GROUP"),configuration.getString("Gui-2.Name") , configuration.getString("Gui-2.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-3.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-3.GROUP"), configuration.getString("Gui-3.Name") , configuration.getString("Gui-3.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-4.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-4.GROUP"), configuration.getString("Gui-4.Name") , configuration.getString("Gui-4.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-5.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-5.GROUP"), configuration.getString("Gui-5.Name") , configuration.getString("Gui-5.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-6.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-6.GROUP"), configuration.getString("Gui-6.Name") , configuration.getString("Gui-6.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-7.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-7.GROUP"), configuration.getString("Gui-7.Name") , configuration.getString("Gui-7.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-8.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-8.GROUP"), configuration.getString("Gui-8.Name") , configuration.getString("Gui-8.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-9.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-9.GROUP"), configuration.getString("Gui-9.Name") , configuration.getString("Gui-9.Material"), player);
        }
        if (entity.getCustomName().equalsIgnoreCase(configuration.getString("Gui-10.Armor"))) {
            ServerUtil.createServiceGUI(configuration.getString("Gui-10.GROUP"), configuration.getString("Gui-10.Name") , configuration.getString("Gui-10.Material"), player);
        }


    } else {
            System.out.println("  ");
        }
    }

}
