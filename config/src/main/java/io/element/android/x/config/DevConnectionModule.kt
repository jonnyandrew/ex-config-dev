package io.element.android.x.config

import io.element.modulesdk.connection.ConnectionModule

internal class DevConnectionModule: ConnectionModule {
    override fun customHomeServerUrl(): String = "localhost:8580"
}