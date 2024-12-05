package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PetRegistration {

    @GetMapping("/PetRegistration")
    public String registerPet() {
      return "petRegistration";
   }

    @PostMapping("/savePet")
    public String savePet(
        @RequestParam("type") String type,
        @RequestParam("name") String name,
        @RequestParam("gender") String gender,
        @RequestParam("birthDate") String birthDate,
        Model model
    ) {
        // 保存処理 (例: データベースに保存)
        // 今回は確認用にモデルにデータを渡す
        model.addAttribute("type", type);
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        model.addAttribute("birthDate", birthDate);
        
        // 確認画面や一覧ページにリダイレクトする例
        return "redirect:/petList";
    }
}
