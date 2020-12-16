public class Dog extends Animal {

    private String name;
    public Dog(Color color) {
        super(color);
    }

    public Dog(int age) {
        super(age);
    }

    public Dog (){

    }

    public Dog(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void makeVoice(String voice) {
        System.out.println(voice);

    }

    public void makeVoice(String voice, int num) {
        for (int i = 0; i <num ; i++) {
            System.out.println(voice);
        }

    }

   final public void makeVoice(int num, String voice) {
        for (int i = 0; i <num ; i++) {
            System.out.println(voice);

        }
    }
}
