import java.util.*;

class demo{
	public static void main(String[]args){
		  
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter char");
		char x=ch.next().charAt(0);
		System.out.println("Enter char");
		char y=ch.next().charAt(0);

		codex cd=new codex();
		cd.fun(x);
		cd.car(y);

		
	}
}

class codex{
	void fun(char x){
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
		System.out.println("Output1 is : "+x+" is vowel");
		}else{
			System.out.println("");
		}
	}
	void car(char y){
		System.out.println("Output2 is : "+y+" is consonant");
	}
}
o/p
Enter char
a
Enter char
b
Output1 is : a is vowel
Output2 is : b is consonant

