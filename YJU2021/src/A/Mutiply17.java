package A;

import java.math.BigInteger;
import java.util.Scanner;
class Mutiply17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine(),b="";
        BigInteger sum= BigInteger.valueOf(0);
        
        for(int i=0; i<a.length(); i++){
            sum=sum.multiply(BigInteger.TWO);
            if(a.charAt(i)=='1') sum=sum.add(BigInteger.ONE);
        }
        sum=sum.multiply(BigInteger.valueOf(17));
        
        for(;!sum.equals(BigInteger.ZERO);){
            BigInteger t=sum.mod(BigInteger.TWO);
            
            if(t.equals(BigInteger.ONE))b+=1;
            else b+=0;
            sum=sum.divide(BigInteger.TWO);
        }
        for(int i=b.length()-1;i>-1;i--){
            System.out.print(b.charAt(i));
        }
    }
}