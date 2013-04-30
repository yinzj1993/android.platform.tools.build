/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.builder.testing.api;

import com.android.annotations.NonNull;
import com.android.ddmlib.IShellEnabledDevice;
import com.android.ddmlib.TimeoutException;

import java.io.File;

/**
 * A connector to a device to install/uninstall APKs, and run shell command.
 */
public interface DeviceConnector extends IShellEnabledDevice {

    void connect(int timeOut) throws TimeoutException;
    void disconnect(int timeOut) throws TimeoutException;

    void installPackage(@NonNull File apkFile) throws DeviceException;

    void uninstallPackage(@NonNull String packageName) throws DeviceException;
}
