package projetofinalpizzaria;

public class Triangulo extends Forma{
    
    public Triangulo() {
        super();
    }
    
    @Override
    public void calTamcm(double tamcm2) {
        super.setTamcm((Math.sqrt(tamcm2 * 4) / 3));
    }

    @Override
    public void calTamcm2(double tamcm) {
        super.setTamcm2((Math.pow(tamcm, 2) * Math.sqrt(3))/4);
    }

    @Override
    public void validaTamcm(double tamcm) {
       if(tamcm >= 20 && tamcm <= 60)
           super.setTamcm(tamcm);
       else
           throw new IllegalArgumentException("Tamanho invalido para este formato!");
    }

    @Override
    public void validaTamcm2(double tamcm2) {
       if(tamcm2 >= 100 && tamcm2 <= 1600)
           super.setTamcm2(tamcm2);
       else
           throw new IllegalArgumentException("Tamanho invalido para este formato!");
    }
}
