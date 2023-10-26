package com.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.entity.EmployeeDetail;
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetail, Long> {
   
    EmployeeDetail findByEmployeeId(String employeeid);
    EmployeeDetail findByEmployeeIdAndShift(String employeeid,String shift);

    EmployeeDetail[] findByDepartment(String department);
    @Transactional
    void deleteByEmployeeId(String employeeId);

}
