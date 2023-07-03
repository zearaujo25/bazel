package com.mynetflix.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mynetflix.model.Video;
import com.mynetflix.service.VideoService;
import com.mynetflix.model.ImmutableVideo;

@RestController
public class VideoController {
	private VideoService videoService;

	public VideoController(VideoService videoSerivService) {
		this.videoService = videoSerivService;
	}

	@GetMapping("/video")
	public Video getVideo(@RequestParam(name = "id", required = true) Integer id) {
		return this.videoService.getVideo(id);
	}

	@PostMapping("/video")
	public String postVideo(@RequestBody Video myTestVideo) {
		this.videoService.saveVideo(myTestVideo);
		return "ok";
	}

}