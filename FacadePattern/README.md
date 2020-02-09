It hides the complexities of the system and provides an interface to the client from where the client can access the system.

We explain this pattern using a very common example in our day to day lives, when we make a transaction in our bank account such as deposit some money,
the complexities of the system such as checking of the account number,checking of the security code etc remains hidden from us.We are just provided
with an interface from where we can access our account(deposit and withdraw the money).In the above example BankAccountFacade class acts as the facade as it hides
all the details of system.Whatever sum of money you want to withdraw or deposit you input it to the BankAccountFacade object and rest of the things are 
taken care of by that class.
