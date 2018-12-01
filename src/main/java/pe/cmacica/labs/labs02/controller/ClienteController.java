package pe.cmacica.labs.labs02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cmacica.labs.labs02.service.ClienteService;

@Controller
@RequestMapping("/cliente") // para direccionar el localhost:8080/cliente
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //localhost:8080/cliente/{id}/facturas{idfactura}
    @GetMapping("/")
    public HttpEntity<String> getNombres(@PathVariable("id") int id){  // el HttpEntity<> va con ek @GetMapping
        return ResponseEntity.ok(clienteService.getNombres(id));
    }

    //localhost:8080/cliante/calcular?n1=5&n2=6
    @GetMapping("/calcular")
    @Qualifier("clienteProxyV2")
    public HttpEntity<Integer> calcular(@RequestParam("n1") int n1,@RequestParam("n2") int n2){
        Integer rp = clienteService.calcular(n1,n2);

        return ResponseEntity.ok(rp);
    }
}
