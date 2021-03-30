package cdu.jaav.dao;

import cdu.jaav.entity.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Manager)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-30 16:19:48
 */
public interface ManagerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    Manager queryById(int mId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Manager> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param manager 实例对象
     * @return 对象列表
     */
    List<Manager> queryAll(Manager manager);

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 影响行数
     */
    int insert(Manager manager);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Manager> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Manager> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Manager> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Manager> entities);

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 影响行数
     */
    int update(Manager manager);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 影响行数
     */
    int deleteById(int mId);

}