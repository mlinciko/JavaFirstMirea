package ru.mirea.task2.opt4_opt5;

public class DogTest {
    public static void main(String[] args){
        Dog []dogs = new Dog[3];
        dogs[0] = new Dog("Edward", 5);
        dogs[1] = new Dog("Robert", 10);
        dogs[2] = new Dog("Ien");
        dogs[2].setAge(2);
        for(int i = 0; i < 3; i++){
            System.out.println("DOG " + i + ": " + dogs[i]);
        }
        for(int i = 0; i < 3; i++){
            System.out.println("DOG'S " + i +" AGE INTO HUMAN'S: " + dogs[i].intoHumanAge());
        }
    }
}
