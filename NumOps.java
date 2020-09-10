public class NumOps{
  public static void main(String args[]){
    //Challenge 1
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;
    System.out.println(57.2*(i1 / i2)+1); 
    System.out.println(57.2*((double)i1/i2)+1);
    System.out.println(15-i1*(d1*3)+4);
    System.out.println(15-i1*((int)d1*3)+4);
    System.out.println(15-i1*(int)(d1*3)+4);
    //Challenge 2
    int num = 4853;
    int a = (num % 10)*1000;
    num = num/10;
    int b = (num % 10)*100;
    num = num/10;
    int c = (num % 10)*10;
    num = num/10;
    int d = num % 10;
    System.out.print(a+b+c+d);
  }
}