MVC or Model View and Controller. It is a design pattern that separates the business logic, presentation logic and data.
The Model contains only the pure application data and does all the operations on the data required.
The View presents the model’s data to the user. The view knows how to access the model’s data but does not how what the data means or how was it calculated.

The Controller exists between the view and the model. It listens to events triggered by the view (or another external source) and executes the appropriate reaction to these events. In most cases, the reaction is to call a method on the model. Since the view and the model are connected through a notification mechanism, the result of this action is then automatically reflected in the view.
