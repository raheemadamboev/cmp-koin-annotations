package xyz.teamgravity.cmpkoinannotations

import io.ktor.client.engine.darwin.Darwin

actual class HttpClientEngineFactory actual constructor() {
    actual fun create(): io.ktor.client.engine.HttpClientEngine {
        return Darwin.create()
    }
}