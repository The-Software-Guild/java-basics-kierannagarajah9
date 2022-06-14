import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {

        findGenetics("Sir Fluffy McFlufferkins Esquire");
    }

    public static void findGenetics(String name){
        Random randNum = new Random();

        double breed1 = randNum.nextInt(10)+1; //assigns each a random number between 1 and 10
        double breed2 = randNum.nextInt(10)+1;
        double breed3 = randNum.nextInt(10)+1;
        double breed4 = randNum.nextInt(10)+1;
        double breed5 = randNum.nextInt(10)+1;

        double sb = breed1/(breed1+breed2+breed3+breed4+breed5) *100; //assigns them a percentage which adds to 100
        double chi = breed2/(breed1+breed2+breed3+breed4+breed5) *100;
        double dram = breed3/(breed1+breed2+breed3+breed4+breed5) *100;
        double com = breed4/(breed1+breed2+breed3+breed4+breed5) *100;
        double kd = breed5/(breed1+breed2+breed3+breed4+breed5) *100;

        System.out.println(name + " is:");
        System.out.println();
        System.out.println(sb+"% St.Bernard");
        System.out.println(chi+"% Chihuahua");
        System.out.println(dram+"% Dramatic RedNosed Asian Pug");
        System.out.println(com+"% Common Cur");
        System.out.println(kd+"% King Doberman");

    }
}
