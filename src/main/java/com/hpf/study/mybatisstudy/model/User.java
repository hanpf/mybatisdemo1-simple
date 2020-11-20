package com.hpf.study.mybatisstudy.model;

import lombok.Data;

import java.math.BigDecimal;
import java.security.Principal;

@Data
public class User {
    private BigDecimal id;
    private String name;
    private  int age;
    private int sex;
}
