package chewyt.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GenerateController {
    private Logger logger = LoggerFactory.getLogger(GenerateController.class);

    @GetMapping("/")
    public String showGenerateForm(Model model) {
        return "generate";
    }

    @PostMapping("/generate")
    public String showResultpage(@ModelAttribute Generate generate, Model model) {
        if (generate.getNumberVal() > 30 || generate.getNumberVal() < 1) {
            model.addAttribute("errorMessage", "OMG not within range!");
            return "error";
        } else {
            model.addAttribute("randNumsResult", generate.getRandomArray());
            return "result";
        }

    }
}
