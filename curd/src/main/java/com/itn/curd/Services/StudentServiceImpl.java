
package com.itn.curd.Services;

import com.itn.curd.dao.StudentDao;
import com.itn.curd.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    
    private StudentDao stuDao;
    
    @Autowired
    public StudentServiceImpl(StudentDao stuDao) {
        this.stuDao = stuDao;
    }
   
    @Override
    public void save(Student st) {
        stuDao.save(st);
    }

    @Override
    public void update(Student st) {
        stuDao.save(st);
    }

    @Override
    public void delete(Student st) {
        stuDao.delete(st);
    }

    @Override
    public List<Student> getAll() {
        return stuDao.findAll();
    }
    
}
