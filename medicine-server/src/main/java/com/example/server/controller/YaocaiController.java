package com.example.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.server.mapper.YaocaiMapper;
import com.example.server.pojo.RespBean;
import com.example.server.pojo.Yaocai;
import com.example.server.pojo.YaocaiLike;
import com.example.server.service.IYaocaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hanbing
 * @since 2023-04-22
 */
@RestController
@RequestMapping("/yaocai")
public class YaocaiController {
    @Autowired
    private YaocaiMapper yaocaiMapper;
    @Autowired
    private IYaocaiService yaocaiService;

    //总查询,分页
    @GetMapping("likeAndPage/{page}/{size}")
    public RespBean page(@PathVariable("page") Integer page,
                         @PathVariable("size") Integer size) {
        Page<Yaocai> YaocaiPage = new Page<>(page, size);
        return RespBean.success("查询成功", yaocaiMapper.selectPage(YaocaiPage, null));
    }

    //条件查询
    @PostMapping("/like")
    public RespBean like(@RequestBody YaocaiLike yaocaiLike) {
        QueryWrapper<Yaocai> booksQueryWrapper = new QueryWrapper<>();
        if (yaocaiLike.getName() != null && yaocaiLike.getName().length() > 0) {
            booksQueryWrapper.like("name", yaocaiLike.getName());
        }
        if (yaocaiLike.getArea() != null && yaocaiLike.getArea().length() > 0) {
            booksQueryWrapper.like("area", yaocaiLike.getArea());
        }

        if (yaocaiLike.getClassificaion() != null && yaocaiLike.getClassificaion().length() > 0) {
            booksQueryWrapper.like("classificaion", yaocaiLike.getClassificaion());
        }
        return RespBean.success("查询成功", yaocaiMapper.selectList(booksQueryWrapper));
    }

    //更新
    @PostMapping("update")
    public RespBean update(@RequestBody Yaocai yaocai) {
        if (yaocaiMapper.updateById(yaocai) > 0) {
            return RespBean.success("修改成功");
        } else {
            return RespBean.error("修改失败");
        }
    }

    //删除
    @DeleteMapping("delete")
    public RespBean deleteById(Integer id) {
        if (yaocaiMapper.deleteById(id) > 0) {
            return RespBean.success("删除成功");
        } else {
            return RespBean.error("删除失败");
        }
    }

    //增加
    @PostMapping("add")
    public RespBean add(@RequestBody Yaocai yaocai) {
        yaocai.setId(null);
        if (yaocaiMapper.insert(yaocai) > 0) {
            return RespBean.success("添加成功");
        } else {
            return RespBean.error("添加失败");
        }
    }


}
