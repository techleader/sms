package org.school.service;

import org.school.model.Student;
import org.school.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

//import java.util.List;

@Profile({"mysql","h2db"})
public class DatabaseDataServiceImpl implements DataService {


    public CustomerRepository customerRepository;

    @Autowired
    public DatabaseDataServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void save(Student student) {
        customerRepository.save(student);
    }

//    public List<Student> getStudent(String name) {
//        return customerRepository.findByName(name);
//    }
    public long getCountOfAllStudent(){
        return customerRepository.count();
    }
    public void dataDeleteAll(){  customerRepository.deleteAll(); }
}
