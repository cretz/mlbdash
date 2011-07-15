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
package org.mlbdash.shared.gdx.gameevents;

import java.io.Serializable;
import java.util.Date;

import name.pehl.piriti.commons.client.Format;
import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class AtBat extends Event implements Serializable {

    @Path("@num") short number;
    @Path("@start_tfs") int startTfs;
    @Path("@start_tfs_zulu") @Format("yyyy-MM-dd't'hh:mm:ss'Z'") Date startTfsDate;
    @Path("@p_throws") char pitcherThrows;
    @Path("@score") Character score;
    @Path("@home_team_runs") short homeTeamRuns;
    @Path("@away_team_runs") short awayTeamRuns;
    @Path("@rbi") short rbi;

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public int getStartTfs() {
        return startTfs;
    }

    public void setStartTfs(int startTfs) {
        this.startTfs = startTfs;
    }

    public Date getStartTfsDate() {
        return startTfsDate;
    }

    public void setStartTfsDate(Date startTfsDate) {
        this.startTfsDate = startTfsDate;
    }

    public char getPitcherThrows() {
        return pitcherThrows;
    }

    public void setPitcherThrows(char pitcherThrows) {
        this.pitcherThrows = pitcherThrows;
    }

    public Character getScore() {
        return score;
    }

    public void setScore(Character score) {
        this.score = score;
    }

    public short getHomeTeamRuns() {
        return homeTeamRuns;
    }

    public void setHomeTeamRuns(short homeTeamRuns) {
        this.homeTeamRuns = homeTeamRuns;
    }

    public short getAwayTeamRuns() {
        return awayTeamRuns;
    }

    public void setAwayTeamRuns(short awayTeamRuns) {
        this.awayTeamRuns = awayTeamRuns;
    }

    public short getRbi() {
        return rbi;
    }

    public void setRbi(short rbi) {
        this.rbi = rbi;
    }

}
