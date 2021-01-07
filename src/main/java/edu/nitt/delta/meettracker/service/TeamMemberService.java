package edu.nitt.delta.meettracker.service;

import edu.nitt.delta.meettracker.model.Team;
import edu.nitt.delta.meettracker.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TeamMemberService {

    @Autowired private TeamRepository teamRepository;

    public List<String> getNameList(String teamName) {
        Team team = teamRepository.findByTeamName(teamName);
        return Arrays.asList(team.getMembers());
    }

}
