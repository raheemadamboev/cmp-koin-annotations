package xyz.teamgravity.cmpkoinannotations.injection.bind

import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import xyz.teamgravity.cmpkoinannotations.MainRepository
import xyz.teamgravity.cmpkoinannotations.MainRepositoryImp

@Module
@Configuration
class ApplicationModule {

    @Single
    fun bindMainRepository(mainRepositoryImp: MainRepositoryImp): MainRepository = mainRepositoryImp
}