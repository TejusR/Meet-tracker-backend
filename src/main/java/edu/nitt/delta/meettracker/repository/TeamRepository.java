package edu.nitt.delta.meettracker.repository;

import edu.nitt.delta.meettracker.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends MongoRepository<Team, String> {

    public List<String> getAllTeams();

    public List<String> findbyTeamName(String TeamName);
}