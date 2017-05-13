
public class Maopao {
	public static int[] Maopao(int[] arys){
		for(int i=0;i<arys.length;i++){
			for(int j=i+1;j<arys.length;j++){
				 if(arys[i]>arys[j]){
					 arys[i] = arys[j]-arys[i];
					 arys[j] = arys[j]-arys[i];
					 arys[i] = arys[j]+arys[i];
				 }
			}
		}
		return arys;
	}
	
	public static void main(String[] args) {
		int[] a = {9,5,8,4,6,3,1,2,2};
//		int[] c = Maopao(a);
//		for(int i =0;i<d.length;i++){
//			System.out.println(d[i]);
//		}
	}
	
}
