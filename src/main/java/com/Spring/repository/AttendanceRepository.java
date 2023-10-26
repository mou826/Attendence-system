package com.Spring.repository;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.entity.AttendanceDetails;

@Repository
public interface AttendanceRepository extends CrudRepository<AttendanceDetails, Long> {

	AttendanceDetails[] findByEmployeeId(String employeeid);
	
	 
	AttendanceDetails[] findByDepartmentId(String departmentid);
	
	AttendanceDetails findBydate(String month);
	
	AttendanceDetails findByEmployeeIdAndDepartmentId(String employeeid,String departmentid);
	
	
	Long countByEmployeeIdAndDepartmentId(String employeeid,String departmentid);
	
	Long countByEmployeeIdAndDepartmentIdAndAvailable(String employeeid,String departmentid,Boolean available);
	
	Long countByEmployeeIdAndDepartmentIdAndMonth(String employeeid,String departmentid,String month);
	
	@Query(value = "SELECT count(*) as total FROM attendancedetail where department_id = ?1 and month = ?2 group by employee_id")
	Long countByDepartmentIdAndMonth(String departmentid,String month);

	Long countByDepartmentIdAndMonthAndAvailable(String departmentid,String month,Boolean available);

	@Transactional
	void deleteByEmployeeIdAndDepartmentId(String employeeid,String departmentid);
	
	@Transactional
	void deleteByDepartmentId(String departmentid);
	
	@Transactional
	void deleteByEmployeeId(String employeeid);

	AttendanceDetails findByEmployeeIdAndDate(String employeeid, String date);

	@Query(value = "SELECT employeeId,count(available) as total FROM attendancedetail where available=1 and department_id = ?1 and month = ?2 and shift = ?3 group by employee_id order by count(available) desc")
	Object[] findByAttencountOrderByAttencountAsc(String departmentid,String month,String shift);


}
