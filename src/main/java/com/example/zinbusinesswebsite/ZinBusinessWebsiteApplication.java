package com.example.zinbusinesswebsite;

import com.example.zinbusinesswebsite.dao.CompanyDao;
import com.example.zinbusinesswebsite.dao.CoursesDao;
import com.example.zinbusinesswebsite.dao.ServiceDao;
import com.example.zinbusinesswebsite.entity.Company;
import com.example.zinbusinesswebsite.entity.Courses;
import com.example.zinbusinesswebsite.entity.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@RequiredArgsConstructor
public class ZinBusinessWebsiteApplication {
    private final CompanyDao companyDao;
    private final CoursesDao coursesDao;
    private final ServiceDao serviceDao;
    @Bean @Transactional
    public ApplicationRunner runner(){
        return r -> {
            Courses courses1=new Courses(
                    "Computer Basic","Word,Excel,Microsoft Word & Pagemaker",15,"static/ZIn/courselogo.jpg"
            );
            Courses courses2=new Courses(
                    "Advance Excel","Advance Excel formulas & formats",15,"static/ZIn/courselogo.jpg"
            );
            Courses courses3=new Courses("Business Management","BM-intro,WH,Financial and others",20,"static/ZIn/bg.jpg");


            Service service1=new Service("Auditing Service","Auditing");
            Service service2=new Service("Company System Formatting","Format and arrange of new companies");

            Company company=new Company(
                    "Zin Business Training Center",
                    "No.18 Thukha Street Yangon, Myanmar, 11012",
                    "+95 9 799 694549",
                    "zinbusinesstd@gmail.com");

            Service ser1 = serviceDao.save(service1);
            Service ser2 = serviceDao.save(service2);
            company.addService(ser1);
            company.addService(ser2);

            Courses cour1 = coursesDao.save(courses1);
            Courses cour2 = coursesDao.save(courses2);
            Courses cour3 = coursesDao.save(courses3);
            company.addCourse(cour1);
            company.addCourse(cour2);
            company.addCourse(cour3);

            companyDao.save(company);







        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ZinBusinessWebsiteApplication.class, args);
    }

}
