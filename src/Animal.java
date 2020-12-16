public class Animal {
    private  int age;
    private Color color;

    public Animal(Color color) {
        this.color = color;
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return "Age = " + age + ", Color =" + color ;
    }

}
