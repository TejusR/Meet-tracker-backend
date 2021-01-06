package edu.nitt.delta.meettracker.repository;

import edu.nitt.delta.meettracker.model.Meetings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingsRepository extends MongoRepository<Meetings, String> {

}