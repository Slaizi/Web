package ru.Bogachev.bysell.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.Bogachev.bysell.models.User;
import ru.Bogachev.bysell.services.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/registration")
    public String registration () {
        return "registration";
    }
    @PostMapping("/registration")
    public String createdUser (User user, Model model) {
        if(!userService.createdUser(user)) {
            model.addAttribute("errorMessage", "Пользователь с email: " + user.getEmail() + " ужу существует");
            return "registration";
        }
        return "redirect:/login";
    }
    @GetMapping("/hello")
    public String securityUrl() {
        return "hello";
    }
}
