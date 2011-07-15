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
import java.util.List;

import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class GameEvents implements Serializable {
    
    @Path("inning") List<Inning> innings;
    @Path("atBat/@pid") int atBat;
    @Path("deck/@pid") int deck;
    @Path("hole/@pid") int hole;

    public List<Inning> getInnings() {
        return innings;
    }

    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }

    public int getAtBat() {
        return atBat;
    }

    public void setAtBat(int atBat) {
        this.atBat = atBat;
    }

    public int getDeck() {
        return deck;
    }

    public void setDeck(int deck) {
        this.deck = deck;
    }

    public int getHole() {
        return hole;
    }

    public void setHole(int hole) {
        this.hole = hole;
    }
    
}
