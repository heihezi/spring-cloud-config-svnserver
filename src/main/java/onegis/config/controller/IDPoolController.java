package onegis.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @date: created on 10:36 2019-02-18
 */
@RestController
public class IDPoolController {

    @GetMapping("/hello")
    public String hello(){
        return "hello workID!";
    }

}
