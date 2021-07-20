package de.combit.lobby;

import de.combit.lobby.listener.ArmorstandListener;
import de.combit.lobby.listener.InventoryClickListener;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;


/**
 * @author 1combit
 */
@Getter
public class LobbyConnector extends JavaPlugin {

    public static LobbyConnector instance;
    public File settings = new File(this.getDataFolder() + "/settings.yml");
    public FileConfiguration settingsConfig = YamlConfiguration.loadConfiguration(settings);


    @Override
    public void onEnable() {
        instance = this;
        /* Settings.yml */
        settingsConfig.options().header("There you can edit the settings! - Plugin by 1combit");

        settingsConfig.addDefault("Gui-1.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-1.Material", "STONE");
        settingsConfig.addDefault("Gui-1.Armor", "STONE");
        settingsConfig.addDefault("Gui-1.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-2.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-2.Material", "STONE");
        settingsConfig.addDefault("Gui-2.Armor", "STONE");
        settingsConfig.addDefault("Gui-2.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-3.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-3.Material", "STONE");
        settingsConfig.addDefault("Gui-3.Armor", "STONE");
        settingsConfig.addDefault("Gui-3.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-4.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-4.Material", "STONE");
        settingsConfig.addDefault("Gui-4.Armor", "STONE");
        settingsConfig.addDefault("Gui-4.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-5.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-5.Material", "STONE");
        settingsConfig.addDefault("Gui-5.Armor", "STONE");
        settingsConfig.addDefault("Gui-5.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-6.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-6.Material", "STONE");
        settingsConfig.addDefault("Gui-6.Armor", "STONE");
        settingsConfig.addDefault("Gui-6.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-7.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-7.Material", "STONE");
        settingsConfig.addDefault("Gui-7.Armor", "STONE");
        settingsConfig.addDefault("Gui-7.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-8.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-8.Material", "STONE");
        settingsConfig.addDefault("Gui-8.Armor", "STONE");
        settingsConfig.addDefault("Gui-8.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-9.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-9.Material", "STONE");
        settingsConfig.addDefault("Gui-9.Armor", "STONE");
        settingsConfig.addDefault("Gui-9.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-10.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-10.Material", "STONE");
        settingsConfig.addDefault("Gui-10.Armor", "STONE");
        settingsConfig.addDefault("Gui-10.GROUP", "CityBuild");


        settingsConfig.options().copyDefaults(true);
        saveCustomYml(settingsConfig, settings);
        /* Settings.yml */

        Bukkit.getPluginManager().registerEvents(new ArmorstandListener(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);

    }

    @Override
    public void onDisable() {


    }

    public void saveCustomYml(FileConfiguration ymlConfig, File ymlFile) {
        try {
            ymlConfig.save(ymlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
