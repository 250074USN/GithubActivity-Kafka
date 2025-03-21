package org.johems.githubactivity.producer.stream;

import lombok.extern.slf4j.Slf4j;
import org.johems.githubactivity.producer.payload.GitHubEvent;
import org.johems.githubactivity.producer.producer.GithubProducer;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class GithubStreamConsumer {
    private final WebClient webClient;
    private final GithubProducer producer;


    public GithubStreamConsumer(WebClient.Builder webClientBuilder, GithubProducer producer) {
        this.webClient = webClientBuilder
                .baseUrl("https://api.github.com")
                .build();
        this.producer = producer;
    }

    public void ConsumeStreamAndPublish() {
         webClient.get()
                 .uri("/events")
                 .retrieve()
                 .bodyToFlux(GitHubEvent.class)
                 .subscribe(producer::sendMessage);

//         .uri("/events")
    }
}
