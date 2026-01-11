# S - Single Responsibility Principle

## A class should have only 1 reason to change
- If calculatePrice logic changes, Invoice class need a change. This is one reason.
- If printInvoice logic changes, Invoice class need a change. This is 2nd reason.
- Similarly, SaveToDB logic changes, Invoice class need a change. This is 3rd reason.

There are 3 reason to change Invoice class.

Single Responsibility Principle says A class should have only 1 reason to change i.e., one Responsibility.

This class is not following Single Responsibility Principle.

To make it a Single Responsibility Principle, created a 3 class
- CalculateInvoice - for price calculation
- InvoiceDao - for saving info to DB
- InvoicePrinter - to print the invoice

Now, each class has Single Responsibility.

Advantages:
- Easy to maintain - if only calculationInvoice logic changes then only that class changes, it will not impact other classes
- Easy to understand
