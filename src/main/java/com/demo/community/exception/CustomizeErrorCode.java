package com.demo.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不存在，要不换一个试试？"),
    TARGET_PRAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需要登录"),
    SYS_ERROR(2004,"服务器冒烟了，要不然你稍后再试试！！！"),
    TYPE_PRAM_NO_FOUND(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"当前评论不存在，要不要换一个试试？"),
    CONTENT_IS_EMPTY(2007,"内容为空"),
    TITLE_IS_EMPTY(2008, "标题为空"),
    TAG_IS_EMPTY(2009, "标签为空"),
    READ_THE_NOTIFICATION_FAILED(2010, "你读的好像是别人的信息噢"),
    NOTIFICATION_NOT_FOUND(2011, "莫非消息不翼而飞了？"),
    LIKE_FAILED(2012, "点赞失败了，要不要再试一下?"),
    FILE_UPLOAD_FAILED(2013, "图片上传失败了"),
    SEARCH_CONTENT_IS_EMPTY(2014, "搜索内容为空"),
    USERNAME_IS_EMPTY(2015, "未输入用户名"),
    PASSWORD_IS_EMPTY(2016, "未输入密码"),
    REGISTER_FAILED(2017, "注册失败，要不再试一下？"),
    USERNAME_IS_EXIST(2018, "用户名已存在，请输入别的用户名吧"),
    LOGIN_FAILED(2019, "登录失败，要不再试一下？"),
    USER_IS_NOT_EXIST(2020, "用户不存在"),
    PASSWORD_IS_WRONG(2021, "密码不正确"),
    LOGIN_USER_CANNOT_USE(2022, "已登录用户不能使用"),
    ;

    private Integer code;
    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}