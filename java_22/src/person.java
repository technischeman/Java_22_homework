public class person {

    private String name;
    private int age;


    public static Object yazdir(int age, int age1, String name, String name1) {
        if (age > age1) {
            System.out.println(name + " older than " + name1);

            return age + "old " + name;

        } else {
            //System.out.println(name1+" older than "+name);
            System.out.println(name1 + " older than " + name);
            return age1 + " old " + name1;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



