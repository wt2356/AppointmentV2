package cdu.jaav.service.impl;

import cdu.jaav.dao.NoteDao;
import cdu.jaav.entity.Note;
import cdu.jaav.service.NoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Note)表服务实现类
 *
 * @author makejava
 * @since 2021-03-30 16:20:22
 */
@Service("noteService")
public class NoteServiceImpl implements NoteService {
    @Resource
    private NoteDao noteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param nId 主键
     * @return 实例对象
     */
    @Override
    public Note queryById(int nId) {
        return this.noteDao.queryById(nId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Note> queryAllByLimit(int offset, int limit) {
        return this.noteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param note 实例对象
     * @return 实例对象
     */
    @Override
    public Note insert(Note note) {
        this.noteDao.insert(note);
        return note;
    }

    /**
     * 修改数据
     *
     * @param note 实例对象
     * @return 实例对象
     */
    @Override
    public Note update(Note note) {
        this.noteDao.update(note);
        return this.queryById(note.getNId());
    }

    /**
     * 通过主键删除数据
     *
     * @param nId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int nId) {
        return this.noteDao.deleteById(nId) > 0;
    }
}