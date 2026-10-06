# 校园二手交易平台

这是一个基于 Vue 3 + Spring Boot + MySQL + Docker 的校园二手交易平台，主要用于解决校园内学生之间的闲置物品交易需求。

## 项目简介

该系统允许用户：

- 浏览商品
- 发布闲置物品
- 查看商品详情
- 下单购买
- 查看个人订单
- 管理个人发布信息

管理员可以：

- 审核商品
- 管理用户
- 查看订单统计
- 处理平台内容

## 技术栈

- Frontend: Vue 3 + TypeScript + Vite + Element Plus + Pinia
- Backend: Spring Boot 2.7 + Spring Security + JWT + MyBatis Plus
- Database: MySQL 8
- Deployment: Docker + Docker Compose

## 功能展示

- 首页商品展示
- 商品分类筛选
- 商品详情页
- 商品发布页
- 订单支付模拟
- 个人中心
- 管理后台
- 数据统计大屏

## 项目架构

```text
Brix_CampusSecond-HandPlatform/
├── backend/                 # Spring Boot 后端服务
├── frontend/                # Vue 3 前端应用
├── mysql/                   # MySQL 数据目录或初始化脚本
├── docker-compose.yml       # Docker Compose 容器编排
├── README.md                # 项目说明
├── reset_data.sql           # 数据重置脚本
└── uploads/                 # 用户上传文件目录
```

## 快速开始

### 使用 Docker Compose 启动（推荐）

确保本机已安装 Docker Desktop，然后在项目根目录执行：

```bash
docker compose up --build
```

启动后，根据 docker-compose.yml 中的端口配置访问前端页面。

### 本地开发

#### 启动后端

1. 创建 MySQL 8 数据库并配置连接信息。
2. 执行初始化脚本或 reset_data.sql。
3. 进入 backend 目录，使用 Maven 启动 Spring Boot 服务：

```bash
mvn spring-boot:run
```

#### 启动前端

进入 frontend 目录，安装依赖并启动开发服务器：

```bash
npm install
npm run dev
```

## 默认角色

- 普通用户：浏览、发布、购买和管理个人商品。
- 管理员：审核商品、管理用户、查看订单和数据统计。

## 注意事项

- 首次启动前请确认 MySQL、Docker 和 Node.js 环境已正确安装。
- 请根据本地环境修改数据库连接、JWT 密钥和跨域配置。
- uploads/ 目录用于保存上传内容，生产环境部署时请做好持久化和备份。

## 项目说明

本项目用于校园二手交易场景的学习与实践，后续将持续完善交易流程、权限控制和平台运营功能。
