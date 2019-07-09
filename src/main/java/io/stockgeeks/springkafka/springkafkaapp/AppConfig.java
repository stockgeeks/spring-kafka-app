package io.stockgeeks.springkafka.springkafkaapp;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

@Component
public class AppConfig {

  @Bean
  public Executor messageProducerSingleThreadExecutor() {
    ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
    threadPoolTaskExecutor.setCorePoolSize(1);
    threadPoolTaskExecutor.setQueueCapacity(1_000);
    return threadPoolTaskExecutor;
  }

}
