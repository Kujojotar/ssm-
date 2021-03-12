package com.atguigu.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoringController {

    @RequestMapping("/li")
    public String gotoList(){
        return "list";
    }

    @RequestMapping("/gotoindex")
    public String gotoIndex(){return "Index";}

    @RequestMapping("/gotoupdate")
    public String gotoUpdate(){
        return "update";
    }

    @RequestMapping("/gotodelete")
    public String gotoDelete(){
        return "delete";
    }


    @RequestMapping("/gotoadd")
    public String gotoAdd(){return "input";}

}
