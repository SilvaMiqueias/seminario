package model;

import java.util.Arrays;
import java.util.List;

public class AtividadeUM {

    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(4, 1, 5, 8, 3, 2);
        int maior = 0;
        int menor = 0;
        int itera = 0;


        while (itera < lis.size()) {
            for (int b = itera; b < lis.size(); b++) {
                if (b > 0) {
                    if (lis.get(b) < lis.get(b - 1)) {
                        maior = lis.get(b - 1);
                        menor = lis.get(b);
                        lis.set(b, maior);
                        lis.set(b - 1, menor);
                    }
                }

            }
            itera++;
        }


        lis.stream().forEach(integer -> {
            System.out.println(integer);
        });
    }
}
