## Exercicio (Java): Exibindo Números Pares

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Fundamentos Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

#### Entrada: 

Você receberá 1 valor inteiro N, onde N > 0.

#### Saída: 

Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
6 | 2
. | 4
. | 6


#### Java　

```java
//SOLUCAO 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExibirNumerosPares {
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int numEntrada = Integer.parseInt(st.nextToken());
     
      for (int i = 0; i <= numEntrada; i++) {
        if (i % 2 == 0 && i != 0 ) System.out.println (i);
      }
  } 
}
```

