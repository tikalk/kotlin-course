public class JavaClass {


    public String jfoo() {
        return "Called method jfoo";
    }

    public static void main(String[] args) {
        System.out.println(new KotlinClass().kfoo());

        //new KotlinNamed().foo(age=14);
    }

}
