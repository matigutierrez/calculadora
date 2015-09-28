
package javaapplication51;

public class JavaApplication51 {

    public static void main(String[] args) {
       int N = (int) Math.floor(Math.random()*400+100);
		int aprue=0;
                int aprueba=0;
                int desaprue=0;
		
		char [][] vota = new char[2][N]; 
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
		         int inter = (int) Math.floor(Math.random()*3);
		         char votos=' ';
			    if (inter>=1 && inter<2 ){
			        votos = '1';
				if (i==0) {
				    aprue++;
					}
				if (i==1) {
				    aprueba++;
					}
				}
                            if (inter>=0 && inter<1 ){
				votos = '0';
				if (i==1) {
				    desaprue++;
					}
				}
			    if (inter>=2 && inter<=3 ){
			        votos = 'n';
				}
			    vota[i][j] = votos;
			}
		
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
			System.out.print(vota[i][j]+" ");
			if (j==N-1){
			System.out.println("");}
			}
		}
		float porcent = (float) (aprueba+aprue)/N;
		int porciento = (int) (porcent*100);
		System.out.println("Los hommbres que aprueban son: " + aprue);
		System.out.println("Las mujeres que desarueban:" + desaprue);
		System.out.println("El porcentaje es :" + (porciento));
		System.out.println("Los votantes en total son :" + 2*N);
    }
    
}
