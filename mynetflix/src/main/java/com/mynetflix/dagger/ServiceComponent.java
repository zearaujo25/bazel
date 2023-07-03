package com.mynetflix.dagger;
import com.mynetflix.service.VideoService;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = PersistenceModule.class)
public interface ServiceComponent {
    VideoService builVideoService();
}
