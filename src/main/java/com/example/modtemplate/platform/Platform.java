/*
 * SPDX-License-Identifier: MIT
 * Copyright (c) 2025 rotgrunegelb
 * Copyright (c) 2025 murder_spagurder (from murderspagurder/mod-template-java)
 * See the LICENSE file in the project root for license terms.
 */

package com.example.modtemplate.platform;

public interface Platform {
	boolean isModLoaded(String modId);

	ModLoader loader();

	String mcVersion();

	boolean isDevelopmentEnvironment();

	default boolean isDebug() {
		return isDevelopmentEnvironment();
	}

	enum ModLoader {
		FABRIC, NEOFORGE, FORGE, QUILT
	}
}
