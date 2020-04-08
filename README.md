# 声明

一个基于spring cloud编写的博彩系统，基本的功能已实现(购彩大厅，投注，追号，充值，提现，代理返点等)。
源码只供学习使用，请勿将系统用于非法业务，如用于商业活动与本人无关，欢迎大家一起来维护提交自己的push！

# 技术选型
| 技术                   | 版本   | 说明                                    |
| ---------------------- | ------ | --------------------------------------- |
| Spring Cloud           | Finchley.SR2  | MVC核心框架                       |
| Spring Security oauth2 | 2.1.5         | 认证和授权框架                     |
| Spring JPA             | 2.2           | 持久化框架                         |
| MyBatis                | 3.5.0         | ORM框架                            |
| MyBatisPlus            | 3.1.0         | 基于mybatis，使用lambda表达式的     |
| Swagger-UI             | 2.9.2         | 文档生产工具                       |
| Hibernator-Validator   | 6.0.17        | 验证框架                          |
| redisson               | 3.10.6        | 对redis进行封装、集成分布式锁等    |
| hikari                 | 3.2.0         | 数据库连接池                     |
| log4j2                 | 2.11.2        | 更快的log日志工具                      |
| fst                    | 2.57          | 更快的序列化和反序列化工具              |
| orika                  | 1.5.4         | 更快的bean复制工具                      |
| lombok                 | 1.18.8        | 简化对象封装工具                        |
| hutool                 | 4.5.0         | 更适合国人的java工具集                  |
| swagger-bootstrap      | 1.9.3         | 基于swagger，更便于国人使用的swagger ui |
| xxl-mq                 | 1.2.2         | 许雪李老师自己编写的mq |
| vue                    | 2.4.2         | 前端页面展示 |
| eureka                 | 2.2.5         |注册中心                              |
| Zuul                   | 1.9.3         | 网关路由  |

### 环境要求
| 工具  | 版本 |
| ----- | ---- |
| jdk   | 1.8+ |
| mysql | 5.7+ |
| redis | 4.0+ |

# 服务信息
| 应用名  | 端口 |包名|说明 |
| ----- | ---- | ---- |  ---- |
| eureka   | 8761 |lottery-eureka-server| 注册中心 |
| gateway | 8040| lottery-gateway| 网关 |
| admin | 8081 | lottery-admin| 管理员后台服务 |
| admin-font| 8082 | lottery-admin-font | 管理员页面服务 |
| 定时任务 | 8081 | lottery-task| 定时任务服务 |
| 前置服务api | 9001 | lottery-web| 提供前置服务的服务 |
| 前置服务Feign | 8089 | lottery-web-client| 给前置服务提供负载均衡处理 |
| 前置页面 | 80 | lottery-web-font| 前置页面服务 |


### 交流
QQ群:1076909149 <br>
TG: tg.me/lottery166

## 截图

| 首页 | 投注 | 投注订单详情 | 追号 |
| :------: | :------: | :------: | :------: |
| ![首页](/doc/截图/首页.png) | ![投注](/doc/截图/投注.png) | ![投注订单详情](/doc/截图/投注订单详情.png) | ![追号](/doc/截图/追号.png) |

| 购彩大厅 | 开奖走势 | 投注记录 | 充值 | 提现 |
| :------: | :------: | :------: | :------: | :------: |
| ![购彩大厅](/doc/截图/购彩大厅.png) | ![开奖走势](/doc/截图/开奖走势.png) | ![投注记录](/doc/截图/投注记录.png) | ![充值](/doc/截图/充值.png) | ![提现](/doc/截图/提现.png) |

| 追号记录 | 下级账号管理 | 下级开户 | 团队充值明细 |
| :------: | :------: | :------: | :------: |
| ![追号记录](/doc/截图/追号记录.png) | ![下级账号管理](/doc/截图/下级账号管理.png) | ![下级开户](/doc/截图/下级开户.png) | ![团队充值明细](/doc/截图/团队充值明细.png) |

> 这是由别人代码衍生过来的一个版本，后期将持续优化，希望大家能一起加入进来

> 由于程序不断优化，界面细节可能有所变化，请以实际页面为准

> 作者不喝咖啡 :coffee: 只喝茶 :tea: 觉得有帮助的可以请我喝茶


| 支付宝 | 微信支付 |
| :------: | :------: |
| ![alipay](/doc/截图/alipay.jpg) | ![wepay](/doc/截图/wechant.jpg) |

