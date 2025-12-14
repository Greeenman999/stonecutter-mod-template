/*
 * SPDX-License-Identifier: MIT
 * Copyright (c) 2025 rotgrunegelb
 * See the LICENSE file in the project root for license terms.
 */

rootProject.name = "build-logic"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}
