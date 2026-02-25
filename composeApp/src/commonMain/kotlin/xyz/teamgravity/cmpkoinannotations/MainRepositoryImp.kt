package xyz.teamgravity.cmpkoinannotations

import io.ktor.client.HttpClient

class MainRepositoryImp(
    private val client: HttpClient
) : MainRepository {

    override suspend fun getTodos(): List<String> {
        return List(30) { "Todo $it" }
    }
}