package io.stockgeeks.springkafka.springkafkaapp;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducer {

  private KafkaTemplate<String, String> simpleProducer;

  public SimpleProducer(KafkaTemplate<String, String> simpleProducer) {
    this.simpleProducer = simpleProducer;
  }
  public void send(String message) {
    simpleProducer.send("simple-message", message);
  }
}
