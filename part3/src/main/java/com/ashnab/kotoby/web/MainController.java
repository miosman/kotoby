package com.ashnab.kotoby.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mohamed on 5/31/2014
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }
}
