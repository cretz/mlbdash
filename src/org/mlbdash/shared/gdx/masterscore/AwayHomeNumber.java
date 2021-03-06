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

import name.pehl.piriti.commons.client.Path;

@SuppressWarnings("serial")
public class AwayHomeNumber implements Serializable {

    @Path("@away") short away;
    @Path("@home") short home;
    @Path("@diff") Short diff;

    public short getAway() {
        return away;
    }

    public void setAway(short away) {
        this.away = away;
    }

    public short getHome() {
        return home;
    }

    public void setHome(short home) {
        this.home = home;
    }

    public Short getDiff() {
        return diff;
    }

    public void setDiff(Short diff) {
        this.diff = diff;
    }

}
