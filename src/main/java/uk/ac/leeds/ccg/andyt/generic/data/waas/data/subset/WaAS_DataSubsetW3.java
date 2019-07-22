/*
 * Copyright 2019 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.andyt.generic.data.waas.data.subset;

import uk.ac.leeds.ccg.andyt.generic.data.waas.data.id.WaAS_CollectionID;
import uk.ac.leeds.ccg.andyt.generic.data.waas.data.id.WaAS_W3ID;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import uk.ac.leeds.ccg.andyt.generic.data.waas.core.WaAS_Environment;

public class WaAS_DataSubsetW3 extends WaAS_DataSubset {

    /**
     * Lookup from WaAS_CollectionID to WaAS_W3ID.
     */
    public TreeMap<WaAS_CollectionID, HashSet<WaAS_W3ID>> c_To_w3;

    /**
     * Lookup from WaAS_W3ID to WaAS_CollectionID.
     */
    public HashMap<WaAS_W3ID, WaAS_CollectionID> w3_To_c;

    /**
     *
     * @param e
     * @param cSize
     * @param w3IDs
     */
    public WaAS_DataSubsetW3(WaAS_Environment e, int cSize, TreeSet<WaAS_W3ID> w3IDs) {
        super(e, cSize);
        c_To_w3 = new TreeMap<>();
        w3_To_c = new HashMap<>();
        Iterator<WaAS_W3ID> ite = w3IDs.iterator();
        short s = 0;
        WaAS_CollectionID cID = getCollectionID(s);
        int i = 0;
        while (ite.hasNext()) {
            WaAS_W3ID w3ID = ite.next();
            w3_To_c.put(w3ID, cID);
            i++;
            if (i == cSize) {
                i = 0;
                s++;
                cID = getCollectionID(s);
            }
        }
        initCFs(env.W3);
    }
}
