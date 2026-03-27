package me.nlg.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // প্লাগিন যখন সার্ভারে চালু হবে তখন এই মেসেজটি দেখাবে
        getLogger().info("NLG Plugin successfully enabled!");
    }

    @Override
    public void onDisable() {
        // প্লাগিন বন্ধ হওয়ার সময় এই মেসেজটি দেখাবে
        getLogger().info("NLG Plugin is shutting down...");
    }
}
