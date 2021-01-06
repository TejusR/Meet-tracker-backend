package edu.nitt.delta.meettracker.service;


import edu.nitt.delta.meettracker.model.Team;
import edu.nitt.delta.meettracker.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAllTeamsService {
    @Autowired private TeamRepository teamRepository;

    public List<String> getAllTeams() {
        List<Team> allTeams =  teamRepository.findAll();
        List<String> teamNames = new ArrayList<>();
        for (Team t : allTeams)
            teamNames.add(t.getTeamName());
        return teamNames;

    }
}
