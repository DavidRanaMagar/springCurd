
package com.itn.curd.controller;

import com.itn.curd.Services.StudentService;
import com.itn.curd.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlled {
    private StudentService stuImp;
    
    @Autowired
    public Controlled(StudentService stuImp) {
        this.stuImp = stuImp;
    }
    
    @RequestMapping(value={"/","/home"})
    public String home(){
        return "home";
    }
    @RequestMapping(value="/create")
    public String create(){
        return "create";
    }
    
    @RequestMapping(value="/add" ,method=RequestMethod.POST)
    public String add(@RequestParam("name") String name, @RequestParam("address") String address){
        Student stu = new Student(name,address);
        stuImp.save(stu);
        return "home";
    }
    @RequestMapping(value="/remove")
    public String remove(){
        return "remove";
    }
    @RequestMapping(value="/delete", method = RequestMethod.POST)
    public String delete(@RequestParam("id") String id,@RequestParam("name") String name, @RequestParam("address") String address){
        
        Student stu = new Student(Integer.valueOf(id),name,address);
        stuImp.delete(stu);
        return "home";
    }
    @RequestMapping(value="/show")
    public String show(ModelMap m){
        List<Student> stuList = stuImp.getAll();
        m.addAttribute("list", stuList);
        return "show";
    }
    @RequestMapping(value={"/update"})
    public String update(){
        return "update";
    }
    
    @RequestMapping(value={"/updated"}, method = RequestMethod.POST)
    public String updated(@RequestParam("id") String id,@RequestParam("name") String name, @RequestParam("address") String address){
        Student stu = new Student(Integer.valueOf(id),name,address);
        stuImp.save(stu);
        return "home";
    }
            
}
