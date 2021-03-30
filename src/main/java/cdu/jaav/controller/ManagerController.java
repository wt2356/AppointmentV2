package cdu.jaav.controller;

import cdu.jaav.entity.Manager;
import cdu.jaav.service.ManagerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Manager)表控制层
 *
 * @author makejava
 * @since 2021-03-30 16:19:49
 */
@RestController
@RequestMapping("manager")
public class ManagerController {
    /**
     * 服务对象
     */
    @Resource
    private ManagerService managerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Manager selectOne(int id) {
        return this.managerService.queryById(id);
    }

}