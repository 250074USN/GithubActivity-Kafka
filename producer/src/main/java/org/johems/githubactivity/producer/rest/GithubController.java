package org.johems.githubactivity.producer.rest;

import lombok.RequiredArgsConstructor;
import org.johems.githubactivity.producer.stream.GithubStreamConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/github")
@RequiredArgsConstructor
public class GithubController {

    private final GithubStreamConsumer StreamConsumer;

    @GetMapping
     public void startPublishing() {
        StreamConsumer.ConsumeStreamAndPublish();
    }
}
