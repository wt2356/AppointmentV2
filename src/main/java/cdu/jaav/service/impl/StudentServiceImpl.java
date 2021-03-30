package cdu.jaav.service.impl;

import cdu.jaav.dao.StudentDao;
import cdu.jaav.entity.Student;
import cdu.jaav.entity.utils.PageTransformate;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.entity.utils.ResultEnums;
import cdu.jaav.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2021-03-30 16:22:52
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(int sId) {
        return this.studentDao.queryById(sId);
    }

    /**
     * 查询多条数据
     * @param page  页码
     * @param limit  查询条数
     * @return
     */
    @Override
    public ResponseData<List> queryAllByLimit(int page, int limit) {
        List<Integer> pageTransfor = PageTransformate.pageTransfor(page, limit);
        List<Student> students = studentDao.queryAllByLimit(pageTransfor.get(0), pageTransfor.get(1));
        Map<String, String> map = new HashMap<>();
        map.put("key","all");
        int i=studentDao.queryAllCount(map);
        return new ResponseData<>(ResultEnums.SUCCESS,students);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getSId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int sId) {
        return this.studentDao.deleteById(sId) > 0;
    }
}