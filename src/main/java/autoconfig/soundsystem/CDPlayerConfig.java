package autoconfig.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//自动装配的配置类

@Configuration  //@Configuration注解表明这个类是一个配置类
@ComponentScan(basePackages = {"autoconfig.soundsystem"})  //这个注解能够在Spring中启用组件扫描，后面的是设置组件扫描的基础包
public class CDPlayerConfig {

}
