package cn.person.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


/**
 * @Auther:cdx
 * @Date:2020-05-14
 * @Description:cn.person.springboot.controller
 * @Version:1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;
    @GetMapping("/show")
    public String test(){


        return "hello hi";
    }


}
