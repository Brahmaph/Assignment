import java.util.Scanner;
class a4{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the input");
int n=s.nextInt();
for(int i=1; i<=5; i++){
if(n%2!=0){
for(int j=1; j<=5; j++){
System.out.print(j);
}
}
else{
for(int k=i; k>=1; k++){
System.out.print(k);
}
}
}

}
}