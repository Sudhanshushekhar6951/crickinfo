package com.crick.app.api.services;

import com.crick.app.api.entities.Match;

import java.util.List;


public interface MatchService {

    List<Match> getallMatches();

    List<Match> getLiveMatches();

    List<List<String>> getPointTable();



}
