package jflex2;

public class prueba {
	public static void main(String args[]){
		  int resultado = (funcion(5));
		  int a = 0;
		  int b = 0;
		  System.out.println(resultado);
		  funcion(5);
		  System.out.println(factorial(4+1,true));
		  
		  for(boolean n = false; !n;) {
			  a++;
			  System.out.println(a);
			  if (a >=4) {
				  n=true;
			  }
		  }
		  
		  for(int n=0; n<factorial(3,false)+1;n++) {
			  b++;
			  System.out.println(b);
		  }
		  
		  
		}

		public static int funcion(int x){
		 return(funcion2(x));
		}

		public static int funcion2(int x){
		  return (5+x);
		}
		
		public static int factorial(int n,boolean sex) {
			if(sex) {
				return 69;
			}else {
				if(n == 0) {
					return 1;
				}else {
					return n*factorial(n-1,sex);
				}
			}
		}
		
		public static int aaa() {
			System.out.println();
			return 0;
		}
}
