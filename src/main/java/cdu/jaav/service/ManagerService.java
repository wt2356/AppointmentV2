package cdu.jaav.service;

import cdu.jaav.entity.Manager;

import java.util.List;

/**
 * (Manager)表服务接口
 *
 * @author makejava
 * @since 2021-03-30 16:19:48
 */
public interface ManagerService {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    Manager queryById(int mId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Manager> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Manager insert(Manager manager);

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Manager update(Manager manager);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(int mId);

}