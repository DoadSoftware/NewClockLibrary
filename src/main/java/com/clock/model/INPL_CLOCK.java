package com.clock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class INPL_CLOCK {

    @JsonProperty("Scoreboard")
    private String scoreboard;
    
    @JsonProperty("Version")
    private String version;
    
    @JsonProperty("ScoreboardFields")
    private ScoreboardFields scoreboardFields;

    public static class ScoreboardFields {
        
        @JsonProperty("PeriodTime")
        private Time periodTime;
        
        @JsonProperty("TimeoutTime")
        private Time timeoutTime;
        
        @JsonProperty("TimeoutType")
        private Stats timeoutType;
        
        @JsonProperty("TimeOfDay")
        private Stats timeOfDay;
        
        @JsonProperty("MainClockSource")
        private Stats mainClockSource;
        
        @JsonProperty("ShotClockTime")
        private Time shotClockTime;
        
        @JsonProperty("Team1Name")
        private Stats team1Name;
        
        @JsonProperty("Team2Name")
        private Stats team2Name;
        
        @JsonProperty("Team1PlayerStatistics")
        private TeamPlayerStatistics team1PlayerStatistics;
        
        @JsonProperty("Team2PlayerStatistics")
        private TeamPlayerStatistics team2PlayerStatistics;
        
        @JsonProperty("Team1Score")
        private Stats team1Score;
        
        @JsonProperty("Team1Fouls")
        private Stats team1Fouls;
        
        @JsonProperty("Team1Tol")
        private Stats team1Tol;
        
        @JsonProperty("Team1SingleBonus")
        private Stats team1SingleBonus;
        
        @JsonProperty("Team1DoubleBonus")
        private Stats team1DoubleBonus;
        
        @JsonProperty("Team2Score")
        private Stats team2Score;
        
        @JsonProperty("Team2Fouls")
        private Stats team2Fouls;
        
        @JsonProperty("Team2Tol")
        private Stats team2Tol;
        
        @JsonProperty("Team2SingleBonus")
        private Stats team2SingleBonus;
        
        @JsonProperty("Team2DoubleBonus")
        private Stats team2DoubleBonus;
        
        @JsonProperty("Period")
        private Stats period;
        
        @JsonProperty("GamePossession")
        private Stats gamePossession;

		public Time getPeriodTime() {
			return periodTime;
		}

		public void setPeriodTime(Time periodTime) {
			this.periodTime = periodTime;
		}

		public Time getTimeoutTime() {
			return timeoutTime;
		}

		public void setTimeoutTime(Time timeoutTime) {
			this.timeoutTime = timeoutTime;
		}

		public Stats getTimeoutType() {
			return timeoutType;
		}

		public void setTimeoutType(Stats timeoutType) {
			this.timeoutType = timeoutType;
		}

		public Stats getTimeOfDay() {
			return timeOfDay;
		}

		public void setTimeOfDay(Stats timeOfDay) {
			this.timeOfDay = timeOfDay;
		}

		public Stats getMainClockSource() {
			return mainClockSource;
		}

		public void setMainClockSource(Stats mainClockSource) {
			this.mainClockSource = mainClockSource;
		}

		public Time getShotClockTime() {
			return shotClockTime;
		}

		public void setShotClockTime(Time shotClockTime) {
			this.shotClockTime = shotClockTime;
		}

		public Stats getTeam1Name() {
			return team1Name;
		}

		public void setTeam1Name(Stats team1Name) {
			this.team1Name = team1Name;
		}

		public Stats getTeam2Name() {
			return team2Name;
		}

		public void setTeam2Name(Stats team2Name) {
			this.team2Name = team2Name;
		}

		public TeamPlayerStatistics getTeam1PlayerStatistics() {
			return team1PlayerStatistics;
		}

		public void setTeam1PlayerStatistics(TeamPlayerStatistics team1PlayerStatistics) {
			this.team1PlayerStatistics = team1PlayerStatistics;
		}

		public TeamPlayerStatistics getTeam2PlayerStatistics() {
			return team2PlayerStatistics;
		}

		public void setTeam2PlayerStatistics(TeamPlayerStatistics team2PlayerStatistics) {
			this.team2PlayerStatistics = team2PlayerStatistics;
		}

		public Stats getTeam1Score() {
			return team1Score;
		}

		public void setTeam1Score(Stats team1Score) {
			this.team1Score = team1Score;
		}

		public Stats getTeam1Fouls() {
			return team1Fouls;
		}

		public void setTeam1Fouls(Stats team1Fouls) {
			this.team1Fouls = team1Fouls;
		}

		public Stats getTeam1Tol() {
			return team1Tol;
		}

		public void setTeam1Tol(Stats team1Tol) {
			this.team1Tol = team1Tol;
		}

		public Stats getTeam1SingleBonus() {
			return team1SingleBonus;
		}

		public void setTeam1SingleBonus(Stats team1SingleBonus) {
			this.team1SingleBonus = team1SingleBonus;
		}

		public Stats getTeam1DoubleBonus() {
			return team1DoubleBonus;
		}

		public void setTeam1DoubleBonus(Stats team1DoubleBonus) {
			this.team1DoubleBonus = team1DoubleBonus;
		}

		public Stats getTeam2Score() {
			return team2Score;
		}

		public void setTeam2Score(Stats team2Score) {
			this.team2Score = team2Score;
		}

		public Stats getTeam2Fouls() {
			return team2Fouls;
		}

		public void setTeam2Fouls(Stats team2Fouls) {
			this.team2Fouls = team2Fouls;
		}

		public Stats getTeam2Tol() {
			return team2Tol;
		}

		public void setTeam2Tol(Stats team2Tol) {
			this.team2Tol = team2Tol;
		}

		public Stats getTeam2SingleBonus() {
			return team2SingleBonus;
		}

		public void setTeam2SingleBonus(Stats team2SingleBonus) {
			this.team2SingleBonus = team2SingleBonus;
		}

		public Stats getTeam2DoubleBonus() {
			return team2DoubleBonus;
		}

		public void setTeam2DoubleBonus(Stats team2DoubleBonus) {
			this.team2DoubleBonus = team2DoubleBonus;
		}

		public Stats getPeriod() {
			return period;
		}

		public void setPeriod(Stats period) {
			this.period = period;
		}

		public Stats getGamePossession() {
			return gamePossession;
		}

		public void setGamePossession(Stats gamePossession) {
			this.gamePossession = gamePossession;
		}

		public ScoreboardFields() {
			super();
			// TODO Auto-generated constructor stub
		}
        
    }

    public static class Time {
        @JsonProperty("CurrentTime")
        private String currentTime;
        
        @JsonProperty("Running")
        private String running;
        
        @JsonProperty("Direction")
        private String direction;

		public String getCurrentTime() {
			return currentTime;
		}

		public void setCurrentTime(String currentTime) {
			this.currentTime = currentTime;
		}

		public String getRunning() {
			return running;
		}

		public void setRunning(String running) {
			this.running = running;
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public Time() {
			super();
			// TODO Auto-generated constructor stub
		}
        
    }
    public static class Stats {
        @JsonProperty("Value")
        private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Stats() {
			super();
			// TODO Auto-generated constructor stub
		}
        
    }

    public static class TeamPlayerStatistics {
        @JsonProperty("Players")
        private List<Player> players;

		public List<Player> getPlayers() {
			return players;
		}

		public void setPlayers(List<Player> players) {
			this.players = players;
		}

		public TeamPlayerStatistics() {
			super();
			// TODO Auto-generated constructor stub
		}
        
    }

    public static class Player {
        @JsonProperty("Name")
        private String name;
        
        @JsonProperty("Number")
        private String number;
        
        @JsonProperty("Points")
        private String points;
        
        @JsonProperty("Fouls")
        private String fouls;
        
        @JsonProperty("OnCourt")
        private String onCourt;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getPoints() {
			return points;
		}

		public void setPoints(String points) {
			this.points = points;
		}

		public String getFouls() {
			return fouls;
		}

		public void setFouls(String fouls) {
			this.fouls = fouls;
		}

		public String getOnCourt() {
			return onCourt;
		}

		public void setOnCourt(String onCourt) {
			this.onCourt = onCourt;
		}

		public Player() {
			super();
			// TODO Auto-generated constructor stub
		}
        
    }

    public String getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(String scoreboard) {
        this.scoreboard = scoreboard;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ScoreboardFields getScoreboardFields() {
        return scoreboardFields;
    }

    public void setScoreboardFields(ScoreboardFields scoreboardFields) {
        this.scoreboardFields = scoreboardFields;
    }
}
