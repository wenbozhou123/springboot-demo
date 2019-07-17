### simple example
```shell
注释Entry类中的
@SpringBootApplication
@ComponentScan(basePackages = "com.bowen.springboot")
打开HelloWord的annotation注释

访问URL:http://localhost:9090/say.html
```


### springboot+jpa example
```shell
a方案：
application.properties文件中key如下赋值
spring.mvc.view.prefix=WEB-INF/templates/

b方案：
application.properties文件中key如下赋值
spring.mvc.view.prefix=/templates/
跟pom中增加spring-boot-starter-parent和spring-boot-starter-thymeleaf依赖

访问的URL：
http://localhost:9090/user/index
http://localshoyt:9090/user/show?name=name01
```


### create configuration
 启动springboot配置
