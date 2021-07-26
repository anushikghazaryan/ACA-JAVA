package Homework4;

public class LinkedIntBuffer extends IntBuffer{
    private LinkedIntBuffer next;

    public LinkedIntBuffer(int value) {
        super(value);
        this.next = null;
    }

    public LinkedIntBuffer getNext() {
        return next;
    }

    public LinkedIntBuffer setNext(int value) {
        this.next = new LinkedIntBuffer(value);
        return this;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        str.append(this.getValue()).append(" -> ");

        LinkedIntBuffer cur = this;

        while(cur.next != null) {
            cur = cur.next;
            str.append(cur.getValue()).append(" -> ");
        }
        str.append("null");

        return str.toString();
    }
}
