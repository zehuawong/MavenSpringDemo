package javaconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//某一些情况，比如引用第三方库组件的时候，可以采用Java配置的方式

@Configuration
public class CDPlayerConfig {   //配置类不应该包含任何的业务逻辑
  
  @Bean   //此处默认的名字是 SgtPeppers，可以通过(name=" ")属性设置一个不同的名字
  public CompactDisc compactDisc() {
    return new SgtPeppers();    //此处可以选择不同的CD
  }
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
    //构造器和Setter方法都可以用
  }

//  @Bean
//  public CDPlayer cdPlayer() {
//    return new CDPlayer(compactDisc());
//  }


}
