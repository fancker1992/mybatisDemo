# mybatisDemo


#### 参考学习资料
- 哔哩哔哩：bilibili.com/video/BV1m84y1w7Tb/?spm_id_from=333.999.0.0&vd_source=aca8ea2d4a38c555edfc3b0eb238466b
- 百度云：
  - 我的资源-2023新版JavaWeb开发教程
  - https://pan.baidu.com/disk/main?from=homeFlow#/index?category=all&path=%2F%E6%88%91%E7%9A%84%E8%B5%84%E6%BA%90%2F2023%E6%96%B0%E7%89%88JavaWeb%E5%BC%80%E5%8F%91%E6%95%99%E7%A8%8B

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