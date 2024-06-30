import java.util.*;
import java.util.Scanner;
public class Daimond{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int i,j,k;
for(i=1;i<=n;i++){
    for(j=1;j<=n-i;j++){
       System.out.print("  ");
    }
    for(k=1;k<=2*i-1;k++){
       System.out.print("*"+" ") ;
    }
    System.out.println();
}
n=n-1;
for(i=n;i>=1;i--){
    for(j=i;j<=n;j++){
       System.out.print("  ");
    }
    for(k=1;k<=2*i-1;k++){
       System.out.print("*"+" ") ;
    }
    System.out.println();
}
}
}