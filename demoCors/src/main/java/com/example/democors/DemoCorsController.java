package com.example.democors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCorsController {

    @RequestMapping("/")
    public String DemoCors(){

        return "Hola buen ivysaur";
    }
}
