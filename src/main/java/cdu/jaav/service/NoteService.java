package cdu.jaav.service;

import cdu.jaav.entity.Note;

import java.util.List;

/**
 * (Note)表服务接口
 *
 * @author makejava
 * @since 2021-03-30 16:20:22
 */
public interface NoteService {

    /**
     * 通过ID查询单条数据
     *
     * @param nId 主键
     * @return 实例对象
     */
    Note queryById(int nId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Note> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param note 实例对象
     * @return 实例对象
     */
    Note insert(Note note);

    /**
     * 修改数据
     *
     * @param note 实例对象
     * @return 实例对象
     */
    Note update(Note note);

    /**
     * 通过主键删除数据
     *
     * @param nId 主键
     * @return 是否成功
     */
    boolean deleteById(int nId);

}