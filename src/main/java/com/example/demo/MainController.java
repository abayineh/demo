package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex()
    {

        String UserName="";
                Scanner keyboard=new Scanner(System.in);
                UserName = keyboard.nextLine();
                String greet ="Hey "+ UserName;

                System.out.println(greet);
        return greet;
    }
}
