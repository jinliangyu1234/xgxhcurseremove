# 使用示例

## 基本使用

### 1. 安装插件
将 `xgxhcurseremove-1.0.0.jar` 放入服务器的 `plugins` 文件夹，重启服务器。

### 2. 使用命令
当玩家穿戴带有绑定诅咒的装备时，输入：
```
/bdzz
```

### 3. 查看提示
- 成功脱掉：`已成功脱掉 X 件带有绑定诅咒的装备！`
- 背包已满：`背包已满，无法脱掉装备！请先清理背包留出空间。`
- 无绑定诅咒装备：`你没有穿戴带有绑定诅咒的装备！`

## 权限配置

### 默认配置
所有玩家都可以使用 `/bdzz` 命令。

### 限制使用
如果需要限制只有特定玩家可以使用，可以修改权限：

#### 使用LuckPerms插件
```bash
# 给予玩家权限
/lp user <玩家名> permission set xgxhcurseremove.use true

# 给予组权限
/lp group <组名> permission set xgxhcurseremove.use true
```

#### 使用EssentialsX
```bash
# 给予玩家权限
/ep user <玩家名> setperm xgxhcurseremove.use true
```

## 常见问题

### Q: 命令无法使用？
A: 检查玩家是否有 `xgxhcurseremove.use` 权限。

### Q: 背包满了怎么办？
A: 清理背包留出空间后再次使用命令。

### Q: 卸载插件后绑定诅咒还在吗？
A: 是的，插件不修改物品NBT数据，绑定诅咒会保留在装备上。

### Q: 支持哪些装备类型？
A: 支持所有装备槽位：头盔、胸甲、护腿、靴子、主手、副手。
