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
package org.mlbdash.shared.gdx.inning;

import java.io.Serializable;

import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class Inning implements Serializable {

    @Path("@num") short number;
    @Path("@away_team") String awayTeam;
    @Path("@home_team") String homeTeam;
    @Path("next") char next;
    @Path("top") HalfInning top;
    @Path("bottom") HalfInning bottom;

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public char getNext() {
        return next;
    }

    public void setNext(char next) {
        this.next = next;
    }

    public HalfInning getTop() {
        return top;
    }

    public void setTop(HalfInning top) {
        this.top = top;
    }

    public HalfInning getBottom() {
        return bottom;
    }

    public void setBottom(HalfInning bottom) {
        this.bottom = bottom;
    }
    
}
