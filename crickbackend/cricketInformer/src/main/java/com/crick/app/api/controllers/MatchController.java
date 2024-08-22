package com.crick.app.api.controllers;

import com.crick.app.api.entities.Match;
import com.crick.app.api.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")

public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        List<Match> matches = this.matchService.getLiveMatches();
        return new ResponseEntity<>(matches, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        List<Match> matches = this.matchService.getallMatches();
        return new ResponseEntity<>(matches, HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable() {
        List<List<String>> matches = this.matchService.getPointTable();
        return new ResponseEntity<>(matches, HttpStatus.OK);
    }
}
