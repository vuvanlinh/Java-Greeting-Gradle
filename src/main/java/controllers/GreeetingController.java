package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreeetingController {
    @GetMapping("/hello")
    public String greeting(@RequestParam String alo, Model model) {
        model.addAttribute("name",alo);
        return "index";
    }
}
