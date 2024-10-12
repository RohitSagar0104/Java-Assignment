class demo{
	public static void main(String[]args){
		int a=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i>=j){
					System.out.print(a+" ");
					a++;
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
/* output
1
2 3
4 5 6
7 8 9 10 */