package datos;

public class auto implements carro {
    public void setTipoDevehiculo(String tipoDevehiculo) {
        this.tipoDevehiculo = tipoDevehiculo;
    }

    String tipoDevehiculo;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    String placa;

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    Integer cilindrada;


    @Override
    public String tipoDevehiculo() {
        return null;
    }

    @Override
    public String placa() {
        return null;
    }

    @Override
    public Integer cilindrada() {
        return null;
    }
}
