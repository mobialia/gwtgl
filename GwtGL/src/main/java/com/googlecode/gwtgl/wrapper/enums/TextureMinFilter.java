/**   
 * Copyright 2009-2010 Sönke Sothmann & Steffen Schäfer
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
package com.googlecode.gwtgl.wrapper.enums;

import com.googlecode.gwtgl.binding.WebGLRenderingContext;
import com.googlecode.gwtgl.wrapper.util.EnumUtil;

/**
 * @author Steffen Schäfer
 * 
 */
public enum TextureMinFilter implements IWebGLConstEnum {
	/**
	 * Value to identify TextureMinFilter NEAREST.
	 */
	NEAREST(WebGLRenderingContext.NEAREST),
	/**
	 * Value to identify TextureMinFilter LINEAR.
	 */
	LINEAR(WebGLRenderingContext.LINEAR),
	/**
	 * Value to identify TextureMinFilter NEAREST_MIPMAP_NEAREST.
	 */
	NEAREST_MIPMAP_NEAREST(WebGLRenderingContext.NEAREST_MIPMAP_NEAREST),
	/**
	 * Value to identify TextureMinFilter LINEAR_MIPMAP_NEAREST.
	 */
	LINEAR_MIPMAP_NEAREST(WebGLRenderingContext.LINEAR_MIPMAP_NEAREST),
	/**
	 * Value to identify TextureMinFilter NEAREST_MIPMAP_LINEAR.
	 */
	NEAREST_MIPMAP_LINEAR(WebGLRenderingContext.NEAREST_MIPMAP_LINEAR),
	/**
	 * Value to identify TextureMinFilter LINEAR_MIPMAP_LINEAR.
	 */
	LINEAR_MIPMAP_LINEAR(WebGLRenderingContext.LINEAR_MIPMAP_LINEAR);

	private final int value;

	TextureMinFilter(int value) {
		this.value = value;
	}

	public int getIntValue() {
		return value;
	}

	/**
	 * Returns the matching enum value for the given int value.
	 * 
	 * @param value
	 * @return the matching enum value for the given int value
	 */
	public static TextureMinFilter getByIntValue(int value) {
		return EnumUtil.getByIntValue(values(), value);
	}

}