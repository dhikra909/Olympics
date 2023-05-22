package com.Olympic.Olympic.Slack;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SlackPayload {

    private String text;
    public SlackPayload(String text){this.text=text;}

}
