package org.school.service;

import org.school.model.Student;
import org.school.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Profile("file")
public class FileDataService implements DataService {
   String path ="D:/IdeaProjects/basicPrograms/createFileByFun.txt";
    @Autowired
    private CustomerRepository customerRepository;



    @Override
    public void save(Student student) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(String.valueOf(student));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException  e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    @Override
    public long getCountOfAllStudent() {
        return 0;
    }

    @Override
    public void dataDeleteAll() {

    }
}
