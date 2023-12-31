package com.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.entity.LeaveDetail;


@Repository
public interface LeaveRepository extends CrudRepository<LeaveDetail, Long> {

   
    LeaveDetail[] findByEmployeeId(String employeeId);

    LeaveDetail findByEmployeeIdAndFromdate(String employeeId,String fromdate);
    
    LeaveDetail[] findByDeptId(String deptId);
    
    
    @Transactional
    void deleteByEmployeeId(String employeeId);

}
