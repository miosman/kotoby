package com.ashnab.kotoby.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mohamed on 5/29/2014
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
}
