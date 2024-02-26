package com.cmpt276asn2.dataappasn2cmpt276.models;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);
    List<Student> findAllByOrderByUid();
    Student findByUid(int uid);
}