package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("clienteProxyV2")
public class ClienteProxyV2Impl implements ClienteProxy {
    @Override
    public int calcular(int n1, int n2) {
        return n1 + n2;
    }
}
