/*
 * Copyright 2018 geoagdt.
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
package uk.ac.leeds.ccg.andyt.generic.data.waas.data.records;

import uk.ac.leeds.ccg.andyt.generic.data.waas.core.WaAS_Environment;
import uk.ac.leeds.ccg.andyt.generic.data.waas.core.WaAS_Object;

/**
 *
 * @author geoagdt
 */
public class WaAS_CombinedRecordSimple extends WaAS_Object {

    public WaAS_W1Record w1Rec;

    public WaAS_W2Record w2Rec;

    public WaAS_W3Record w3Rec;

    public WaAS_W4Record w4Rec;

    public WaAS_W5Record w5Rec;

    public WaAS_CombinedRecordSimple(WaAS_Environment e, WaAS_W1Record w1Rec) {
        super(e);
        this.w1Rec = w1Rec;
    }
}