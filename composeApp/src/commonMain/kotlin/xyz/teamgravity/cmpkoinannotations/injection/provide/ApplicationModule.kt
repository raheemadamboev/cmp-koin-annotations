package xyz.teamgravity.cmpkoinannotations.injection.provide

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import xyz.teamgravity.cmpkoinannotations.AuthenticatedHttpClient
import xyz.teamgravity.cmpkoinannotations.HttpClientEngineFactory
import xyz.teamgravity.cmpkoinannotations.MainRepositoryImp
import xyz.teamgravity.cmpkoinannotations.UnauthenticatedHttpClient

@Module
@Configuration
class ApplicationModule {

    @Single
    fun provideHttpClientEngineFactory(): HttpClientEngineFactory = HttpClientEngineFactory()

    @Single
    fun provideHttpClientEngine(httpClientEngineFactory: HttpClientEngineFactory): HttpClientEngine = httpClientEngineFactory.create()

    @Single
    @AuthenticatedHttpClient
    fun provideAuthenticatedHttpClient(httpClientEngine: HttpClientEngine): HttpClient = HttpClient(httpClientEngine)

    @Single
    @UnauthenticatedHttpClient
    fun provideUnauthenticatedHttpClient(httpClientEngine: HttpClientEngine): HttpClient = HttpClient(httpClientEngine)

    @Single
    fun provideMainRepositoryImp(@AuthenticatedHttpClient authenticatedHttpClient: HttpClient): MainRepositoryImp =
        MainRepositoryImp(authenticatedHttpClient)
}