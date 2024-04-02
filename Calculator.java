 class Demo {

    int a ;
    public int add(int num1, int num2){
        System.out.println("in add");
        return num1 + num2;
    }

}

    public  class Calculator{
    public static void main(String args[]){

        Demo demo = new Demo();
        int num1 = 5;
        int num2 = 10;

       int result= demo.add(5, 10);
        System.out.println(result);

    }
}
