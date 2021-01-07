package edu.nitt.delta.meettracker.controller.api;

import edu.nitt.delta.meettracker.controller.api.request.CreateMeetingRequest;
import edu.nitt.delta.meettracker.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingController {
    @Autowired
    MeetingService meetingService;

    @PostMapping(path = "/createmeeting")
    public ResponseEntity<?> createMeeting(@RequestBody CreateMeetingRequest createMeetingRequest) throws Exception {
        try {
            meetingService.createMeeting(createMeetingRequest);
            return ResponseEntity.ok("Meeting created successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
