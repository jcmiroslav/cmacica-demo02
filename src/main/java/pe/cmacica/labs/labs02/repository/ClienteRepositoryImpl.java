package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import pe.cmacica.labs.labs02.service.ClienteService;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    @Qualifier("clienteProxyV2")
    private ClienteProxy clienteProxy;

    @Override
    public String getNombre(int id) {
        return "JC";
    }
    @Override
    public String getNumeroCuenta(int id) {
        return "123456";
    }

    @Override
    public int calcular(int n1, int n2) {
        return clienteProxy.calcular(n1,n2);
    }
}
