import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Logica de programção Matriz
		//programa para ler dois numeros inteiro e positivo M e N. depois ler uma matriz de M e N contendo numeros
		//inteiros mostrando na tela matriz .
// (E a orientação do que teremos abaixo
		//primeiros numero que vc digitar sera linhas EX:2 linhas
		//o segundo sera as colunas Ex;3 colunas e na linha de baixo prencher e dar enter imprimira na tela)

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();//linha
		int N = sc.nextInt();//coluna
		
		int[][] mat = new int[M][N];//instanciação
		for (int i=0; i<M; i++) {//para percorrer as linhas letra i
			for(int j=0; j<N; j++) {//para percorrer as colunas letra j
				mat[i][j]= sc.nextInt();
				
			}
				
		}
		for (int i=0; i<M; i++) {//para percorrer as linhas letra i
			for(int j=0; j<N; j++) {//para percorrer as colunas letra j
				System.out.print(mat[i][j]+" ");	
			}
			System.out.println();//1ªdigita quantas linhas e quantas colunas  2ª preencha 
		}
		
		
		
		sc.close();
    }
}
