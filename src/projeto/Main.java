package projeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        int idade, soma = 0;
        double i = 0;
        double media;
        
        while (scan.hasNext()) {
            idade = scan.nextInt();
            if (idade < 0) {
                break;
            }
            
            soma = soma + idade;
            i++;
            
        }
        media = soma / i;
        System.out.println(deci.format(media));
        
    }
    
}
