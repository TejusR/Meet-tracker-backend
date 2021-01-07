package edu.nitt.delta.meettracker.controller.api;

import edu.nitt.delta.meettracker.service.TeamMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamMemberController {

    @Autowired private TeamMemberService teamMemberService;

    @GetMapping(path = "/team/{teamName}")
    public ResponseEntity<?> teamMemberList(@PathVariable("teamName") String teamName) {
        try {
            return ResponseEntity.ok(teamMemberService.getNameList(teamName));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getClass(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
