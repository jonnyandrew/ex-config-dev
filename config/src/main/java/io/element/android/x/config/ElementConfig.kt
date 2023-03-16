package io.element.android.x.config

import io.element.modulesdk.ElementConfigProvider
import io.element.modulesdk.connection.ConnectionModule

class ElementConfig : ElementConfigProvider {
    override val configName: String = "Dev config"

    override fun connectionModule(): ConnectionModule = DevConnectionModule()
}