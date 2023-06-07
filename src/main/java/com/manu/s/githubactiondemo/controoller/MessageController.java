package com.manu.s.githubactiondemo.controoller;

import com.manu.s.githubactiondemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class MessageController
{

    @GetMapping(value = "/message")
    public String message()
    {
        return "hello GitHub !!";
    }

//    echo "# spring-boot-github-action-demo" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/manu-gowda-s/spring-boot-github-action-demo.git
//    git push -u origin main

}
