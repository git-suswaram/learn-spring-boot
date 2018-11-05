package com.shvg.learn.springboot.common.staticdata.loaders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoadCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        //TODO: Implement code to load test data in database

    }

}
/*
import com.shvg.frameworks.springboot.restapiwithjpa.entity.JContactInfo;
import com.shvg.frameworks.springboot.restapiwithjpa.entity.JDepartment;
import com.shvg.frameworks.springboot.restapiwithjpa.entity.JEmployee;
import com.shvg.frameworks.springboot.restapiwithjpa.repository.JContactInfoRepository;
import com.shvg.frameworks.springboot.restapiwithjpa.repository.JDepartmentRepository;
import com.shvg.frameworks.springboot.restapiwithjpa.repository.JEmployeeRepository;
import com.shvg.frameworks.springboot.restapiwithjpa.util.helper.HelperImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static com.shvg.frameworks.springboot.basedata.data.ContactInfoData.getImmutableListOfContactInfos;
import static com.shvg.frameworks.springboot.basedata.data.DepartmentData.getImmutableListOfJDepartments;
import static com.shvg.frameworks.springboot.basedata.data.EmployeeData.getImmutableListOfJExecutives;

@Component
public class DataLoadCommandLineRunner implements CommandLineRunner {

    @Autowired
    JEmployeeRepository jEmployeeRepository;

    @Autowired
    JDepartmentRepository jDepartmentRepository;

    @Autowired
    JContactInfoRepository jContactInfoRepository;

    private static Logger logger = LoggerFactory.getLogger(HelperImpl.class);

    @Override
    public void run(String... args) throws Exception {


        for (JEmployee jEmployeeEntity : getImmutableListOfJExecutives()) {
            JEmployee insertedEmployee = jEmployeeRepository.save(jEmployeeEntity);
            logger.info("\nInserted Employee Using JPA Repository: {}", insertedEmployee);
        }
        for (JDepartment jDepartmentEntity : getImmutableListOfJDepartments()) {
            JDepartment insertedDepartment = jDepartmentRepository.save(jDepartmentEntity);
            logger.info("\nInserted Department Using JPA Repository: {}", insertedDepartment);
        }

        for (JContactInfo jContactInfoEntity : getImmutableListOfContactInfos()) {
            JContactInfo insertedDepartment = jContactInfoRepository.save(jContactInfoEntity);
            logger.info("\nInserted Department Using JPA Repository: {}", insertedDepartment);
        }

    }
}
*/
