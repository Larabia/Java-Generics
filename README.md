# Java-Generics 🚀
You can use this project as a cheatsheet or a fast course on Java Generics!

## Before we start ✋
> In this ReadMe you'll find information about **Generic clases, interfaces and methods in Java.**  
> Also, this project includes java files with the **actual implementation** of Generics.

We will be reviewing the following topics:
- Generics on Java.
- Generic classes, interfaces and methods.
- Upper Bounds.
- `Wildcards.

**You can use this ReadMe as a cheatsheet and clone this project to run it in your IDE for further knowledge about how Generics work in Java.**

🛠️ This project was created with **Java8** and **Eclipse**(IDE).

So you'll need a **basic knolage of Java**, an **IDE** and **Java 8 installed** and you are ready to go!

[To download and install Eclipse on Windows 10](https://www.youtube.com/watch?v=N-wXTRpR03U)

[To download and install Java8](https://www.youtube.com/watch?v=ClcHrcNXP9g)

## Generics on Java 🌎

**Generics** means **parameterized types**. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. **Using Generics, it is possible to create classes that work with different data types.** An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

### Type Parameters in Java Generics ⭐
The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

- T : Type
- E : Element
- K : Key
- N : Number
- V : Value

**Note:** In Parameter type we can not use primitives like ‘int’,’char’ or ‘double’. We should use wrapper classes such as Integer, Double or Character.

### Advantages of Generics ⭐

Programs that use Generics has got many benefits over non-generic code. 

1. **Code Reuse:** We can write a method/class/interface once and use it for any type we want.

2. **Type Safety:** Generics make errors to appear compile time than at run time (It’s always better to know problems in your code at compile time rather than making your code fail at run time). Suppose you want to create an ArrayList that store name of students, and if by mistake the programmer adds an integer object instead of a string, the compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.
3. **Individual Type Casting is not needed:**Typecasting at every retrieval operation is a big headache. If we already know that our list only holds string data, we need not typecast it every time.
4. **Generics Promotes Code Reusability:** With the help of generics in Java, we can write code that will work with different types of data. 
5. **Implementing Generic Algorithms:** By using generics, we can implement algorithms that work on different types of objects, and at the same, they are type-safe too.

Example of type safety:

```java
        // Creating an ArrayList without any type specified
        ArrayList normalArr = new ArrayList();
  
        normalArr.add("Pola");
        normalArr.add(22); // Compiler allows this
  
        String string1 = (String)normalArr.get(0);
  
        // Causes Runtime Exception
        String string2 = (String)normalArr.get(1);
```

```java
// Creating a an ArrayList with String specified
        ArrayList <String> genericArr = new ArrayList<String> ();
  
        genericArr.add("Pola");
        // Now Compiler doesn't allow this
        genericArr.add(22); 
 
        // Typecasting is not needed
        String string1 = genericArr.get(0);
        String string2 = genericArr.get(1);
```
```java
// instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj
            = new Test<String>("Java Generics");
        System.out.println(sObj.getObject());
        iObj = sObj; // This results an error
```

## Generic classes 🐙

For example, classes like HashSet, ArrayList, HashMap, etc., use generics very well.

- A generic class **is implemented exactly like a non-generic class**.
- The only difference is that **it contains a type parameter section**. 
- There **can be more than one type of parameter, separated by a comma**. 
- The classes, **which accept one or more parameters**, are known as **parameterized classes** or **parameterized types**.

```java
public class Box <T> {
  private T data;
 
  public Box(T data) {
    this.data = data;
  }
 
  public T getData() {
    return this.data;
  }  
}

```

To create a reference:

```java
Box<Integer> intBox = new Box<>(56);
```
**raw type** were prevalent prior to the introduction of generics in Java 5 and should be avoid.

```java
Box box = new Box<>("My String");  // Raw type box
```

## Generic interfaces 👽

A **generic interface** can be implemented by a **generic class** and its generic type parameter can be used as the argument to the interface type parameter.  
**Interface method declarations** are similar to non-generic interfaces and can include non-generic methods as well.

```java
public class Box <T> implements Replacer<T> {
  private T data;
 
  @ Override
  void replace(T data) {
    this.data = data;
  }
}
```

We can also have a **non-generic class** implement a **generic interface** by specifying the type argument to the interface. 

```java
public class StringBag implements Replacer<String> {
  private String data;
 
  @ Override
  void replace(String data) {
    this.data = data; 
  }
}
```

To create a reference:

```java
Replacer<Integer> boxReplacer = new Box<>();  // Using generic `Box` implementation
Replacer<String> bagReplacer = new StringBag();  // Using non-generic `StringBag` implementation

```

## Generic methods 👾

Generic Java method takes a parameter and returns some value after performing a task.   
It is exactly like a normal function, however, **a generic method has type parameters that are cited by actual type**. This allows the generic method to be used in a more general way. **The compiler takes care of the type of safety** which enables programmers to code easily since they do not have to perform long, individual type castings.

```java

public class StringBox {
  private String data;
 
  public <T> boolean isString(T item) {
    return item instanceof String;
  }
}
 
StringBox box = new StringBox();
box.isString(5); // Returns false

```
We can also do this with `static` methods and **their signatures have the same requirements** except for also needing the `static` keyword.

```java

public class StringBox {
  private String data;
 
  public static <T> boolean isString(T item) {
    return item instanceof String;
  }
}
StringBox.isString(5);  // Returns false

```


## Upper Bounds 🛸

An upper bound **will limit the type parameter to a parent type or any of its child types** using the reserved word `extends`.

```java
public class Box <T extends Number> {
  private T data;
}

```

We can similarly add upper bounds to **generic methods** as follows:

```java
public static <T extends Number> boolean isZero(T data) {
  return data.equals(0);
}

```

Java also allows us to create a type parameter with **multiple bounds**.

```java
public class Box <T extends Number & Comparable<T>> {
  private T data;
}

```






