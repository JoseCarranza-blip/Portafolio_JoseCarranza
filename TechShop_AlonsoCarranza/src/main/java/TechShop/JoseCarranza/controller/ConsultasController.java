package TechShop.JoseCarranza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultas")
public class ConsultasController {

    @GetMapping("/listado")
    public String listado(Model model) {
        return "consultas/listado";
    }
}

