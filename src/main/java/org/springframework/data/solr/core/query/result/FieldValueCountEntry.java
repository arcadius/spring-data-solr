/*
 * Copyright 2012 - 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.solr.core.query.result;

import org.springframework.data.solr.core.query.Field;
import org.springframework.data.solr.core.query.SimpleField;
import org.springframework.lang.Nullable;

/**
 * @author Christoph Strobl
 */
public class FieldValueCountEntry extends ValueCountEntry {

	private @Nullable Field field;

	public FieldValueCountEntry(String value, long valueCount) {
		super(value, valueCount);
	}

	@Nullable
	public Field getKey() {
		return getField();
	}

	@Nullable
	public Field getField() {
		return this.field;
	}

	public final void setField(Field field) {
		this.field = field;
	}

	public final void setField(String fieldname) {
		setField(new SimpleField(fieldname));
	}

}
