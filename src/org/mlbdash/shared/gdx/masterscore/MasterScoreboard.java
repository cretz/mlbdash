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
public class MasterScoreboard implements Serializable {

    @Path("@year") short year;
    @Path("@month") short month;
    @Path("@day") short day;
    @Path("@modified_date") @Format("yyyy-MM-dd'T'HH:mm:ss'Z'") Date modifiedDate;
    @Path("@next_day_date") @Format("yyyy-MM-dd") Date nextDayDate;
    @Path("game") List<Game> games;

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public short getDay() {
        return day;
    }

    public void setDay(short day) {
        this.day = day;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getNextDayDate() {
        return nextDayDate;
    }

    public void setNextDayDate(Date nextDayDate) {
        this.nextDayDate = nextDayDate;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
    
}
