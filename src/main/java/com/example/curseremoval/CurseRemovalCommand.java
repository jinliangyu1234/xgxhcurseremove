package com.example.curseremoval;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class CurseRemovalCommand implements CommandExecutor {

    private final CurseRemoval plugin;

    public CurseRemovalCommand(CurseRemoval plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§c只有玩家可以使用此命令！");
            return true;
        }

        PlayerInventory inventory = player.getInventory();
        int removedCount = 0;

        // 检查所有装备槽位
        ItemStack[] armorContents = inventory.getArmorContents();
        for (int i = 0; i < armorContents.length; i++) {
            ItemStack item = armorContents[i];
            if (item != null && item.getType() != Material.AIR && hasBindingCurse(item)) {
                // 检查背包是否有空间
                if (inventory.firstEmpty() == -1) {
                    player.sendMessage("§c背包已满，无法脱掉装备！请先清理背包留出空间。");
                    return true;
                }
                
                // 移除装备并添加到背包
                inventory.setArmorContents(null);
                inventory.addItem(item);
                removedCount++;
            }
        }

        // 检查主手和副手
        ItemStack mainHand = inventory.getItemInMainHand();
        if (mainHand != null && mainHand.getType() != Material.AIR && hasBindingCurse(mainHand)) {
            if (inventory.firstEmpty() == -1) {
                player.sendMessage("§c背包已满，无法脱掉装备！请先清理背包留出空间。");
                return true;
            }
            inventory.setItemInMainHand(null);
            inventory.addItem(mainHand);
            removedCount++;
        }

        ItemStack offHand = inventory.getItemInOffHand();
        if (offHand != null && offHand.getType() != Material.AIR && hasBindingCurse(offHand)) {
            if (inventory.firstEmpty() == -1) {
                player.sendMessage("§c背包已满，无法脱掉装备！请先清理背包留出空间。");
                return true;
            }
            inventory.setItemInOffHand(null);
            inventory.addItem(offHand);
            removedCount++;
        }

        if (removedCount == 0) {
            player.sendMessage("§c你没有穿戴带有绑定诅咒的装备！");
        } else {
            player.sendMessage("§a已成功脱掉 " + removedCount + " 件带有绑定诅咒的装备！");
        }

        return true;
    }

    private boolean hasBindingCurse(ItemStack item) {
        if (item == null || item.getType() == Material.AIR) {
            return false;
        }
        return item.containsEnchantment(org.bukkit.enchantments.Enchantment.BINDING_CURSE);
    }
}
