package com.example.ldap.controller;

import com.example.ldap.Service.LDAPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by amabb on 24/03/17.
 */
@Controller
public class LDAPController {

    @Autowired
    LDAPService ldapService;

    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title", "Dear Learner");
        modal.addAttribute("message", "Welcome to SpringBoot");

        String name = ldapService.getPersonNameByLastName("Amar");
        System.out.print(name);

        return "view";
    }


}
