public class FizzBuzz{

    void run(String[] args){
        Integer number;
        if(args.length == 0){
            number = 15;
        }else{
            number = Integer.parseInt(args[0]);
        }       
        for(Integer i=1; number>=i; i++){
            if(i%3==0){
                System.out.printf("Fizz");
            }
            if(i%5==0){
                System.out.printf("Buzz");
            }
            if(i%3!=0 && i%5!=0){
                System.out.printf("%d",i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        FizzBuzz result = new FizzBuzz();
        result.run(args);
    }
}