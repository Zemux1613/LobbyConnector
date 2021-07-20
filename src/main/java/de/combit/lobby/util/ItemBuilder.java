package de.combit.lobby.util;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * @author 1combit
 */
@UtilityClass
public class ItemBuilder {

    public ItemStack create(Material material, String string, int subid) {
        ItemStack itemStack = new ItemStack(material);
        itemStack.setDurability((short) subid);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(string);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack createServiceItem(Material material, String name, String group) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }


}
