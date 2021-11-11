package it.uniparthenope.informatica.prgriii9.l09;

public class Exception01 {
    public static void main(String[] args) {
        try {
            double sum = 0.0;
            for (String ars : args) {
                sum += Double.parseDouble(ars);
            }
            System.out.println("sum =" + sum);
        } catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
