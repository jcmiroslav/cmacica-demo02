package pe.cmacica.labs.labs02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.cmacica.labs.labs02.service.ClienteService;
import pe.cmacica.labs.labs02.service.CuentaService;

@Controller
@RequestMapping("/cta") // para direccionar el localhost:8080/cliente
public class CuentaController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/")
    public HttpEntity<String> getCuenta(){  // el HttpEntity<> va con ek @GetMapping

        return ResponseEntity.ok(cuentaService.getAccount(2131232));
    }


}
