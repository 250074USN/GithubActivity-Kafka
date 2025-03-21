package org.johems.githubactivity.producer.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubEvent {
    private String id;
    private String type;
    private Actor actor;
    private Repo repo;
    private boolean publi;
    private String created_at;
    private Org org;
}
