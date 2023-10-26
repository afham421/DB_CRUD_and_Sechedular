package com.dbCRUD.dao;

import com.dbCRUD.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Integer> {

    // is ki implementation nhin likhni springboot khud provide ker dy ga

    // agr yahan spring hota tu phir hmin likhni perti

}
