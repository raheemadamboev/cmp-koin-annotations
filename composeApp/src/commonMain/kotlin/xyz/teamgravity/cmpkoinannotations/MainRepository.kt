package xyz.teamgravity.cmpkoinannotations

interface MainRepository {
    suspend fun getTodos(): List<String>
}