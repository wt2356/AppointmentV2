package cdu.jaav.service.impl;

import cdu.jaav.dao.ManagerDao;
import cdu.jaav.entity.Manager;
import cdu.jaav.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Manager)表服务实现类
 *
 * @author makejava
 * @since 2021-03-30 16:19:49
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerDao managerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public Manager queryById(int mId) {
        return this.managerDao.queryById(mId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Manager> queryAllByLimit(int offset, int limit) {
        return this.managerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    @Override
    public Manager insert(Manager manager) {
        this.managerDao.insert(manager);
        return manager;
    }

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    @Override
    public Manager update(Manager manager) {
        this.managerDao.update(manager);
        return this.queryById(manager.getMId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int mId) {
        return this.managerDao.deleteById(mId) > 0;
    }
}