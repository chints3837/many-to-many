package com.example.springboot_many_to_many.repo;

import com.example.springboot_many_to_many.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
