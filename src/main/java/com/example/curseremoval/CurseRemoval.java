package com.example.curseremoval;

import org.bukkit.plugin.java.JavaPlugin;

public class CurseRemoval extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("bdzz").setExecutor(new CurseRemovalCommand(this));
        getLogger().info("xgxhcurseremove 已启用！作者：雪糕小豪");
    }

    @Override
    public void onDisable() {
        getLogger().info("xgxhcurseremove 已禁用！");
    }
}
