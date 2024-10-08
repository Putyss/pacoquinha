package com.senac.uc6.pacoquinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LojaController {

    @GetMapping("/loja")
    public String loja(){

        return "loja";

    }

}
