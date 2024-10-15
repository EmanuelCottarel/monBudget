package fr.emanuel.monbudget.global;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexViewController {

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }

}
