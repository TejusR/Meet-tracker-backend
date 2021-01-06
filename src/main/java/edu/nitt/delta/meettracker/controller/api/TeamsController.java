package edu.nitt.delta.meettracker.controller.api;


import edu.nitt.delta.meettracker.service.GetAllTeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {
    @Autowired
    public GetAllTeamsService getAllTeamsService;

    @GetMapping("/allteams")
    public ResponseEntity<?> getAllTeams() {
        try {
            return ResponseEntity.ok(getAllTeamsService.getAllTeams());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
