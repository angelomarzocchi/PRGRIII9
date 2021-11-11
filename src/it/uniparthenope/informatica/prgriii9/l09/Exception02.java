package it.uniparthenope.informatica.prgriii9.l09;

public class Exception02 {
    public static void main(String[] args) {

            double sum = 0.0;
            for (String ars : args) {
                try {
                    sum += Double.parseDouble(ars);
                } catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("sum =" + sum);

    }
}
