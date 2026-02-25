package xyz.teamgravity.cmpkoinannotations.injection.provide

import org.koin.core.annotation.Configuration
import org.koin.core.annotation.KoinViewModel
import org.koin.core.annotation.Module
import xyz.teamgravity.cmpkoinannotations.MainRepository
import xyz.teamgravity.cmpkoinannotations.TodoViewModel

@Module
@Configuration
class ViewModelModule {

    @KoinViewModel
    fun provideTodoViewModel(mainRepository: MainRepository): TodoViewModel = TodoViewModel(mainRepository)
}