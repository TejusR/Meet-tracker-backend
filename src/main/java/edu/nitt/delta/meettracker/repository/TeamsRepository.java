package edu.nitt.delta.meettracker.repository;

import edu.nitt.delta.meettracker.model.Teams;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsRepository extends MongoRepository<Teams, String> {

}