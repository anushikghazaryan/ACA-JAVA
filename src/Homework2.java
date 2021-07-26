public class Homework2 {
    public static void main(String[] args) {
        Sentence sentence1 = new Sentence();
        sentence1.append("hello");
        System.out.println(sentence1.getValue());
        sentence1.append("world");
        sentence1.append("from");
        sentence1.append("armenia");
        sentence1.append("!!!");
        sentence1.append("armenia");
        System.out.println(sentence1.getValue());
    }
}

class Sentence {
    private final String[] arr;
    private int lastIndex;

    public Sentence() {
        this.arr = new String[5];
        this.lastIndex = 0;
    }

    public void append(String word) {
        if(lastIndex < 5) {
            arr[lastIndex] = word;
            this.lastIndex++;
        } else {
            System.out.println("can't add");
        }
    }

    public String getValue() {
        if(lastIndex == 1) {
            return arr[0];
        }
        return makeString();
    }

    private String makeString() {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < lastIndex; i++) {
            str.append(arr[i]);
            str.append(" ");
        }
        str.deleteCharAt(str.length() - 1);

        return str.toString();
    }
}
