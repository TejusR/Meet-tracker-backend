package edu.nitt.delta.meettracker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Team {

    private String TeamName;
    private String[] Members;
}
