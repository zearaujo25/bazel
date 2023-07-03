package com.mynetflix.service;

import com.mynetflix.model.Video;
import com.mynetflix.model.ImmutableVideo;
import javax.inject.Inject;

public class VideoService {
    private final VideoPersistence persistence;

    @Inject
    public VideoService(VideoPersistence persistence) {
        this.persistence = persistence;
    }

    public void saveVideo(Video myVideo) {
        this.persistence.save(myVideo);
        System.out.println("Video Saved!");
    }

    public Video getVideo(Integer id) {
        return ImmutableVideo.builder().id(id.toString()).name("This is atest video").build();
    }
}
