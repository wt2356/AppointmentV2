package cdu.jaav.service;

import cdu.jaav.entity.Desk;

import java.util.List;

/**
 * (Desk)表服务接口
 *
 * @author makejava
 * @since 2021-03-30 16:19:11
 */
public interface DeskService {

    /**
     * 通过ID查询单条数据
     *
     * @param dId 主键
     * @return 实例对象
     */
    Desk queryById(int dId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Desk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    Desk insert(Desk desk);

    /**
     * 修改数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    Desk update(Desk desk);

    /**
     * 通过主键删除数据
     *
     * @param dId 主键
     * @return 是否成功
     */
    boolean deleteById(int dId);

}