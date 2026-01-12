# L - Liskov Substitution Principle

## If a class B is subtype of Class A, then we should be able to replace object of class A with class B, without breaking the behavior of the program.

### Subclass should extend the capability of parent class not narrow it down.

I have a Bike interface has two methods - turnOnEngine() and accelerate() method
I also have MotorCycle class that implements Bike two methods.
Here, Bike is parent class and Motorcycle is child class.

Let's say we have now Bicycle class implements Bike.
Now, cycle doesn't have engine. So, turnOnEngine() will throw exception - no engine.

Here, we have changed the behavior.

SubClass should extend the capability of Parent not narrow it down.


