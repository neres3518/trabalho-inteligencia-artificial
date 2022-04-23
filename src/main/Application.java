package main;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> indexCamada1 = new ArrayList<>();
        List<String> indexCamada2 = new ArrayList<>();
        List<String> indexCamada3 = new ArrayList<>();
        List<Integer> indexCamada4 = new ArrayList<>();
        int numEncontrar = random.nextInt(6) + 1; // atualmente gera um n�mero de 1 a 6 mas em nossa lista existe apenas os n�meros 1, 2, 3
        for(int i = 0; i < 9; i++){
            if(indexCamada1.size() == 0){ // se a camada 1 ainda n�o estiver "vista" o sistema ir� ver a primeira ou �nica existente
                indexCamada1.add("A");
                continue;
            }else{
                if(indexCamada2.size() == 0){ // se a camada 2 ainda n�o estiver "vista" o sistema ir� ver a primeira ou �nica existente
                    indexCamada2.add("B");
                }else{
                    if(indexCamada3.size() == 0){ // se a camada 3 ainda n�o estiver "vista" o sistema ir� ver a primeira ou �nica existente
                        indexCamada3.add("E");
                        continue;
                    }else{
                        if(!indexCamada3.contains("F") &&
                            (!indexCamada3.contains("G")) &&
                            (!indexCamada4.contains(1))){ // caso a letra F e G N�O existam no array, ser� verificado se o array da camada 4
                            // n�o cont�m o n�mero 1, caso n�o contenha, ser� adicionao o n�mero 1 neste array
                            indexCamada4.add(1); // TODO: LEMBRAR DE FAZER O IF COM O numEncontrar
                            if(numEncontrar == 1){
                                System.out.printf("O n�mero encontrado � %d", numEncontrar);
                                return;
                            }
                            continue;
                        }else if( // caso a letra F e G N�O existam no array, ser� verificado se o array da camada 4
                            //cont�m o n�mero 1, caso contenha, ser� adicionao o n�mero 2 neste array
                                !indexCamada3.contains("F") &&
                                !indexCamada3.contains("G") &&
                                indexCamada4.contains(1)){
                            indexCamada4.add(2);
                            indexCamada3.add("F");
                            if(numEncontrar == 2){
                                System.out.printf("O n�mero encontrado � %d", numEncontrar);
                                return;
                            }
                        }else if(
                                indexCamada3.contains("F") &&
                                !indexCamada3.contains("G")){ // para simplificar a compara��o, agora ser� verificado se existe a String "F"
                                // no array da camada 3, caso exista, ser� adicionado o numero 4 no array da quarta camada e a String G no array da terceira camada
                                indexCamada4.add(3);
                                indexCamada3.add("G");
                            if(numEncontrar == 3){
                                System.out.printf("O n�mero encontrado � %d", numEncontrar);
                                return;
                            }

                        }else{
                            System.out.printf("O n�mero %d n�o foi encontrado", numEncontrar);
                            return;
                        }

                    }
                }
            }

        }


    }
}
