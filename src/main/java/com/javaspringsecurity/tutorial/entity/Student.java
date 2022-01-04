package com.javaspringsecurity.tutorial.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class Student {
    private Integer id;
    private String name;
}
