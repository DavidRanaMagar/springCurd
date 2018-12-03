
package com.itn.curd.Services;

import com.itn.curd.entity.Student;
import java.util.List;

public interface StudentService {
    public void save(Student st);
    public void update(Student st);
    public void delete(Student st);
    public List<Student> getAll();
    
}
