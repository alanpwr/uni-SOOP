package lab8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

      // BinaryNumber bn = new BinaryNumber(-    8);
	     //   System.out.println(bn.getInteger() + " is represented as: "+ bn.toString());
        BinaryNumber bn2 = new BinaryNumber(8);
       System.out.println(bn2.getInteger() + " is represented as: "+ bn2.toString());
//	        BinaryNumber bn3 = new BinaryNumber(34);
//	        System.out.println(bn3.getInteger() + " is represented as: "+ bn3.toString());
//	        BinaryNumber bn4 = bn3.calcAND(bn3);
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an expression: ");
	        String line = sc.nextLine();
	        String[] exp = line.split("[ \t]+");
	        int zero=0;
	        int sec=0;

	        int and_flag=0;
	        int or_flag=0;
	        int xor_flag=0;

	        switch (exp[1]){
	            case "^" :
	                xor_flag =1;
	                break;
	            case "&&" :
	                and_flag =1;
	                break;
	            case "||" :
	                or_flag =1;
	                break;
	        }
	        String zeroString="";
	        String secString="";
	        if (exp[0].contains("\"")){
	            zeroString=exp[0].split("\"")[1];
	            if (zeroString.length()==32 && zeroString.charAt(0)=='1'){
	                System.out.println("negative int value at zero");
	                zeroString = "-" + zeroString.substring(1);
	            }
	            zero = Integer.parseInt(zeroString,2);
	        }else {
	            zero = Integer.parseInt(exp[0]);
	        }
	        if (exp[2].contains("\"")){
	            secString=exp[2].split("\"")[1];
	            if (secString.length()==32 && secString.charAt(0)=='1'){
	                System.out.println("negative int value at sec");
	                secString = "-"+secString.substring(1);
	            }
	            sec = Integer.parseInt(secString,2);
	        }else {
	            sec = Integer.parseInt(exp[2]);
	        }
	        System.out.println("first : "+zero+"\tsec:"+sec);

	        BinaryNumber bn1  = new BinaryNumber(zero);
	        BinaryNumber bn  = new BinaryNumber(sec);


	        BinaryNumber bnExp;
	        System.out.println("Every output until tabs are gone is a tryout for our BinaryNumber class...");
	        bnExp = bn1.calcAND(sec);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());

	        bnExp = bn1.calcAND(bn2);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());

	        bnExp = bn1.calcOR(sec);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());

	        bnExp = bn1.calcOR(bn2);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());

	        bnExp = bn1.calcXOR(sec);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());

	        bnExp = bn1.calcXOR(bn2);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());

	        bnExp=BinaryNumber.calcAND(zero,sec);
	        System.out.println("\t"+bnExp.getInteger()+" "+bnExp.toString());


	        System.out.println("I tried every option so far...\nAnd i am done.");


	        switch (and_flag){
	            case 0:
	                break;
	            case 1:
	                bnExp = bn1.calcAND(bn2);
	                System.out.println("Integer version: "+bnExp.getInteger()+" Binary version: "+bnExp.toString());
	                break;
	        }
	        switch (or_flag){
	            case 0:
	                break;
	            case 1:
	                bnExp = bn1.calcOR(bn2);
	                System.out.println("Integer version: "+bnExp.getInteger()+" Binary version: "+bnExp.toString());
	                break;
	        }
	        switch (xor_flag){
	            case 0:
	                break;
	            case 1:
	                bnExp = bn1.calcXOR(bn2);
	                System.out.println("Integer version: "+bnExp.getInteger()+" Binary version: "+bnExp.toString());
	                break;
	        }



	}

}
