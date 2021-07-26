package Homework4;

public class Main {
    public static void main(String[] args) {
        IntBuffer intBuffer1 = new IntBuffer(15);
        System.out.println(intBuffer1.getValue());
        intBuffer1.setValue(23);
        System.out.println(intBuffer1.getValue());

        LinkedIntBuffer linkedIntBuffer1 = new LinkedIntBuffer(23);
        System.out.println(linkedIntBuffer1);


        linkedIntBuffer1.setNext(45);
        System.out.println(linkedIntBuffer1);

        linkedIntBuffer1.getNext().setNext(12);
        System.out.println(linkedIntBuffer1);

        linkedIntBuffer1.getNext().getNext().setNext(26);
        System.out.println(linkedIntBuffer1);

        linkedIntBuffer1.getNext().getNext().getNext().setNext(75);
        System.out.println(linkedIntBuffer1);
    }
}
