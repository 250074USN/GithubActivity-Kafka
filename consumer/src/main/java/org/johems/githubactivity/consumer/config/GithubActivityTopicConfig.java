package org.johems.githubactivity.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class GithubActivityTopicConfig {

    @Bean
    public NewTopic GithubStreamTopic() {
        return TopicBuilder
                .name("Github-stream")
                .build();
    }
}
