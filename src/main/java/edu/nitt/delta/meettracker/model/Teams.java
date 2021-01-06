package edu.nitt.delta.meettracker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Teams {

    private String TeamName;
    private String[] Members;
}
