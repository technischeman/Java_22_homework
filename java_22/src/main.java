public class main {
    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person();
        person p3 = new person();


        p1.setName("ali");
        p1.setAge(15);
        p2.setName("veli");
        p2.setAge(18);
        p3.setName("metin");
        p3.setAge(4);
        Object a = person.yazdir(p1.getAge(), p2.getAge(), p1.getName(), p2.getName());
        System.out.println("age of older is=" + a);


    }
}


