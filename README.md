# xgxhcurseremove

一款适用于Minecraft Paper端的插件，允许玩家使用命令一键脱掉所有带有绑定诅咒的装备。

## 功能特点

- 一键脱掉所有带有绑定诅咒的装备
- 支持所有装备槽位（头盔、胸甲、护腿、靴子、主手、副手）
- 不修改物品NBT数据，绑定诅咒保留在装备上
- 背包满时自动提示
- 简单易用的命令系统

## 使用方法

### 命令

| 命令 | 说明 | 权限 |
|------|------|------|
| `/bdzz` | 脱掉所有带有绑定诅咒的装备 | `xgxhcurseremove.use` |

### 权限节点

| 权限 | 说明 | 默认值 |
|------|------|--------|
| `xgxhcurseremove.use` | 允许使用脱掉绑定诅咒装备命令 | 所有玩家 |

## 安装方法

1. 从 [Releases](https://github.com/your-username/xgxhcurseremove/releases) 下载最新版本的 `xgxhcurseremove-x.x.x.jar`
2. 将下载的jar文件放入服务器的 `plugins` 文件夹
3. 重启服务器或执行 `/reload` 命令

## 构建方法

### 环境要求

- Java 21+
- Maven 3.6+

### 构建步骤

```bash
# 克隆项目


# 构建项目
mvn clean package

# 构建产物
# target/xgxhcurseremove-x.x.x.jar
```

## 适用版本

- Minecraft 1.21+
- Paper端

## 作者

**雪糕小豪**

## 许可证

本项目采用 [MIT License](LICENSE) 许可证。

## 更新日志

### v1.0.0
- 初始版本
- 支持一键脱掉绑定诅咒装备
- 支持背包满检测
