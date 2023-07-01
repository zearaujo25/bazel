package com.mynetflix.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mynetflix.model.Video;
import com.mynetflix.model.ImmutableVideo;


@RestController
public class GreetingController {

	@GetMapping("/greeting")
	public Video greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        ImmutableVideo myVideo = ImmutableVideo.builder().id("Test").name("Test").build();
        return myVideo;
	}
	@PostMapping("/greeting")
	public String  greeting(@RequestBody Video myTestVideo) {
        System.out.println(myTestVideo);
        return "ok";
	}

}