/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.codecs;

import org.bson.BSONReader;
import org.bson.BSONWriter;
import org.mongodb.Codec;

public class NullCodec implements Codec<Object> {
    @Override
    public void encode(final BSONWriter bsonWriter, final Object value) {
        bsonWriter.writeNull();
    }

    @Override
    public Object decode(final BSONReader reader) {
        reader.readNull();
        return null;
    }

    @Override
    public Class<Object> getEncoderClass() {
        return null;
    }
}