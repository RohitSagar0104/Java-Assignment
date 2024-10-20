class Demo{
	public static void main(String[]args){
		for(int i=1;i<=4;i++){
			char ch='A';
			for(int j=1;j<=4;j++){
				if(j<6-i){
					System.out.print(ch+" ");
					ch++;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
/*

O/P:-
A B C D
A B C
A B
A   */