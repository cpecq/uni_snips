#Pattern 2 - State Pattern:

"State os a behavioural design pattern that lets an object alter its behaviour when its intenal state changes. It appears as if the pbject has changed its class."
The State checking procedure that is modelled by this deisgn pattern was logically applicable to the codebase within the stage class of the game.


## Why did I choose this pattern?:

I chose this design pattern due to the straight forward application to the given code. The stage class within the game code held an enum that consisted of a different states, and used conditional and switch statements to control the different states and the outcomes of being in different states. This lead me to implement the pattern and split these conditionals into separate classes outlining the behavioural differences between states. This simplified the code, improving te readability of the stage class, making clear what the states are affecting and making a call to the state object without having to know what state it is in.




## Advantages over other patterns:

The state pattern is similar to the strategy pattern (same uml diagram is used for both), but we are encapsulating the different state behaviours within the state object for the state pattern, and delegating to these different objects as we would blocks of code within a conditional. This is different in practice to how I would use the strategy pattern in this context - defining subclasses of the that relate to the state which the game is in, which inherit behaviours from a joint parent class would not be as efficient or straightforward as the state pattern regardless of the similarities outlined.


## How does it improve the program?:

This pattern vastly improves the modularity of the code in the state section: adding states in this section has been simplified to implementing with minimal intervention to the standing code. This pattern follows the Single Responsibility Principle by organising each state in its own class.
