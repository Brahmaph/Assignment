import java.util.Scanner;
public class a2{
public static void main(String args[]){
int a[]={1,3,5,7,9};
int b;
Scanner s=new Scanner(System.in);
System.out.println("Enter the input");
b=s.nextInt();
if(b==1 || b==2){
System.out.println("1");
}

else if(b==3 ||b==4){
System.out.println("1,3,5");
}

else if(b==5 ||b==6){
System.out.println("1,3,5,7,9");
}
else if(b==7 || b==8)
{
System.out.println("1,3,5,7,9,11");
}
}
}