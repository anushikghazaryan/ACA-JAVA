public  class Homework1{
    public static void main(String[] args) {
        Person anush = new Person("Anush", 943399095000L);
        System.out.println(anush.getAge());
        anush.setName("Anushik");
        System.out.println(anush.getName());


        Person anan = new Person("Anan");
        System.out.println(anan.getAge());
    }
}
class Person {
    private final long birthMillis;
    private String name;

    public Person(String name, long birthMillis) {
        this.birthMillis = birthMillis;
        this.name = name;
    }

    public Person(String name) {
        this.birthMillis = -1;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(birthMillis != -1) {
            return   (int) ((System.currentTimeMillis() - birthMillis) / 31536000000L);
        } else {
            throw new RuntimeException();
        }
    }
}
