class demo{
	public static void main(String[]args){
		int a=20;
		int b=30;
		int c=40;
		if(c<=b && c<=a){
			System.out.print(c);
		}else if(b<=a && b>=c){
			System.out.print(b);
		}else{
			System.out.print(a+" in the smallest");
		}
	}
}
