import java.util.Scanner;

public class Main {
    //My Program
    //version 4 test for git hub
    //22.09.2020

    public static void main(String []args){
        boolean bool = true;
        Scanner input = new Scanner(System.in);
        SortClass srt = new SortClass();
        int c = 0;
        System.out.println("This is second version! For github branch!");
        while(bool) {
            try {
                //MainTest obj = (MainTest) Class.forName("MainTest").newInstance();
                Class MainTestClass = MainTest.class;
                MainTest obj = (MainTest) MainTestClass.newInstance();
                if(c>0) {
                    input.nextLine();
                }
                System.out.println("Enter your full name: ");
                obj.setFullName(input.nextLine());

                System.out.println("Enter your age: ");
                obj.setAge(input.nextInt());

                System.out.println("Enter your occupation: ");
                input.nextLine();
                obj.setOccupation(input.nextLine());

                srt.pushMethod(obj);
                c++;
            }catch (InstantiationException ex2){
                ex2.printStackTrace();
            }catch (IllegalAccessException ex3){
                ex3.printStackTrace();
            }
            System.out.println("Continue? (y/n)");
            char choice = input.next().charAt(0);
            if(choice=='n')
                bool=false;
        }
        srt.print();
    }
}

