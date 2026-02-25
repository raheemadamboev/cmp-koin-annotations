package xyz.teamgravity.cmpkoinannotations.injection.app

import org.koin.dsl.KoinAppDeclaration
import org.koin.plugin.module.dsl.startKoin

fun initializeKoin(config: KoinAppDeclaration? = null) {
    startKoin<ThisApp>(config)
}