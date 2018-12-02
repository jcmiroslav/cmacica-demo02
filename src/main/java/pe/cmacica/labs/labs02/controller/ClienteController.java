package pe.cmacica.labs.labs02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cmacica.labs.labs02.config.MailProperties;
import pe.cmacica.labs.labs02.service.ClienteService;

@Controller
@RequestMapping("/cliente") // para direccionar el localhost:8080/cliente
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private MailProperties mailProperties;

    private static final Logger LOGGER = LoggerFactory.getLogger(ClienteController.class);

    //localhost:8080/cliente/{id}/facturas{idfactura}
    @GetMapping("/{id}")
    public HttpEntity<String> getNombres(@PathVariable("id") int id){  // el HttpEntity<> va con ek @GetMapping

        //System.out.println(mailProperties.getPassword());
        //System.out.println(mailProperties.getServer());
        //System.out.println(mailProperties.getUser());

        LOGGER.debug("{}",mailProperties.getPassword());
        LOGGER.warn("{}",mailProperties.getServer());
        LOGGER.info("{}",mailProperties.getUser());

        return ResponseEntity.ok(clienteService.getNombres(id));
    }
    //public HttpEntity<String> getNombres(){  // el HttpEntity<> va con ek @GetMapping
    //    return ResponseEntity.ok(clienteService.getNombres(0));
    //}

    //localhost:8080/cliante/calcular?n1=5&n2=6
    @GetMapping("/calcular")
    //@Qualifier("clienteProxyV2")
    public HttpEntity<Integer> calcular(@RequestParam("n1") int n1,@RequestParam("n2") int n2){
        Integer rp = clienteService.calcular(n1,n2);

        return ResponseEntity.ok(rp);
    }
}
