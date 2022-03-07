package com.open.light.domain.library;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Library {
    @Id
    @GeneratedValue
    private long id;

    private String name; //책이름

    private String text; // 책 내용

    private String bookImage; // 책표지


}
