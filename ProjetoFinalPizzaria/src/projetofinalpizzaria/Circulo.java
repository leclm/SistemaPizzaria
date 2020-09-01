package projetofinalpizzaria;

public class Circulo extends Forma {

    public Circulo() {
        super();
    }
    
    @Override
    public void calTamcm(double tamcm2) {
        double tamcm = (Math.sqrt(tamcm2/Math.PI));
        validaTamcm(tamcm);
    }

    @Override
    public void calTamcm2(double tamcm) {
        double tamcm2 = ((Math.pow(tamcm, 2) * Math.PI));
        validaTamcm2(tamcm2);
    }

    @Override
    public void validaTamcm(double tamcm) {
       if(tamcm >= 7 && tamcm <= 23)
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