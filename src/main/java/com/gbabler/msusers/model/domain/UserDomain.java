package com.gbabler.msusers.model.domain;

import com.gbabler.msusers.enumeration.Gender;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class UserDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "cpf")
    private String document;

    @Column(name = "phone")
    private String phone;

    @Column(name = "gender")
    private Gender gender;

}