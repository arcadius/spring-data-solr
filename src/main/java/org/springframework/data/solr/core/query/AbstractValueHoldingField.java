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
package org.springframework.data.solr.core.query;

import org.springframework.lang.Nullable;

/**
 * Base implementation of {@link ValueHoldingField} <br />
 *
 * @author Christoph Strobl
 */
class AbstractValueHoldingField extends SimpleField implements ValueHoldingField {

	private @Nullable Object value;

	protected AbstractValueHoldingField(String fieldName) {
		super(fieldName);
	}

	protected AbstractValueHoldingField(String fieldName, Object fieldValue) {
		this(fieldName);
		this.value = fieldValue;
	}

	@Nullable
	@Override
	public Object getValue() {
		return this.value;
	}

	public void setValue(@Nullable Object value) {
		this.value = value;
	}

}
