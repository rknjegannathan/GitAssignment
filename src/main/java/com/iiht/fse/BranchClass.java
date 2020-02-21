package com.iiht.fse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchClass{

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome from Git Repo! Spring Boot!";
    }

}
