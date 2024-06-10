package com.example.democors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/democors")

public class DemoCorsController {


  @GetMapping
    public ResponseEntity<String> demoCors(){

    System.out.println("Komoo aqui se codifica");
    return new ResponseEntity<String>("Hola  Charizard!", HttpStatus.OK);};





}
