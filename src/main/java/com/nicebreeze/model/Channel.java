package com.nicebreeze.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Channel implements Serializable {

    private String id;

    private String title;

    private String streamUrl;

    private String imageUrl;

    private String category;

    private String channelNumber;
}