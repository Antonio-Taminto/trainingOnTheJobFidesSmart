package classi.astratte.interfacce.quadrato.cubo;

public class CalcoloCubo implements Operazione{

    @Override
    public Integer calcolo(Integer numero) {
        return numero*numero*numero;
    }
}
