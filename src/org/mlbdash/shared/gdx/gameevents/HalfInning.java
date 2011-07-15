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
public class HalfInning implements Serializable {

    @Path("atbat") List<AtBat> atBats;
    @Path("action") List<Action> actions;

    public List<AtBat> getAtBats() {
        return atBats;
    }

    public void setAtBats(List<AtBat> atBats) {
        this.atBats = atBats;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

}
