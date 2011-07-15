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
package org.mlbdash.client.gdx.inning;

import org.mlbdash.client.BaseGwtTestCase;
import org.mlbdash.client.gdx.Resources;
import org.mlbdash.shared.gdx.inning.Action;
import org.mlbdash.shared.gdx.inning.AtBat;
import org.mlbdash.shared.gdx.inning.Inning;

public class InningReaderTest extends BaseGwtTestCase {
    
    public void testSimpleValues() {
        //Go Rangers!
        InningReader reader = ginjector.getInningReader();
        Inning inning = reader.read(Resources.INSTANCE.alcs2010Inning9().getText());
        assertEquals((short) 9, inning.getNumber());
        assertNotNull(inning.getTop());
        assertNull(inning.getBottom());
        //did Feliz come in?
        assertTrue(inning.getTop().getEvents().get(0) instanceof Action);
        Action action = (Action) inning.getTop().getEvents().get(0);
        assertEquals((short) 0, action.getBalls());
        assertEquals((short) 0, action.getStrikes());
        assertEquals((short) 0, action.getOuts());
        assertEquals("Pitcher Change: Neftali Feliz replaces Colby Lewis.", 
                action.getDescription().trim());
        assertEquals("Pitching Substitution", action.getEvent());
        assertEquals(230144, action.getTfs());
        assertEquals(491703, action.getPlayer());
        assertEquals((short) 3, action.getPitch());
        //did a-roid strikeout to end the game?
        assertTrue(inning.getTop().getEvents().get(3) instanceof AtBat);
        AtBat atbat = (AtBat) inning.getTop().getEvents().get(3);
        assertEquals((short) 69, atbat.getNumber());
        assertEquals((short) 1, atbat.getBalls());
        assertEquals((short) 3, atbat.getStrikes());
        assertEquals((short) 3, atbat.getOuts());
        assertEquals(230726, atbat.getStartTfs());
        assertEquals(121347, atbat.getBatter());
        assertEquals('R', atbat.getStand());
        assertEquals("6-3", atbat.getHeight());
        assertEquals(491703, atbat.getPitcher());
        assertEquals('R', atbat.getPitcherThrows());
        assertEquals("Alex Rodriguez called out on strikes.", atbat.getDescription().trim());
        assertEquals("Strikeout", atbat.getEvent());
        //what did that last pitch look like?
        //TODO:
    }
}
