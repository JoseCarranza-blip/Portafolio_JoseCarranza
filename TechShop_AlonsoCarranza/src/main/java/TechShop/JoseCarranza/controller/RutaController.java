package TechShop.JoseCarranza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ruta")
public class RutaController {

    @GetMapping("/listado")
    public String listado() {
        return "ruta/listado";
    }
}

