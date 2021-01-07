package edu.nitt.delta.meettracker.service;

import edu.nitt.delta.meettracker.controller.api.request.CreateMeetingRequest;
import edu.nitt.delta.meettracker.model.Meeting;
import edu.nitt.delta.meettracker.model.Team;
import edu.nitt.delta.meettracker.repository.MeetingRepository;
import edu.nitt.delta.meettracker.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private TeamRepository teamRepository;

    public void createMeeting(CreateMeetingRequest createMeetingRequest) {
        Team team = teamRepository.findByTeamName(createMeetingRequest.getTeamId());
        Meeting meeting = Meeting.builder()
                .date(createMeetingRequest.getDate())
                .teamId(team.getTeamName())
                .attendees(createMeetingRequest.getAttendees())
                .build();
        meetingRepository.save(meeting);
    }

}
