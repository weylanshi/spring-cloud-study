####maven 使用
```
dependencyManagement 同时管理spring-boot和spring-cloud 的所有版本
```

spring-cloud-config
分布式配置中心

config-sever 配置中心服务端
从gitHub上读取配置，保存到本地

####config-client配置中心客户端
```
从config-sever上拉取配置，并且注入到spring的容器中
search-paths: /{application} 通过项目名称查找配置
force-pull  每次从github上强制拉取配置
basedir: 重新指定
```

cs模型
####配置的优先级
```
配置中心的优先级会大于本地配置的优先级
```

####配置文件动态更新
```
1.加入@RefreshScope
2.添加 spring-boot-starter-actuator 依赖
设置
management:
  address: 127.0.0.1
  security:
    enabled: false
3.不是所有配置都能动态刷新
eg. 数据库连接地址    
```    
####一个项目的配置
可以通过三个地方进行组合，构成最后的配置文件
```$xslt
1.仓库项目目录里面的配置 （/{application-name}）          项目独立的配置
2.仓库根目录里面的额配置 （/）                            公司统一的配置
3.代码本地的配置         代码resources目录下面的配置文件   开发环境经常需要修改的配置

1>2>3
```
####分布式注册中心