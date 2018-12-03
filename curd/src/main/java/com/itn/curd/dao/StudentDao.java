
package com.itn.curd.dao;

import com.itn.curd.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
    
}
