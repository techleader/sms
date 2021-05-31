package org.school.service;

import org.school.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    public DataService dataService;

    public long getCountOfAllStudent(){
        return  dataService.getCountOfAllStudent();
    }

    public void addNewStudent(Student student) {
        dataService.save(student);
    }

   // public void dataSave(Student student) { dataService.save(student);}

    public void dataDelete() { dataService.dataDeleteAll();
    }
}
