# mybatisDemo
#### 需要的配置
- springboot（可以去官网创建后下载，会显示多个依赖）
- web API服务需要下载插件 spring-boot-starter-web
- mybatis（因为是基于springboot，所以配置并不是mybatis，而是mybatis-spring-boot-starter）
- mysql（mysql-connector-java）


#### mybatis使用
- 需要创建mapper文件
- 根据实体类创建对应mapper接口，例：UserMapper
- mapper接口内，需使用@mapper和 @select 注解