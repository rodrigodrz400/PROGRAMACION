package Metodos;

public class CrivaErastostenes_Angel {

	public static void imprimeErastostenes(int n){
		if (n<=1) return;
		
		boolean [] A;
		
		A = new boolean [n+1];
		
		for (int i=0; i<n; i++) A[i]=true;
		
		for (int i=2; i<Math.sqrt(n); i++){
			if (A[i]==true){
				for (int j=i*i; j<=n; j+=i){
					A[j]=false;
				}
			}
			
		}
		for (int i=2; i<=n; i++){
			if (A[i])
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		imprimeErastostenes(100);
	}

}
