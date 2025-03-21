package org.johems.githubactivity.producer.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Org {
    private int id;
    private String login;
    private String gravatar_id;
//    private String url;
    private String avatar_url;
}
