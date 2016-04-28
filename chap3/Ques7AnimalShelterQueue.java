package chap3;

import java.util.LinkedList;

abstract class Animal {
	String name;
	int order;

	public Animal(String n) {
		name = n;
	}

	public void setOrder(int o) {
		order = o;
	}

	public int getOrder() {
		return order;
	}

	public boolean isOlderThan(Animal a) {
		return this.order < a.getOrder();
	}
}

class Dog extends Animal {
	public Dog(String n) {
		super(n);
	}
}

class Cat extends Animal {
	public Cat(String n) {
		super(n);
	}
}

class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;

	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;

		if (a instanceof Dog) {
			dogs.addLast((Dog) a);
		} else if (a instanceof Cat) {
			cats.addLast((Cat) a);
		}
	}

	public Animal dequeueAny() {
		if (dogs.size() == 0) {
			return dequeueCat();
		}
		if (cats.size() == 0) {
			return dequeueDog();
		}

		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlderThan(cat)) {
			return dequeueDog();
		} else {
			return dequeueCat();
		}
	}

	public Dog dequeueDog() {
		return dogs.poll();
	}

	public Cat dequeueCat() {
		return cats.poll();
	}

}

public class Ques7AnimalShelterQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalQueue obj = new AnimalQueue();
		obj.enqueue(new Cat("Cat1"));
		obj.enqueue(new Dog("Dog1"));
		obj.enqueue(new Dog("Dog2"));
		obj.enqueue(new Dog("Dog3"));
		obj.enqueue(new Cat("Cat2"));
		obj.enqueue(new Cat("Cat3"));
		obj.enqueue(new Cat("Cat4"));
		obj.enqueue(new Dog("Dog4"));

		System.out.println("Remove any first entered animal");
		System.out.println(obj.dequeueAny().name);
		System.out.println("Remove first entered Dog");
		System.out.println(obj.dequeueDog().name);
		System.out.println("Remove first entered Cat");
		System.out.println(obj.dequeueCat().name);

	}

}
