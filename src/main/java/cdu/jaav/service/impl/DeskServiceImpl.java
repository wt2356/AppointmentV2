package cdu.jaav.service.impl;

import cdu.jaav.dao.DeskDao;
import cdu.jaav.entity.Desk;
import cdu.jaav.service.DeskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Desk)表服务实现类
 *
 * @author makejava
 * @since 2021-03-30 16:19:11
 */
@Service("deskService")
public class DeskServiceImpl implements DeskService {
    @Resource
    private DeskDao deskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param dId 主键
     * @return 实例对象
     */
    @Override
    public Desk queryById(int dId) {
        return this.deskDao.queryById(dId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Desk> queryAllByLimit(int offset, int limit) {
        return this.deskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    @Override
    public Desk insert(Desk desk) {
        this.deskDao.insert(desk);
        return desk;
    }

    /**
     * 修改数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    @Override
    public Desk update(Desk desk) {
        this.deskDao.update(desk);
        return this.queryById(desk.getDId());
    }

    /**
     * 通过主键删除数据
     *
     * @param dId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int dId) {
        return this.deskDao.deleteById(dId) > 0;
    }
}