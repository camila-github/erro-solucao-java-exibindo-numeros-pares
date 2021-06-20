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






