package Basic;
interface Animal{
	void sound();
}
interface Animal1 extends Animal{
	void sound();
}
class Dog implements Animal,Animal1{
	public void sound() {
		System.out.println("barking Bow");
	}
}
class Cat implements Animal{
	public void sound() {
		System.out.println("Making sound meow");
	}
}
public class InterfaceClass {

	public static void main(String[] args) {
Dog d=new Dog();
Cat c=new Cat();
d.sound();
c.sound();
	}

}
