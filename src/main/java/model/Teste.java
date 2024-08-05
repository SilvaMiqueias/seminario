package model;

import java.util.Arrays;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(4 , 1 , 5 , 8 , 3 , 2);
        int maior = 0;
        int menor = 0;
        int itera = 0;


           while (itera < lis.size()){
               for(int b = itera; b < lis.size(); b++){
                   if(lis.get(itera) > lis.get(b)){
                       maior = lis.get(itera);
                       menor = lis.get(b);
                       lis.set(itera, menor);
                       lis.set(b, maior);
                   }
               }
               itera++;
           }


      lis.stream().forEach(integer -> {System.out.println(integer);});




    }
}
