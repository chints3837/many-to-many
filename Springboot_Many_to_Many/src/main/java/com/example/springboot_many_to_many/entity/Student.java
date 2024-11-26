package com.example.springboot_many_to_many.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer sId;

    @Column(name = "sName")
    @NonNull
    public String sName;

    @Column(name = "sCity")
    public String sCity;

    @ManyToMany
    @JoinTable(
            name = "student_book",
            joinColumns = @JoinColumn(name = "sIdFK"),
            inverseJoinColumns = @JoinColumn(name = "bIdFK"))
    public List<Book> bookList=new ArrayList<>();




}
