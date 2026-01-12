# O - Open/Closed Principle

## Open for Extension but Closed for Modification

Let's say InvoiceDao class is in live

* InvoiceDao - for saving info to DB

Now, I got a requirement to save info into File as well.

* We can extend this InvoiceDao class for adding requirement, if needed. But we cannot modify it.
* As this is already testable classes and is LIVE.
* We solved this by creating InvoiceDaoInFile class

## Better way to do it (instead of using InvoiceDao class, InvoiceDaoInFile class)

* Create InvDao interface with save method
* Create two classes DatabaseInvDao and FileInvDao that implements this interface save() method.
