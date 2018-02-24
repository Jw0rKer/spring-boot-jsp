package com.bazarlist;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

import java.io.IOException;

@SpringBootApplication
public class MyApplication {

  @Value("classpath*:dozer/**/*.xml")
  private Resource[] resourceList;

  @Bean(name = "org.dozer.Mapper")
  public DozerBeanMapper dozerBean() {
    DozerBeanMapper dozerBean = new DozerBeanMapper();
    for (Resource resource : resourceList) {
      try {
        dozerBean.addMapping(resource.getInputStream());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return dozerBean;
  }

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(MyApplication.class, args);
    //context.getBean(JsonFileParser.class).parseTest();
  }
}
