package org.johems.githubactivity.producer.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@RequiredArgsConstructor
@ToString
public class Actor {

    private int id;
    private String login;
    private String display_login;
    private String gravatar_id;
    private String url;
//    private String avatar_url;

}
