package com.nicebreeze.service;

import com.nicebreeze.model.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class LiveTvService {
    private static final String BASE_URL = "https://tapp-live-tv.s3.us-east-2.amazonaws.com";

    @Autowired
    RestTemplate restTemplate;

    public List<Channel> retrievePlaylist() {
        ResponseEntity<Channel[]> channels = restTemplate.getForEntity(BASE_URL, Channel[].class);

        return Arrays.asList(channels.getBody());
    }
}
