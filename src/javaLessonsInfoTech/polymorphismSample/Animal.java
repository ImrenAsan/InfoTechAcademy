package javaLessonsInfoTech.polymorphismSample;

class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound!");
    }
}

class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The cat says: miaw miaw");
    }
}

class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The dog says: wuf wuf");
    }
}
class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();

        Cat myCat = new Cat();
        myCat.animalSound();
    }
}
