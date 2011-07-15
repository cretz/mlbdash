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
package org.mlbdash.client.gdx.masterscore;

import java.util.Date;

import org.mlbdash.client.BaseGwtTestCase;
import org.mlbdash.client.gdx.Resources;
import org.mlbdash.shared.gdx.masterscore.Game;
import org.mlbdash.shared.gdx.masterscore.MasterScoreboard;

public class MasterScoreboardReaderTest extends BaseGwtTestCase {
    
    @SuppressWarnings("deprecation")
    public void testSimpleValues() {
        //Go Rangers!
        MasterScoreboardReader reader = ginjector.getGamesReader();
        MasterScoreboard games = reader.read(Resources.INSTANCE.dutchCgsoMasterScoreboard().getText());
        assertEquals((short) 2011, games.getYear());
        assertEquals((short) 7, games.getMonth());
        assertEquals((short) 14, games.getDay());
        //don't verify the time right now...
        assertEquals(new Date(111, 6, 15), new Date(games.getModifiedDate().getYear(),
                games.getModifiedDate().getMonth(), games.getModifiedDate().getDate()));
        assertEquals(new Date(111, 6, 15), games.getNextDayDate());
        assertEquals(7, games.getGames().size());
        //grab Dutch's game...
        Game game = games.getGames().get(6);
        assertEquals("2011/07/14/texmlb-seamlb-1", game.getId());
    }
}
