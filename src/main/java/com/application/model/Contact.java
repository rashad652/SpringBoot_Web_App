package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String mobileNum;

    @Setter
    @Getter
    private String email;

    @Setter
    @Getter
    private String subject;

    @Setter
    @Getter
    private String message;

    @Override
    public String toString() {
        return "\nname: " + name + "\nnumber: " + mobileNum + "\nemail: " + email + "\nsubject: " +
                subject + "\nmessage: " + message;
    }
}
