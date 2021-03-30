package cdu.jaav.controller;

import cdu.jaav.entity.Student;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.entity.utils.ResultEnums;
import cdu.jaav.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2021-03-30 16:22:53
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     * @param id
     * @return
     */
    @GetMapping("selectOne")
    public ResponseData<Student> selectOne(int id) {
        Student student = studentService.queryById(id);
        return new ResponseData<>(ResultEnums.SUCCESS,student);
    }
    @GetMapping("selectAll")
    public ResponseData<List> selectAll(int page,int limit){
       return studentService.queryAllByLimit(page,limit);
    }

}