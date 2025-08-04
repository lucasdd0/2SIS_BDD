package ex01;

public class Teste {
    public static void main(String[] args){
        int index = 10;
        double temperatura = -90;

        try{
            validar(index, temperatura);
        }
        catch (LeituraInvalidaException e){
//            System.out.println(e.getMessage());
            System.out.println(e);
        }
        finally {
            System.out.println("Sempre passa por aqui");
        }
    }

    public static void validar(int index, double temperatura) throws LeituraInvalidaException{
        if(temperatura < -60 || temperatura > 60){
            throw new LeituraInvalidaException(index, temperatura);
        }
    }
}
