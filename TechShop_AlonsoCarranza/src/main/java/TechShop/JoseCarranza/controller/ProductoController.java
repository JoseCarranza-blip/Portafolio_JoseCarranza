package TechShop.JoseCarranza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping("/listado")
    public String listado(Model model) {
        // Por ahora sin lógica, solo vista
        return "producto/listado";
    }
}

