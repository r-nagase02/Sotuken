package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/petList")
    public String petList(Model model) {
        // ペットリストのデータを設定
       // model.addAttribute("pets", List.of("猫", "犬", "ハムスター"));
        return "petList";
    }

    @GetMapping("/registerPet")
    public String registerPet() {
        return "petRegistration";
    }
}

