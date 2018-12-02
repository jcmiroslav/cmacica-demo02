package pe.cmacica.labs.labs02.service;

import org.springframework.beans.factory.annotation.Value;

public class CuentaServiceImpl implements CuentaService {

    @Value("${labs02.cuenta}")
    private String cuenta;

    @Override
    public String getAccount(int id) {
        return cuenta;
    }
}
