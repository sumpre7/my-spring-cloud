#### 1.客户端相关配置文件
* bootstrap.yml 和 application.yml
  bootstrap: 用来在程序引导时执行，
  应用于更加早起配置信息读取，可用于配置application.yml 中参数配置
  
  bootstrap 优先于 application 
  
  
  ##### 注意: 无法启动问题
  * bootstrap 文件无法读取问题，尝试添加依赖【spring-cloud-context】
  ```  
     <dependency>-->
           <groupId>org.springframework.cloud</groupId>
           <artifactId>spring-cloud-context</artifactId>
     </dependency> 
  ```
  * 解决方案： 新版本spring cloud 版本问题
  需要针对bootstrap配置文件引入额外的依赖 >>> 【spring-cloud-starter-bootstrap】
  ```
      <!-- bootstrap额外依赖 -->
      <dependency>
           <groupId>org.springframework.cloud</groupId>
           <artifactId>spring-cloud-starter-bootstrap</artifactId>
      </dependency>
  ```

  参考
  https://blog.csdn.net/Camemax/article/details/112646949  
