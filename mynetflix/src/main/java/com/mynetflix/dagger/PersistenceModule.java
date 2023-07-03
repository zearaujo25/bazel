package com.mynetflix.dagger;

import com.mynetflix.service.VideoPersistence;
import com.mynetflix.service.VideoService;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PersistenceModule {
    @Provides
    @Singleton
    public VideoPersistence provideVideoPersistence(){
        return new VideoPersistence();
    }
}
