package edu.nitt.delta.meettracker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Meeting {

    private String TeamId;
    private Integer Date;
    private String[] PresentPeople;
    private String MOM_url;
}
