# mybatisDemo
#### 需要的配置
- springboot（可以去官网创建后下载，会显示多个依赖）
- web API服务需要下载插件 spring-boot-starter-web
- mybatis（因为是基于springboot，所以配置并不是mybatis，而是mybatis-spring-boot-starter）
- mysql（mysql-connector-java）
- Lombok 


#### mybatis使用
- 需要创建mapper文件
- 根据实体类创建对应mapper接口，例：UserMapper
- mapper接口内，需使用@mapper和 @select 注解，具体见示例

#### Lombok
- 参考pojo/User 类，需要添加@Data注解
- @Data //getter方法、setter方法、toString方法、hashCode方法、equals方法
- @NoArgsConstructor //无参构造
- @AllArgsConstructor//全参构造