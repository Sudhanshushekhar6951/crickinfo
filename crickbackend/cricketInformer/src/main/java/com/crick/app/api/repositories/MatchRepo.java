package com.crick.app.api.repositories;

import com.crick.app.api.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface MatchRepo extends JpaRepository<Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);

}