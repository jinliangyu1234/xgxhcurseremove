# 项目结构

```
xgxhcurseremove/
├── .github/
│   └── workflows/
│       └── build.yml          # GitHub Actions 构建工作流
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── curseremoval/
│       │               ├── CurseRemoval.java          # 插件主类
│       │               └── CurseRemovalCommand.java   # 命令处理器
│       └── resources/
│           └── plugin.yml     # 插件配置文件
├── pom.xml                    # Maven 配置文件
├── README.md                  # 项目说明文档
├── LICENSE                    # MIT 许可证
├── CHANGELOG.md               # 更新日志
├── EXAMPLES.md                # 使用示例
└── .gitignore                 # Git 忽略文件
```

## 文件说明

### 核心文件

- **CurseRemoval.java**: 插件主类，负责插件的启用和禁用
- **CurseRemovalCommand.java**: 命令处理器，实现 `/bdzz` 命令逻辑
- **plugin.yml**: 插件配置文件，定义命令和权限

### 文档文件

- **README.md**: 项目主要说明文档
- **LICENSE**: MIT 许可证文件
- **CHANGELOG.md**: 版本更新日志
- **EXAMPLES.md**: 使用示例和常见问题

### 构建文件

- **pom.xml**: Maven 项目配置文件
- **build.yml**: GitHub Actions 自动构建工作流

### 开发文件

- **.gitignore**: Git 忽略文件配置
