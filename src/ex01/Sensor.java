package ex01;

import java.util.ArrayList;
import java.util.List;


public class Sensor {
    private String id;
    private List<Double> leituras;

    public Sensor(String id){
        this.id = id;
        this.leituras = new ArrayList<>();
    }

    public void registrarLeituras(List<Double> leituras) throws LeituraInvalidaException{
        if(leituras.size() != 100){
            throw new IllegalArgumentException("O total de leituras deve ser 100!");
        }
        for(int i = 0; i < leituras.size(); i++){
            double temp = leituras.get(i);
            if(temp < -60 || temp > 60){
                throw new LeituraInvalidaException(i, temp);
            }
        }
    }
}
