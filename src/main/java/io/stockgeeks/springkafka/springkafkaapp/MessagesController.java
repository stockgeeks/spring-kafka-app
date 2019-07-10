package io.stockgeeks.springkafka.springkafkaapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessagesController {

  private final SimpleProducer simpleProducer;

  public MessagesController(SimpleProducer simpleProducer) {
    this.simpleProducer = simpleProducer;
  }

  @PostMapping("/message")
  public ResponseEntity<String> message(@RequestBody Message message) {
    simpleProducer.send(message.getMessage());
    return ResponseEntity.ok("Message sent");
  }
}
