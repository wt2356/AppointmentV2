package cdu.jaav.dao;

import cdu.jaav.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-30 16:22:52
 */
public interface StudentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Student queryById(int sId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param student 实例对象
     * @return 对象列表
     */
    List<Student> queryAll(Student student);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Student> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Student> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Student> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Student> entities);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 影响行数
     */
    int deleteById(int sId);

    int queryAllCount(@Param("map") Map<String, String> map);
}