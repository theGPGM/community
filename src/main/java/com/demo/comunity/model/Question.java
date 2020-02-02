package com.demo.comunity.model;

import lombok.Data;

@Data
public class Question
{

    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creatorId;
    private String tag;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
}