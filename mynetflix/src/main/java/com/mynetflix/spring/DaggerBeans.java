package com.mynetflix.spring;
// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mynetflix.service.VideoService;
import com.mynetflix.dagger.ServiceComponent;
import com.mynetflix.dagger.DaggerServiceComponent;
@Configuration
public class DaggerBeans {
    @Bean
    public VideoService videoService(){
		return  DaggerServiceComponent.create().builVideoService();
    }
}
