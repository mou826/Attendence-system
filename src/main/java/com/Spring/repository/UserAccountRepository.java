package com.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.entity.UserAccount;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

   
    
    UserAccount findByEmployeeId(String employeeId);

 
    @Transactional
    void deleteByEmployeeId(String employeeId);

}
