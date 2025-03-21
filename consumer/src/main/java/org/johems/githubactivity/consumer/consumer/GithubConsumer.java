package org.johems.githubactivity.consumer.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.johems.githubactivity.producer.payload.GitHubEvent;

import static java.lang.String.format;

@Service
@Slf4j
public class GithubConsumer {

    private final String GITHUB_TOPIC = "Github-stream";
    private final String GroupID = "GithubGroup";

//    @KafkaListener(topics = GITHUB_TOPIC, groupId = GroupID)
//    public void consumeMessage(String message) {
//        log.info(format("Consuming message from %s:: %s",GITHUB_TOPIC, message));
//
//    }

    @KafkaListener(topics = GITHUB_TOPIC, groupId = GroupID)
    public void consumeJsonMessage(GitHubEvent event) {
        log.info(format("Consuming message from %s:: %s", GITHUB_TOPIC,event.toString()));
    }
}
