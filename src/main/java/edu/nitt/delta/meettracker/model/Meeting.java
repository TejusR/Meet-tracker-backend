package edu.nitt.delta.meettracker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Meeting {

    private String teamId;
    private Integer date;
    private String[] attendees;
    private String MOM_url;
}
