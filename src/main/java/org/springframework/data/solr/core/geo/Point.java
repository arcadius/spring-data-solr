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
package org.springframework.data.solr.core.geo;

import org.springframework.lang.Nullable;

/**
 * @author Christoph Strobl
 * @since 1.1
 */
public class Point extends org.springframework.data.geo.Point {

	private @Nullable Double z;

	public Point(double x, double y) {
		super(x, y);
	}

	public Point(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	@Nullable
	public Double getZ() {
		return z;
	}

}
