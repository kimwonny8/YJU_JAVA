package Algorithm;

import java.util.Scanner;
import java.util.Stack;

class Calculator {
   public String ConvToRPNExp(char exp[]) { // ����ǥ������� ��ȯ
      Stack<Character> stack=new Stack();
      
      String str="";
      char[] convExp = new char[exp.length+1];
      
      int idx=0;
      char tok, popOp;
      
      for(int i=0; i<exp.length; i++) {
         tok=exp[i];
         if(Character.isDigit(tok)) {
            convExp[idx++] = tok;
         }
         else {
            if(tok=='(') stack.push(tok);
            else if(tok==')') {
               while(true) {
                  popOp = stack.pop();
                  if(popOp == '(') break;
                  convExp[idx++] = popOp;
               }
            }
            else if(tok=='+' || tok=='-' || tok=='*'|| tok=='/') {
               while(!(stack.isEmpty()) && WhoPrecOp(stack.peek(),tok) >= 0)
                  convExp[idx++] = stack.pop();
               stack.push(tok);
         }
      }
   }
      while(!(stack.empty())) {
         convExp[idx++] = stack.pop();   
      }   
      
      for(int i=0; i<exp.length; i++) {
         exp[i]=convExp[i];
         str+=exp[i];
      }
      return str;
      
   }
   public int GetOpPrec(char op) { // ������ �켱���� �ű��
      switch(op) {
      case '*': case'/':
         return 5;
      case '+': case'-':
         return 3;
      case '(':
         return 1;
      }
      return -1;
   }
   
   public int WhoPrecOp(char op1, char op2) { // ������ �켱������ ��
      int op1Prec = GetOpPrec(op1);
      int op2Prec = GetOpPrec(op2);
      
      if(op1Prec > op2Prec) return 1;
      else if(op1Prec < op2Prec) return -1;
      else return 0;
   }
   
   public double EvalRPNExp(String postfix) { // ����ǥ��� ���
      Stack st=new Stack();
 
      for(int i=0; i<postfix.length(); i++) {
    	 char tok=postfix.charAt(i);
         if(Character.isDigit(tok)) {
            st.push(tok);
         }
         else {
        	double op2 = Double.valueOf(st.pop().toString());
            double op1 = Double.valueOf(st.pop().toString());
             
            if(tok=='+') st.push(op1+op2);
            else if(tok=='-') st.push(op1-op2);
            else if(tok=='*') st.push(op1*op2);
            else if(tok=='/') st.push(op1/op2);
         }
      }
      return Double.valueOf(st.pop().toString());
   }

}

public class Stack_calculator {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("���� �Է��ϼ���: ");
      String s=sc.nextLine();
      char []exp=new char[s.length()];
      for(int i=0; i<s.length(); i++) {
         exp[i]=s.charAt(i);      
      }
      
      Calculator cal=new Calculator();
      String str=cal.ConvToRPNExp(exp);
      
      System.out.println(str);
      System.out.print((int)cal.EvalRPNExp(str));
      
   }
}