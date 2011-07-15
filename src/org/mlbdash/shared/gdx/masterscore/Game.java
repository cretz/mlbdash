/*
 * Copyright 2011 Chad Retz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.mlbdash.shared.gdx.masterscore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import name.pehl.piriti.commons.client.Format;
import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class Game implements Serializable {

    @Path("@id") String id;
    @Path("@venue") String venue;
    @Path("@game_pk") int gamePk;
    @Path("@time") String time;
    @Path("@time_zone") String timeZone;
    @Path("@ampm") String ampm;
    @Path("@away_time") String awayTime;
    @Path("@away_time_zone") String awayTimeZone;
    @Path("@away_ampm") String awayAmpm;
    @Path("@home_time") String homeTime;
    @Path("@home_time_zone") String homeTimeZone;
    @Path("@home_ampm") String homeAmpm;
    @Path("@game_type") char gameType;
    @Path("@resume_date") @Format("yyyy-MM-dd") Date resumeDate;
    @Path("@venue_id") short venueId;
    @Path("@scheduled_innings") short scheduledInnings;
    @Path("@away_name_abbrev") String awayNameAbbreviation;
    @Path("@home_name_abbrev") String homeNameAbbreviation;
    @Path("@away_code") String awayCode;
    @Path("@away_team_city") String awayTeamCity;
    @Path("@away_team_name") String awayTeamName;
    @Path("@away_division") char awayDivision;
    @Path("@away_league_id") short awayLeagueId;
    @Path("@home_code") String homeCode;
    @Path("@home_team_city") String homeTeamCity;
    @Path("@home_team_name") String homeTeamName;
    @Path("@home_division") char homeDivision;
    @Path("@home_league_id") short homeLeagueId;
    @Path("@away_games_back") String awayGamesBack;
    @Path("@home_games_back") String homeGamesBack;
    @Path("@away_games_back_wildcard") String awayGamesBackWildcard;
    @Path("@home_games_back_wildcard") String homeGamesBackWildcard;
    @Path("@gameday") String gameday;
    @Path("@away_win") short awayWin;
    @Path("@away_loss") short awayLoss;
    @Path("@home_win") short homeWin;
    @Path("@home_loss") short homeLoss;
    
    @Path("status/@status") String status;    
    @Path("status/@reason") String reason;    
    @Path("status/@inning") short inning;
    @Path("status/@top_inning") char topInning;    
    @Path("status/@b") short balls;    
    @Path("status/@s") short strikes;    
    @Path("status/@o") short outs;    
    @Path("status/@inning_state") String inningState;
    
    @Path("linescore/inning") List<AwayHomeNumber> innings;
    @Path("linescore/r") AwayHomeNumber runs;
    @Path("linescore/h") AwayHomeNumber hits;
    @Path("linescore/e") AwayHomeNumber errors;
    
    @Path("home_runs/player") List<HomeRunPlayer> homeRuns;

    @Path("winning_pitcher") Pitcher winningPitcher;
    @Path("losing_pitcher") Pitcher losingPitcher;
    @Path("save_pitcher") Pitcher savePitcher;
    
    @Path("links/@wrapup") String wrapupUrl;
    @Path("links/@home_preview") String homePreviewUrl;
    @Path("links/@away_preview") String awayPreviewUrl;
    @Path("links/@previewUrl") String previewUrl;

    @Path("broadcast/home/tv") String homeTv;
    @Path("broadcast/home/radio") String homeRadio;
    @Path("broadcast/home/tv") String awayTv;
    @Path("broadcast/home/radio") String awayRadio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getGamePk() {
        return gamePk;
    }

    public void setGamePk(int gamePk) {
        this.gamePk = gamePk;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getAwayTime() {
        return awayTime;
    }

    public void setAwayTime(String awayTime) {
        this.awayTime = awayTime;
    }

    public String getAwayTimeZone() {
        return awayTimeZone;
    }

    public void setAwayTimeZone(String awayTimeZone) {
        this.awayTimeZone = awayTimeZone;
    }

    public String getAwayAmpm() {
        return awayAmpm;
    }

    public void setAwayAmpm(String awayAmpm) {
        this.awayAmpm = awayAmpm;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public void setHomeTime(String homeTime) {
        this.homeTime = homeTime;
    }

    public String getHomeTimeZone() {
        return homeTimeZone;
    }

    public void setHomeTimeZone(String homeTimeZone) {
        this.homeTimeZone = homeTimeZone;
    }

    public String getHomeAmpm() {
        return homeAmpm;
    }

    public void setHomeAmpm(String homeAmpm) {
        this.homeAmpm = homeAmpm;
    }

    public char getGameType() {
        return gameType;
    }

    public void setGameType(char gameType) {
        this.gameType = gameType;
    }

    public Date getResumeDate() {
        return resumeDate;
    }

    public void setResumeDate(Date resumeDate) {
        this.resumeDate = resumeDate;
    }

    public short getVenueId() {
        return venueId;
    }

    public void setVenueId(short venueId) {
        this.venueId = venueId;
    }

    public short getScheduledInnings() {
        return scheduledInnings;
    }

    public void setScheduledInnings(short scheduledInnings) {
        this.scheduledInnings = scheduledInnings;
    }

    public String getAwayNameAbbreviation() {
        return awayNameAbbreviation;
    }

    public void setAwayNameAbbreviation(String awayNameAbbreviation) {
        this.awayNameAbbreviation = awayNameAbbreviation;
    }

    public String getHomeNameAbbreviation() {
        return homeNameAbbreviation;
    }

    public void setHomeNameAbbreviation(String homeNameAbbreviation) {
        this.homeNameAbbreviation = homeNameAbbreviation;
    }

    public String getAwayCode() {
        return awayCode;
    }

    public void setAwayCode(String awayCode) {
        this.awayCode = awayCode;
    }

    public String getAwayTeamCity() {
        return awayTeamCity;
    }

    public void setAwayTeamCity(String awayTeamCity) {
        this.awayTeamCity = awayTeamCity;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public char getAwayDivision() {
        return awayDivision;
    }

    public void setAwayDivision(char awayDivision) {
        this.awayDivision = awayDivision;
    }

    public short getAwayLeagueId() {
        return awayLeagueId;
    }

    public void setAwayLeagueId(short awayLeagueId) {
        this.awayLeagueId = awayLeagueId;
    }

    public String getHomeCode() {
        return homeCode;
    }

    public void setHomeCode(String homeCode) {
        this.homeCode = homeCode;
    }

    public String getHomeTeamCity() {
        return homeTeamCity;
    }

    public void setHomeTeamCity(String homeTeamCity) {
        this.homeTeamCity = homeTeamCity;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public char getHomeDivision() {
        return homeDivision;
    }

    public void setHomeDivision(char homeDivision) {
        this.homeDivision = homeDivision;
    }

    public short getHomeLeagueId() {
        return homeLeagueId;
    }

    public void setHomeLeagueId(short homeLeagueId) {
        this.homeLeagueId = homeLeagueId;
    }

    public String getAwayGamesBack() {
        return awayGamesBack;
    }

    public void setAwayGamesBack(String awayGamesBack) {
        this.awayGamesBack = awayGamesBack;
    }

    public String getHomeGamesBack() {
        return homeGamesBack;
    }

    public void setHomeGamesBack(String homeGamesBack) {
        this.homeGamesBack = homeGamesBack;
    }

    public String getAwayGamesBackWildcard() {
        return awayGamesBackWildcard;
    }

    public void setAwayGamesBackWildcard(String awayGamesBackWildcard) {
        this.awayGamesBackWildcard = awayGamesBackWildcard;
    }

    public String getHomeGamesBackWildcard() {
        return homeGamesBackWildcard;
    }

    public void setHomeGamesBackWildcard(String homeGamesBackWildcard) {
        this.homeGamesBackWildcard = homeGamesBackWildcard;
    }

    public String getGameday() {
        return gameday;
    }

    public void setGameday(String gameday) {
        this.gameday = gameday;
    }

    public short getAwayWin() {
        return awayWin;
    }

    public void setAwayWin(short awayWin) {
        this.awayWin = awayWin;
    }

    public short getAwayLoss() {
        return awayLoss;
    }

    public void setAwayLoss(short awayLoss) {
        this.awayLoss = awayLoss;
    }

    public short getHomeWin() {
        return homeWin;
    }

    public void setHomeWin(short homeWin) {
        this.homeWin = homeWin;
    }

    public short getHomeLoss() {
        return homeLoss;
    }

    public void setHomeLoss(short homeLoss) {
        this.homeLoss = homeLoss;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public short getInning() {
        return inning;
    }

    public void setInning(short inning) {
        this.inning = inning;
    }

    public char getTopInning() {
        return topInning;
    }

    public void setTopInning(char topInning) {
        this.topInning = topInning;
    }

    public short getBalls() {
        return balls;
    }

    public void setBalls(short balls) {
        this.balls = balls;
    }

    public short getStrikes() {
        return strikes;
    }

    public void setStrikes(short strikes) {
        this.strikes = strikes;
    }

    public short getOuts() {
        return outs;
    }

    public void setOuts(short outs) {
        this.outs = outs;
    }

    public String getInningState() {
        return inningState;
    }

    public void setInningState(String inningState) {
        this.inningState = inningState;
    }

    public List<AwayHomeNumber> getInnings() {
        return innings;
    }

    public void setInnings(List<AwayHomeNumber> innings) {
        this.innings = innings;
    }

    public AwayHomeNumber getRuns() {
        return runs;
    }

    public void setRuns(AwayHomeNumber runs) {
        this.runs = runs;
    }

    public AwayHomeNumber getHits() {
        return hits;
    }

    public void setHits(AwayHomeNumber hits) {
        this.hits = hits;
    }

    public AwayHomeNumber getErrors() {
        return errors;
    }

    public void setErrors(AwayHomeNumber errors) {
        this.errors = errors;
    }

    public List<HomeRunPlayer> getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(List<HomeRunPlayer> homeRuns) {
        this.homeRuns = homeRuns;
    }

    public Pitcher getWinningPitcher() {
        return winningPitcher;
    }

    public void setWinningPitcher(Pitcher winningPitcher) {
        this.winningPitcher = winningPitcher;
    }

    public Pitcher getLosingPitcher() {
        return losingPitcher;
    }

    public void setLosingPitcher(Pitcher losingPitcher) {
        this.losingPitcher = losingPitcher;
    }

    public Pitcher getSavePitcher() {
        return savePitcher;
    }

    public void setSavePitcher(Pitcher savePitcher) {
        this.savePitcher = savePitcher;
    }

    public String getWrapupUrl() {
        return wrapupUrl;
    }

    public void setWrapupUrl(String wrapupUrl) {
        this.wrapupUrl = wrapupUrl;
    }

    public String getHomePreviewUrl() {
        return homePreviewUrl;
    }

    public void setHomePreviewUrl(String homePreviewUrl) {
        this.homePreviewUrl = homePreviewUrl;
    }

    public String getAwayPreviewUrl() {
        return awayPreviewUrl;
    }

    public void setAwayPreviewUrl(String awayPreviewUrl) {
        this.awayPreviewUrl = awayPreviewUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getHomeTv() {
        return homeTv;
    }

    public void setHomeTv(String homeTv) {
        this.homeTv = homeTv;
    }

    public String getHomeRadio() {
        return homeRadio;
    }

    public void setHomeRadio(String homeRadio) {
        this.homeRadio = homeRadio;
    }

    public String getAwayTv() {
        return awayTv;
    }

    public void setAwayTv(String awayTv) {
        this.awayTv = awayTv;
    }

    public String getAwayRadio() {
        return awayRadio;
    }

    public void setAwayRadio(String awayRadio) {
        this.awayRadio = awayRadio;
    }

}
