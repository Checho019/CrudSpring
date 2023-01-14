package ejemplo.proyectoSpring.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class indexController {

    @GetMapping("/")
    public String index(Model model){
        log.info("Loading index controller");
        model.addAttribute("msg","Inicio :3");
        return "index";
    }


}
