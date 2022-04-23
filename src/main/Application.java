package main;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> indexCamada1 = new ArrayList<>();
        List<String> indexCamada2 = new ArrayList<>();
        List<String> indexCamada3 = new ArrayList<>();
        List<Integer> indexCamada4 = new ArrayList<>();
        int numEncontrar = random.nextInt(6) + 1; // atualmente gera um número de 1 a 6 mas em nossa lista existe apenas os números 1, 2, 3
        for(int i = 0; i < 9; i++){
            if(indexCamada1.size() == 0){ // se a camada 1 ainda não estiver "vista" o sistema irá ver a primeira ou única existente
                indexCamada1.add("A");
                continue;
            }else{
                if(indexCamada2.size() == 0){ // se a camada 2 ainda não estiver "vista" o sistema irá ver a primeira ou única existente
                    indexCamada2.add("B");
                }else{
                    if(indexCamada3.size() == 0){ // se a camada 3 ainda não estiver "vista" o sistema irá ver a primeira ou única existente
                        indexCamada3.add("E");
                        continue;
                    }else{
                        if(!indexCamada3.contains("F") &&
                            (!indexCamada3.contains("G")) &&
                            (!indexCamada4.contains(1))){ // caso a letra F e G NÃO existam no array, será verificado se o array da camada 4
                            // não contém o número 1, caso não contenha, será adicionao o número 1 neste array
                            indexCamada4.add(1); // TODO: LEMBRAR DE FAZER O IF COM O numEncontrar
                            if(numEncontrar == 1){
                                System.out.printf("O número encontrado é %d", numEncontrar);
                                return;
                            }
                            continue;
                        }else if( // caso a letra F e G NÃO existam no array, será verificado se o array da camada 4
                            //contém o número 1, caso contenha, será adicionao o número 2 neste array
                                !indexCamada3.contains("F") &&
                                !indexCamada3.contains("G") &&
                                indexCamada4.contains(1)){
                            indexCamada4.add(2);
                            indexCamada3.add("F");
                            if(numEncontrar == 2){
                                System.out.printf("O número encontrado é %d", numEncontrar);
                                return;
                            }
                        }else if(
                                indexCamada3.contains("F") &&
                                !indexCamada3.contains("G")){ // para simplificar a comparação, agora será verificado se existe a String "F"
                                // no array da camada 3, caso exista, será adicionado o numero 4 no array da quarta camada e a String G no array da terceira camada
                                indexCamada4.add(3);
                                indexCamada3.add("G");
                            if(numEncontrar == 3){
                                System.out.printf("O número encontrado é %d", numEncontrar);
                                return;
                            }

                        }else{
                            System.out.printf("O número %d não foi encontrado", numEncontrar);
                            return;
                        }

                    }
                }
            }

        }


    }
}
