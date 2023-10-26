package com.dbCRUD.services;

import com.dbCRUD.dao.PersonDao;
import com.dbCRUD.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {


    @Autowired
    private PersonDao personDao;

    public List<Person> getAllPerson(){
        List<Person> all = personDao.findAll();
        return all;

    }
    public Optional<Person> findPersonById(int id){
        Optional<Person> person = null;
        try {
            person = personDao.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return person;

    }

    public Person addPerson(Person person){
        Person save = personDao.save(person);
        return save;
    }

    public Person updatePerson(Person person , int id){

        person.setId(id); // ab agr user jo id dy ga woh is person ko assign ho jay gi // or wohi id wala person update ho ga
        Person update = personDao.save(person);
        return update;
    }


    public void deletePerson(int id){
        personDao.deleteById(id);
    }


}
