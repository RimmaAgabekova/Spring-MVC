package agabekova.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
