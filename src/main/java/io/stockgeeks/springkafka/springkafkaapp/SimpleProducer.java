package io.stockgeeks.springkafka.springkafkaapp;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicBoolean;

@Repository
public class SimpleProducer {

  private KafkaTemplate<String, String> simpleProducer;
  private AtomicBoolean automaticProducerEnabled = new AtomicBoolean(true);

  public SimpleProducer(KafkaTemplate<String, String> simpleProducer) {
    this.simpleProducer = simpleProducer;
  }
  public void send(String message) {
    simpleProducer.send("simple-topic", message);
  }

  @Async("messageProducerThreadExecutor")
  public void produceMessages() {
    while(automaticProducerEnabled.get()) {
      // TODO - GENERATE RANDOM WORDS... possibly show 2 ways using a library or generating algorithm using char and random integers up to 26
    }
  }
}
