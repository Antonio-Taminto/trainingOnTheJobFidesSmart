package classi.astratte.interfacce.quadrato.cubo;

public class CalcoloQuadrato implements Operazione{

    @Override
    public Integer calcolo(Integer numero) {
        return numero*numero;
    }
}
