package com.crick.app.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Table(name = "crick_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;


    private String teamHeading;


    private String matchNumberVenue;


    private String battingTeam;


    private String battingTeamScore;


    private String bowlTeam;


    private String bowlTeamScore;

    private String liveText;
    private String matchLink;
    private String textComplete;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;


    private LocalDateTime date;

    // Default constructor
    public Match() {
        // Default constructor
    }

    // Parameterized constructor
    public Match(String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete, MatchStatus status, LocalDateTime date) {
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", teamHeading='" + teamHeading + '\'' +
                ", matchNumberVenue='" + matchNumberVenue + '\'' +
                ", battingTeam='" + battingTeam + '\'' +
                ", battingTeamScore='" + battingTeamScore + '\'' +
                ", bowlTeam='" + bowlTeam + '\'' +
                ", bowlTeamScore='" + bowlTeamScore + '\'' +
                ", liveText='" + liveText + '\'' +
                ", matchLink='" + matchLink + '\'' +
                ", textComplete='" + textComplete + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }

    // Getters and Setters
    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
        setMatchStatus(); // Update status when textComplete is set
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setMatchStatus() {
        if (this.textComplete == null || this.textComplete.trim().isEmpty()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }
}
