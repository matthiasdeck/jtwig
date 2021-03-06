/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lyncode.jtwig.util;

import org.junit.Test;

import static com.lyncode.jtwig.util.RelationalOperations.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RelationalOperationsTest {
    @Test
    public void gtTest() throws Exception {
        assertTrue(gt(2, 1));
    }

    @Test
    public void gtDoubleTest() throws Exception {
        assertTrue(gt(2.0, 1.0));
    }

    @Test
    public void gtFalseTest() throws Exception {
        assertFalse(gt(1, 2));
    }

    @Test
    public void gteTest() throws Exception {
        assertTrue(gte(2, 2));
    }

    @Test
    public void gteDoubleTest() throws Exception {
        assertTrue(gte(2.0, 2.0));
    }

    @Test
    public void gteFalseTest() throws Exception {
        assertFalse(gte(1, 2));
    }

    @Test
    public void ltTest() throws Exception {
        assertTrue(lt(1, 2));
    }

    @Test
    public void ltDoubleTest() throws Exception {
        assertTrue(lt(1.0, 2.0));
    }

    @Test
    public void ltFalseTest() throws Exception {
        assertFalse(lt(2, 1));
    }

    @Test
    public void lteTest() throws Exception {
        assertTrue(lte(1, 1));
    }

    @Test
    public void lteDoubleTest() throws Exception {
        assertTrue(lte(1.0, 1.0));
    }

    @Test
    public void lteFalseTest() throws Exception {
        assertFalse(lte(2, 1));
    }

    @Test
    public void eqTest() throws Exception {
        assertTrue(eq(1, 1));
    }

    @Test
    public void eqNullTest() throws Exception {
        assertTrue(eq(null, null));
    }

    @Test
    public void eqFalseTest() throws Exception {
        assertFalse(eq(2, 1));
    }
}
