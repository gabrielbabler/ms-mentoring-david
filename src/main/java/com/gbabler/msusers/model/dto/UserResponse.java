package com.gbabler.msusers.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gbabler.msusers.model.domain.UserDomain;

public class UserResponse {

    private Integer id;

    @JsonProperty(value = "nome")
    private String name;

    @JsonProperty(value = "apelido")
    private String nickName;

    public UserResponse(Integer id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    public static UserResponse valueOf(UserDomain userDomain) {
        return new UserResponse(userDomain.getId(), userDomain.getName(), userDomain.getNickName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}