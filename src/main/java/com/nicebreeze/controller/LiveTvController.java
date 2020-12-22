package com.nicebreeze.controller;

import com.nicebreeze.model.Channel;
import com.nicebreeze.service.LiveTvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LiveTvController {

    @Autowired
    private LiveTvService liveTvService;

    @GetMapping("/channels")
    public List<Channel> getChannels(){
        return liveTvService.retrievePlaylist();
    }
}
