package edu.nitt.delta.meettracker.service;

import edu.nitt.delta.meettracker.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamMemberService {

    @Autowired private TeamRepository teamRepository;

    public List<String> getNameList(String teamName) {
        return teamRepository.findbyTeamName(teamName);
    }

}
