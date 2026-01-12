# D - Dependency Inversion Principle

## Class should depend on interface rather than concrete classes
 
We have MacBook class that uses concrete classes - WiredKeyboard and WiredMouse in constructor.

Let's say in the future, if I want to enhance the MacBook class to implement BluetoothKeyboard and BluetoothMouse.
I can't do it here.

It is not following a Dependency Inversion Principle

## Better way to do it 

We have now newMacBook class that uses interface object of KeyBoard and Mouse.
KeyBoard interface - WiredKeyboard, BluetoothKeyboard
Mouse interface - WiredMouse, BluetoothMouse

And in constructor, we are passing Keyboard and Mouse interface object. 
Now, lets say as a client I pass WiredKeyBoard and WiredMouse, then in newMacBook i will get WiredKeyBoard and WiredMouse object.
Same for Bluetooth as well. Or any combination.
```java
public class NewMacBook {
    private final KeyBoard keyboard;
    private final Mouse mouse;

    public NewMacBook(KeyBoard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

```









