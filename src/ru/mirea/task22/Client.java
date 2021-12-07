package ru.mirea.task22;

public class Client {
    private AbstractFactory abstrFactory;
    private Chair chair;
    public Client(AbstractFactory abstrFactory){
        this.abstrFactory = abstrFactory;
    }
    public void Sit(String chair){
        this.chair = abstrFactory.getName(chair);
    }
    public String getChair(){
        return this.chair.getName();
    }

    public static void main(String[] args){
        Client client = new Client(new AbstractFactory());
        client.Sit("Magic");
        System.out.println("Текущий стул: "+client.getChair());
    }
}
