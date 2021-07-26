package Homework4;

public class IntBuffer {
    private int value;

    public IntBuffer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public IntBuffer setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
