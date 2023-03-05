package javaLessonsInfoTech.abstractClassSample;

abstract class Animal {
    //Animal is an abstract class

    public abstract void animalSound();//-> Abstract method, does not have a body

    public void sleep(){                //Regular method, abstract class can have abstract and regular methods.
        System.out.println("Zzz");
    }
}

//Subclass "Pig" (inherit from Animal)

    class Pig extends Animal{
        @Override
        public void animalSound() {
            //The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }
    }

    class Main{
        public static void main(String[] args) {
            Pig thatPig = new Pig(); //We have created here an object from the class, which is inherited from the ABSTRACT CLASS!
            thatPig.animalSound();
            thatPig.sleep();

            Dog myDog = new Dog();
            myDog.animalSound();
            myDog.sleep();
            /*
            Polymorphism means "many forms",
            and it occurs when we have many classes that are related to each other by inheritance.
            Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
            Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
             */
        }
    }
