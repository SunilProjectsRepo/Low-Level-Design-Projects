# I - Interface Segmentation Principle

## Interface should be such, that client should not implement unnecessary functions they do not need.

Let's say I have RestaurantEmployee interface which has 3 methods:
- washDishes 
- serveCustomers
- cookFood

Now I have a Waiter class which implements RestaurantEmployee interface.
- It has to implement all the 3 methods of RestaurantEmployee interface
- But only job of Waiter is to serveCustomers, not washDishes and cookFood

Here, we are breaking the Principle.

## Better way to do it - Break the interface into very small so that client doesn't need to implement unnecessary functions.
I created 3 interfaces:
- WaiterInterface - two methods - serveCustomers and takeOrder
- ChefInterface - two methods - cookFood and decideMenu
- HelperInterface - one method - washDishes

Now, we have NewWaiter class which implements WaiterInterface - 2 methods - serveCustomers and takeOrder.
Client is implementing only the methods that is needed by class.




