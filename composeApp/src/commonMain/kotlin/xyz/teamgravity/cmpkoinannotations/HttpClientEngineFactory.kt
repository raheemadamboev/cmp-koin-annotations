package xyz.teamgravity.cmpkoinannotations

import io.ktor.client.engine.HttpClientEngine

expect class HttpClientEngineFactory() {
    fun create(): HttpClientEngine
}