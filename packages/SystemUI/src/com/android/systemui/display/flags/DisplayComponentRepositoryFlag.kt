/*
 * Copyright (C) 2025 The Android Open Source Project
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

package com.android.systemui.display.flags

/** Flags related to [com.android.systemui.display.data.repository.DisplayComponentRepository]. */
object DisplayComponentRepositoryFlag {
    /**
     * Eager display-component init calls [com.android.app.displaylib.PerDisplayRepository.get]
     * from a background coroutine during startup and races the main-thread graph build.
     * Connected-display wallpaper presentations are unused on this player, so keep it off
     * here instead of flipping the platform release flag.
     */
    fun isEagerInitializationEnabled(): Boolean = false
}
