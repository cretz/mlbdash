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
package org.mlbdash.client.gdx;

import com.google.gwt.inject.client.AbstractGinModule;

public class XmlReaderModule extends AbstractGinModule {

    @Override
    protected void configure() {
        
        //XXX: Please fully qualify all readers since there is ambiguity
        
        //gameevents
        bind(org.mlbdash.client.gdx.gameevents.ActionReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.gameevents.AtBatReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.gameevents.EventReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.gameevents.GameEventsReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.gameevents.HalfInningReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.gameevents.InningReader.class).asEagerSingleton();
        
        //inning
        bind(org.mlbdash.client.gdx.inning.ActionReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.inning.AtBatReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.inning.EventReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.inning.HalfInningReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.inning.InningReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.inning.PitchReader.class).asEagerSingleton();
        
        //masterscore
        bind(org.mlbdash.client.gdx.masterscore.AwayHomeNumberReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.masterscore.GameReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.masterscore.MasterScoreboardReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.masterscore.HomeRunPlayerReader.class).asEagerSingleton();
        bind(org.mlbdash.client.gdx.masterscore.PitcherReader.class).asEagerSingleton();
    }
    
}
