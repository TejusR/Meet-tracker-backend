package edu.nitt.delta.meettracker.controller.api.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMeetingRequest {
    private String teamId;
    private Integer date;
    private String[] attendees;

}
