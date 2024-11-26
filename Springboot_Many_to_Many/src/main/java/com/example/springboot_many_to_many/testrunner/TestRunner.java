package com.example.springboot_many_to_many.testrunner;

import com.example.springboot_many_to_many.entity.Book;
import com.example.springboot_many_to_many.entity.Student;
import com.example.springboot_many_to_many.repo.BookRepo;
import com.example.springboot_many_to_many.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class TestRunner implements CommandLineRunner {


    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private BookRepo bookRepo;

    @Override
    public void run(String... args) throws Exception {


        Book b1=new Book("Datastructure");
        Book b2=new Book("C-Programming");
        Book b3=new Book("Springboot");

        //Save Book
        bookRepo.save(b1);
        bookRepo.save(b2);
        bookRepo.save(b3);

        List<Book> bookList1=new ArrayList<>();
        bookList1.add(b1);
        bookList1.add(b2);


        List<Book> bookList2=new ArrayList<>();
        bookList2.add(b3);
        bookList2.add(b2);



        // Create Student object

        Student st1=new Student();
        st1.setSName("Prajwal");
        st1.setSCity("Baramati");
        st1.setBookList(bookList1);

        Student st2=new Student();
        st2.setSName("Prasad");
        st2.setSCity("Pune");
        st2.setBookList(bookList2);

        Student st3=new Student();
        st3.setSName("Sameer");
        st3.setSCity("Hinjewadi");
        st3.setBookList(bookList2);



        studentRepo.save(st1);
        studentRepo.save(st2);
        studentRepo.save(st3);



        System.out.println("Hello World");
    }
}
