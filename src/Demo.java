public class Demo {
    int attribute;// thuộc về object, attribute thuộc về object mà Demo tạo ra
    static String test;// thuộc về class

    public static void main(String[] args) {
        Demo.test=" test static";
        Demo demo =new Demo();
        demo.attribute=0;
    }
}
