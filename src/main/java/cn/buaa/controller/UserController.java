package cn.buaa.controller;

import cn.buaa.beans.Role;
import cn.buaa.beans.User;
import cn.buaa.beans.UserDTO;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author hct
 * @Slogan 我的代码永远 0 错误
 * @date 2021/4/28
 **/
@Controller
@SessionAttributes({"name","psw"})
public class UserController {


    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        System.out.println();
        return "index";
    }


    @RequestMapping("/parameter01")
    public String parameter01(String username){
        System.out.println(username);
        return "/index";
    }

    @RequestMapping("/parameter02")
    public String parameter02(User user){
        System.out.println(user);
        return "/index";
    }


    @RequestMapping("/parameter03")
    public String parameter03(UserDTO dto){
        User user = dto.getUser();
        System.out.println(user);
        Role role = dto.getRole();
        System.out.println(role);
        return "/index";
    }

    @RequestMapping(value = "/parameter04/{id}/{name}")
    public String parameter04(User user){
        System.out.println(user);
        return "/index";
    }

    @RequestMapping("model")
    public ModelAndView parameter07(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("psw","12");
        return mv;
    }


    @RequestMapping("req")
    public ModelAndView parameter07(@SessionAttribute(value = "psw",required = false) String psw){
        return new ModelAndView("index");
    }

    private HttpSession session;

    @RequestMapping("/hct")
    @ModelAttribute
    public String parameter08(HttpSession session){
        this.session = session;
        return "index";
    }
}
