package TechShop.JoseCarranza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role")
public class RolController {

    @GetMapping("/listado")
    public String listado() {
        return "role/listado";
    }
}

