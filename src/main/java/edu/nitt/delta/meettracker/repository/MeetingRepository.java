package edu.nitt.delta.meettracker.repository;

import edu.nitt.delta.meettracker.model.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends MongoRepository<Meeting, String> {

}