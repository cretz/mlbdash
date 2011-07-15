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
package org.mlbdash;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.mlbdash.client.gdx.inning.InningReaderTest;
import org.mlbdash.client.gdx.masterscore.MasterScoreboardReaderTest;

import com.google.gwt.junit.tools.GWTTestSuite;

public class MlbDashGwtTestSuite extends GWTTestSuite {
    
    public static Test suite() {
        TestSuite suite = new TestSuite("Test for client-side MlbDash");
        //XXX: please keep in package-then-alphabetical order 
        suite.addTestSuite(InningReaderTest.class);
        suite.addTestSuite(MasterScoreboardReaderTest.class);
        return suite;
    }

}
