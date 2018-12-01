package pe.cmacica.labs.labs02.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClienteProxyImpl implements  ClienteProxy {
    @Override
    public int calcular(int n1, int n2) {
        return n1 + n2;
    }
}
