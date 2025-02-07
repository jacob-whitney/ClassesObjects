# ClassesObjects

Demonstrates defining a class, its attributes and methods. 
Includes example of Constructor, Getters and Setters, 
and defines difference between static and non-static 
attributes and methods.

## Static Attributes
Attributes that will be consistent across all objects of that class  

Example: A Toy class with objects that each have a different name,
but all come from the save factory
```java
class Toy {
    private String name;
    static private static String factory = "ToyMakers Inc.";
}
```

## Static Methods
Methods that are specific to a class, but not to an object.
- Other classes can call these methods
- Cannot access a class' private attributes
- Can access static variables
- Can be called without a specific object  

Example:
```java
public class Toy {
    private String name;
    static private String factory = "ToyMakers Inc.";
    
    void sayName() {
        System.out.println("My name is " + name);
    }
    
    static void showFactory() {
        System.out.println("Factory: " + factory);
    }
}
```

## Inheritance

Classes are broken down into subclasses and superclasses
- Subclass: inherits properties from its parent class
- Superclass: passes down properties to its child classes

Example:  
Toy.java
```java
public class Toy {
    private String name;
    static private String factory = "ToyMakers Inc.";
    
    void sayName() {
        System.out.println("My name is " + name);
    }
    
    static void showFactory() {
        System.out.println("Factory: " + factory);
    }
}
```

ActionFigure.java
```java
public class ActionFigure extends Toy {
    private String catchPhrase;
    
    void sayCatchPhrase() {
        System.out.println(catchPhrase);
    }
}
```

## Polymorphism

When a child class (subclass) overrides a method in its parent class (superclass).  
Example:

Example:  
Toy.java
```java
public class Toy {
    private String name;
    static private String factory = "ToyMakers Inc.";
    
    void sayName() {
        System.out.println("My name is " + name);
    }
    
    static void showFactory() {
        System.out.println("Factory: " + factory);
    }
}
```

ActionFigure.java
```java
public class ActionFigure extends Toy {
    @Override
    void sayName() {
        System.out.println("My superhero name is " + name + "!");
    }
}
```
