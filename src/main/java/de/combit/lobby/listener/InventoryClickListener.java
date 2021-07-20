package de.combit.lobby.listener;

import de.combit.lobby.LobbyConnector;
import eu.thesimplecloud.api.CloudAPI;
import eu.thesimplecloud.api.player.ICloudPlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

/**
 * @author 1combit
 */
public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = ((Player) event.getWhoClicked());
        FileConfiguration configuration = LobbyConnector.instance.getSettingsConfig();
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-1.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-2.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-3.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-4.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-5.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-6.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-7.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-8.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-9.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }
        if (event.getInventory().getName().equalsIgnoreCase(configuration.getString("Gui-10.Name"))) {
            event.setCancelled(true);
            ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());
            String serviceRaw = event.getCurrentItem().getItemMeta().getDisplayName();
            String service = serviceRaw.replaceAll("§e", "").replaceAll("§7", "");
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(service));
        }




    }

}
