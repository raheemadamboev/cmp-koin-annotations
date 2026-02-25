package xyz.teamgravity.cmpkoinannotations

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform