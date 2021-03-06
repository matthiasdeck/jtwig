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

package com.lyncode.jtwig.unit.content.model;

import com.lyncode.jtwig.content.model.compilable.Comment;
import com.lyncode.jtwig.render.RenderContext;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;

public class CommentTest {
    @Test
    public void commentShouldWriteNothing() throws Exception {
        Comment comment = new Comment();

        RenderContext renderContext = mock(RenderContext.class);
        comment.compile(null).render(renderContext);

        verifyZeroInteractions(renderContext);
    }
}
