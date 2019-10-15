1.idea maven - > springBoot 
  
    //spring-boot-starter-parent 依赖
      <parent>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>springboot 版本号</version>
      </parent>
     // web 坐标
    <dependencies>
        <!--spring boot starter web-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
    
    // springboot 启动类
    @SpringBootApplication
    public class AdminSpringBoot {
        public static void main(String[] args) {
            // 设置主线程
            SpringApplication.run(AdminSpringBoot.class);
        }
    }
    
