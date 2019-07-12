package io.stockgeeks.springkafka.springkafkaapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SimpleConsumer {
  @KafkaListener(id = "simple-consumer", topics = "simple-message")
  public void consumeMessage(String message) {
    log.info("Consumer got message: {}", message);
  }
}
