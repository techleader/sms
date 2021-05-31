package org.school.repository;

import org.school.model.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends CrudRepository<Student, Long> {

    List<Student>findByFirstName(String firstName);

   // List<Student> findByAddress(String address);

    Student findById(long id);

   long count();

    @Override
    void deleteAll();
}
