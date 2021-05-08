package cn.buaa.controller;

import cn.buaa.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author hct
 * @Slogan 我的代码永远 0 错误
 * @date 2021/4/29
 **/
@Controller
@RequestMapping("/restful")
public class RestfulController {

    /**
     * 查询操作
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public String get(@PathVariable Integer id){
        System.out.println("查询操作");
        System.out.println(id);
        return "/index.jsp";
    }

    /**
     * 增加操作
     * @param user
     * @return
     */
    @PostMapping("/user")
    public String add(User user){
        System.out.println("增加操作");
        System.out.println(user);
        return "/index.jsp";
    }

    /**
     * 修改操作
     * @param user
     * @return
     */
    @PutMapping("/user/{id}")
    public String put(User user){
        System.out.println("修改操作");
        System.out.println(user);
        return "/index.jsp";
    }

    /**
     * 删除操作
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("删除操作");
        System.out.println(id);
        return "/index.jsp";
    }
}
