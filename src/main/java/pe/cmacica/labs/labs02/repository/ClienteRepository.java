package pe.cmacica.labs.labs02.repository;

public interface ClienteRepository {

    String getNombre(int id);
    String getNumeroCuenta(int id);

    int calcular(int n1,int n2);
}
