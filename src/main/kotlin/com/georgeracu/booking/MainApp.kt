package com.georgeracu.booking

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import org.slf4j.LoggerFactory

class MainApp: Application<AppConfiguration>() {
    private val logger = LoggerFactory.getLogger("MainApp")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MainApp().run(*args)
        }
    }

    override fun run(configuration: AppConfiguration?, environment: Environment?) {

    }
}