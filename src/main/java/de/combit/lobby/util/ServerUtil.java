package de.combit.lobby.util;

import eu.thesimplecloud.api.CloudAPI;
import eu.thesimplecloud.api.service.ICloudService;
import eu.thesimplecloud.api.service.ServiceState;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

/**
 * @author 1combit
 */
@UtilityClass
public class ServerUtil {

    public void createServiceGUI(String serviceGroup, String material,  Player player) {
        Inventory inventory = Bukkit.createInventory(null, 6*9 , "§8» §6" + serviceGroup);
        ItemStack grey = ItemBuilder.create(Material.STAINED_GLASS_PANE, "§8", 7);
        inventory.setItem(0, grey);
        inventory.setItem(1, grey);
        inventory.setItem(2, grey);
        inventory.setItem(3, grey);
        inventory.setItem(4, grey);
        inventory.setItem(5, grey);
        inventory.setItem(6, grey);
        inventory.setItem(7, grey);
        inventory.setItem(8, grey);

        inventory.setItem(27, grey);
        inventory.setItem(28, grey);
        inventory.setItem(29, grey);
        inventory.setItem(30, grey);
        inventory.setItem(31, grey);
        inventory.setItem(32, grey);
        inventory.setItem(33, grey);
        inventory.setItem(34, grey);
        inventory.setItem(35, grey);


        int slot = 9;
        int spec = 36;
        for (ICloudService service : CloudAPI.getInstance().getCloudServiceGroupManager().getServiceGroupByName(serviceGroup).getAllServices()) {
            if (service.getState().equals(ServiceState.VISIBLE)) {
                ItemStack item = new ItemStack(Material.valueOf(material));
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName("§e" + service.getName());
                item.setAmount(1);
                ArrayList<String> itemL = new ArrayList<>();
                itemL.add("§7§m----------------------");
                itemL.add("§7");
                itemL.add("§7MOTD: §f" + service.getMOTD());
                itemL.add("§7Spieler: §f" + service.getOnlineCount() + " §8/ §f" + service.getMaxPlayers());
                itemL.add("§7");
                itemL.add("§7§m----------------------");
                itemMeta.setLore(itemL);
                item.setItemMeta(itemMeta);

                inventory.setItem(slot, item);
                slot++;
            }
                if (service.getState().equals(ServiceState.INVISIBLE)) {
                    ItemStack item = new ItemStack(Material.valueOf(material));
                    ItemMeta itemMeta = item.getItemMeta();
                    itemMeta.setDisplayName("§7" + service.getName());
                    item.setAmount(1);
                    ArrayList<String> itemL = new ArrayList<>();
                    itemL.add("§7§m----------------------");
                    itemL.add("§7");
                    itemL.add("§7MOTD: §a" + service.getMOTD());
                    itemL.add("§7Status: §cSpectate");
                    itemL.add("§7Spieler: §a" + service.getOnlineCount() + " §8/ §a" + service.getMaxPlayers());
                    itemL.add("§7");
                    itemL.add("§7§m----------------------");
                    itemMeta.setLore(itemL);
                    item.setItemMeta(itemMeta);

                    inventory.setItem(slot, item);
                    spec++;
                }
        }
            player.openInventory(inventory);
    }
}
