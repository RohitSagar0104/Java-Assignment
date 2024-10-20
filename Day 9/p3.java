class Demo{
	public static void main(String[]args){
		for(int i=1;i<=4;i++){
			char ch='A';
			char ch1='a';
			for(int j=1;j<=4;j++){
				if(j<6-i){
				if(i%2!=1){
					System.out.print(ch1+" ");
					ch1++;
				}else{
					System.out.print(ch+" ");
					ch++;
				}
				}
			}
			System.out.println();
		}
	}
}

/*
output=
A B C D
a b c
A B
a   */