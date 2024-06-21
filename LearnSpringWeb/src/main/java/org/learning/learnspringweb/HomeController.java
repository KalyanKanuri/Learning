package org.learning.learnspringweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView home(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }
}
