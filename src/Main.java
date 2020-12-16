public class Main {

    public static void main(String[] args) {
	Dog objectA= new Dog();
	objectA.getName();
	objectA.getAge();
	objectA.getColor();
	objectA.makeVoice("гав");
	objectA.makeVoice("гав ", 3 );
	objectA.makeVoice(4,"Гав");
        System.out.println(objectA.getInfo());

        Puppy objectB= new Puppy();
        objectB.getName();
        objectB.getAge();
        objectB.getColor();
        objectB.makeVoice("гав");
        objectB.makeVoice(3,"гав");
        objectB.makeVoice("ГАВ",4);
		System.out.println(objectB.getInfo());

		Puppy objectC= new Puppy();
		objectC.getName();
		objectC.getAge();
		objectC.getColor();
		objectC.makeVoice("Гав");
		objectC.makeVoice("Гав", 4);
		objectC.makeVoice(5,"Гав");
		System.out.println(objectC.getInfo());
	}
}
