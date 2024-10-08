package com.senac.uc6.pacoquinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReceitasController {

    @GetMapping("/receitas")
    public String receitas(){

        return "receitas";

    }

}
