package org.johems.githubactivity.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.johems.githubactivity.producer.payload.GitHubEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GithubProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "Github-stream";

//    public void sendMessage(String message) {
//        //log.info(String.format("Sending message to topic1_student:: %s", message));
//
//        kafkaTemplate.send("Github-stream", message);
//    }

    public void sendMessage(GitHubEvent event) {
//        log.info("Sending message {}", event);
        Message<GitHubEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .build();

        log.info("Sending message {}", message);
        kafkaTemplate.send(message);
    }
}

