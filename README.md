# Java SE

## What is Java?

- High Level Programming
- Object Oriented
- Strong Type Programming
- Write Once Run AnyWhere
- Desktop Applications
- Mobile Applications
- Enterprise Applications
- Embedded Applications
- Functional Style

## Writing Java

![writing Data](assets/writing-java.png)

1. Source Code အားရေးသားခြင်း
2. Source Code အား compile လုပ်ခြင်း
3. Class file အား Java Virtual Machine(JVM) ပေါ်တွင် အလုပ်လုပ်စေခြင်း

## Write Once Run Anywhere

![run anywhere](assets/once-run-anywhere.png)

Java program တစ်ခုက JVM ရှိတဲ့ ဘယ် machine မှာမဆို အလုပ်လုပ်နိုင်ပါတယ်။

## Java Environment

![java environment](assets/java-environment.png)

## Java Editions

- Java SE
    - Java ဘာသာရပ်၏ အခြေခံ Edition
    - Desktop Application များအား ရေးသားနိုင်
- Java EE
    - Enterprise Java Application များအား ရေးသားရန် အခြေခံ Edition
- Java ME
    - Embedded ပတ်ဝန်းကျင်များ အတွက် Java Edition

## In This Course

- Java Basic
    - Language Fundamentals
        - Basic Structure of a Class
        - Java Data Types
        - Identifis and Madifiers
        - Statements
    - OOP
        - OOP
        - Class & Interfaces
        - Enum & Annotations
        - Generics
    - Essential API
        - Exceptions
        - Numbers
        - Strings
        - Date & Calendar
        - Collections
        - Java IO
        - Nio 2
        - Threads
        - Concurrency
    - Functional Style
        - Lambda Expression
        - Streams API
        - Functional Programming
        - Functional Interfaces
- Database
    - Relational Database
    - Data Modeling
    - Simple SQL
    - JDBC API
- GUI
    - Scene Graph
    - Layouts
    - Controls
    - Styles and Effects
    - Animations

## Basic Structure of a Class

### Write A Class

class တွေကနေ တစ်ဆင့် object တွေကို တည်ဆောင်ဖို့ class တွေကို ရေးသားတာဖြစ်ပါတယ်။

### Components

- Package statements
- Import statements
- Comments
- Class declaration {\
  &nbsp; &nbsp; &nbsp; &nbsp;Variables\
  &nbsp; &nbsp; &nbsp; &nbsp;Comments\
  &nbsp; &nbsp; &nbsp; &nbsp;Constructors\
  &nbsp; &nbsp; &nbsp; &nbsp;Methods\
  &nbsp; &nbsp; &nbsp; &nbsp;Nested classes\
  &nbsp; &nbsp; &nbsp; &nbsp;Nested Interface\
  &nbsp; &nbsp; &nbsp; &nbsp;Enum\
  \}

## Class Declaration

class declaration components

|    Name    |    Descriptions     |   Status   |
|:----------:|:-------------------:|:----------:|
|   public   |   Access modifier   |  Optional  |
|   final    | Non-Access modifier |  Optional  |
|   class    |    Keyword class    | Compulsory |
|   Runner   |    Name of class    | Compulsory |
|  extends   |   Keyword extends   |  Optional  |
|  Persons   |   Base class name   |  Optional  |
| implements | Keyword implements  |  Optional  |
|  Athlete   | Name of implements  |  Optional  |
|     {}     |    Curly braces     | Compulsory |

## Running a Java Program

Java program တွေကို run မယ်ဆိုရင် `java` ဆိုတဲ့ command ကို သုံးပြီးတော့ run လို့ရပါတယ်။

```java
public class Person {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

program ထဲမှာ run စေချင်တဲ့ code တွေကို main method ထဲမှာ ရေးရပါမယ်။

### How does work Args?

main method ထဲမှာပါလာတဲ့ args သည် java program ကို run တဲ့ အချိန်မှာ parameter အနေနဲ့ ပေးလိုက်တဲ့ value တွေကို args ကနေ
ပြန်ယူနိုင်ပါတယ်။

```java
public class Person {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
```

```bash
$ javac Person.java
$ java Person Hello
```

ဒီနေရာမှာဆိုရင် hello ဆိုတဲ့ command သည် args သို့ value အဖြစ်နဲ့ ပေးတာဖြစ်ပါတယ်။

```bash
$ java Person Hello World
``` 

ဒီနေရာမှာဆိုရင်တော့ Hello World သည် line တစ်ခုစီဖြင့်ထွက်လာမှာပဲ ဖြစ်ပါတယ်။ ဘာဖြစ်လို့လဲ ဆိုတော့ Hello နဲ့ World ဆိုတဲ့
command နှစ်ခုကြားမှာ space ပါနေတဲ့အတွက်ကြောင့် command နှစ်ခုလို့ သတ်မှတ်တာဖြစ်တဲ့အတွက်ကြောင့် Hello အသည် line 1
နေရာမှာပေါ်ပြီးတော့ World အသည် line 2 ဖြင့် ဖေါ်ပြမှာပဲ ဖြစ်ပါတယ်။

```bash
$ java Person "Hello World"
```

ဒီလိုရေးမယ်ဆိုရင်တော့ "Hello World" သည် line တစ်ခုတည်းဖြင့်ထွက်လာမှာပဲ ဖြစ်ပါတယ်။ "" double quote ပါနေတဲ့အတွက်ကြောင့်
string ဖြစ်သတ်မှတ်ပြီးတော့ စာကြောင်းတစ်ကြောင့်တည်းမှာပဲ လာဖော်ပြတာပဲ ဖြစ်ပါတယ်။

## Creating Objects from a Class

class ဟာ object တွေကို တည်ဆောက်ဖို့ပဲ ဖြစ်ပါတယ်။ object တစ်ခုမှာ အဓိကအားဖြင့်ဘာတွေပါလဲ ဆိုရင်တော့

- State
- Behaviour

ဆိုတဲ့ object ရဲ့ state ဖြစ်တဲ့ ပိုင်ဆိုင်မှု နဲ့ behaviour ဖြစ်တဲ့ အပြုအမူတို့ပါရှိပါတယ်။ State တွေဖြစ်တဲ့ variable
တွေကို ရေးနိုင်ပါတယ်။ behaviour ဖြစ်တဲ့ methods တွေကို လည်း ရေးနိုင်ပါတယ်။

```java
class Student {
    // State
    String name;
    int age;

    // behaviour
    void greet() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
```

ဒီအဆင့်မှာဆိုရင် Student ဆိုတဲ့ class တစ်ခုကို ဆောက်လိုက်ပါတယ်။ အဲ့ class ကနေမှာ object တစ်ခုကို
တည်ဆောက်ဖို့လိုအပ်ပါတယ်။
class တစ်ခုကနေ object တည်ဆောက်တဲ့ အခါမှာ new ဆိုတဲ့ keyword ကိုသုံးပြီးတော့ တည်ဆောက်ရပါတယ်။
ထို့ကြောင့်

```java
public class Person {
    public static void main(String[] args) {
        Student aung = new Student();
    }
}
```

ဒီအဆင့်မှာဆိုရင်တော့ aung ဆိုတဲ့ Student object တစ်ခုကို တည်ဆောက်လို့ပြီးသွားပြီပဲဖြစ်ပါတယ်။ aung ရဲ့ အရှေ့မှာပါတဲ့
Student သည် object ရဲ့ အမျိုးအစားပဲဖြစ်ပါတယ်။ aung ဆိုတဲ့ object
ထဲမှာရှိတဲ့ name နှင့် age ကို ပြောင်းခြင်ရင်တော့ ယခုလိုပြောင်းရပါတယ်။

```java
public class Person {
    public static void main(String[] args) {
        Student aung = new Student();
        aung.name = "Aung Aung";
        aung.age = 20;
    }
}
```

aung ဆိုတဲ့ Student object ထဲမှာရှိတဲ့ behaviour ကို ပြန်သုံးချင်ရင်တော့ `aung.greet()` ဆိုပြီးတော့ ယခုလိုသုံးရပါတယ်။

```java
public class Person {
    public static void main(String[] args) {
        Student aung = new Student();
        aung.name = "Aung Aung";
        aung.age = 20;

        aung.greet();
    }
}
```

Student class ထဲမှာရှိတဲ့ greet ဆိုတဲ့ behaviour (method) ကိုပြန်ခေါ်သုံးပေးရတာပဲဖြစ်ပါတယ်။

```bash
$ javac Person.java
$ java Person
```

result ကိုတော့ ယခုလိုပဲ မြင်တွေ့ရမှာဖြစ်ပါတယ်။

```text
My name is Aung Aung
My age is 20
```

object ထဲက state တွေကို ပြောင်းလိုက်မယ်ဆိုရင် ၎င်း object ရဲ့ behaviour တွေကလည်း ပြောင်းသွားဆိုတာကိုလည်း သိထားရပါမယ်။
class တစ်ခုကနေ object တစ်ခုကို ဘယ်နှစ်ခုဆောက်လို့ရသလဲ
ဆိုရင်တော့ new keyword ခေါ်လိုက်တိုင်း ပြန်ဆောက်လို့ရပါတယ်။

```java
public class Person {
    public static void main(String[] args) {
        Student aung = new Student();
        aung.name = "Aung Aung";
        aung.age = 20;

        Student maung = new Student();
        maung.name = "Maung Maung";
        maung.age = 25;

        maung.greet();
        aung.greet();
    }
}

class Student {
    String name;
    int age;

    void greet() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
```

java file တွေကို တစ်ခါပြောင်းပြီးလို့ result ကြည့်ချင်တိုင်းမှာ တစ်ကြိမ်ထပ်ပြီးတော့ compile လုပ်ပေးရပါတယ်။

```bash
$ javac Person.java
$ java Person
```

result ကိုတော့ ယခုလိုမြင်တွေ့ရမှာပဲ ဖြစ်ပါတယ်။

```text
My name is Maung Maung
My age is 25
My name is Aung Aung
My age is 20
```

ဒီနေရာမှာဆိုရင် aung ဆိုတဲ့ object ကို အရင် create လုပ်တာဖြစ်ပေမယ့်လည်း maung ဆိုတဲ့ object ကဘာဖြစ်လို့
အရင်ထွက်လာရတာလဲဆိုရင်တော့ `maung.greet()` ဖြစ်တဲ့ maung ရဲ့ method ကို အရင် သုံးထားလို့ပဲ ဖြစ်ပါတယ်။ ဒီ result
ကိုကြည့်မယ်ဆိုရင် maung နှင့် aung ရဲ့ object တွေဟာ သူတို့ရဲ့ state တွေပေါ်မှာ မူတည်ပြီးတော့ သူတို့ရဲ့
အလုပ်လုပ်ပုံတွေကလည်း မတူဘူးဆိုတာကို မြင်တွေ့ရမှာပဲ ဖြစ်ပါတယ်။