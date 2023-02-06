package com.cleanyco.boringbank.controller;

import com.cleanyco.boringbank.model.User;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/signup")
    public String signup(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "signup";
    }

//    //TODO send email verification
//    @PostMapping("/signup")
//    public String processSignup(@ModelAttribute @Valid User user, BindingResult bindingResult) {
//         if (bindingResult.hasErrors()) {
//
//             return "signup";
//         }
//    }
}
