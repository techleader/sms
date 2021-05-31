package org.school.config;

import org.school.model.Student;
import org.school.repository.CustomerRepository;
import org.school.service.DataService;
import org.school.service.DatabaseDataServiceImpl;
import org.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@EnableJpaRepositories( basePackages = "org.school.repository" )
@EntityScan(basePackages = "org.school.model")
@ComponentScan({"org.school.repository"})
@Import({H2DBConfig.class,FileConfig.class,MySqlConfig.class})
@Configuration
public class SmsConfig {

    @Autowired
    CustomerRepository repository;

    @Autowired
    DataSource dataSource;

    @Bean
    public DataService dataService() {
        DataService service = new DatabaseDataServiceImpl(repository);
        return service;
    }

    @Bean
    public StudentService studentService(){
        return new StudentService();
    }
}
