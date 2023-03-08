# CPSC1150-Assignment7
Practicing with Arrays and abstraction - Completed Oct 2022

Using Scanner, the program prompts the user to enter in a score from 0-100. To end the program, the user must enter in a negative score. Any scores above 100 return an error message and are ignored while the program prompts for the next score. Using an int Array, a tally of each range of scores is kept, from 0-9, 10-19, .... up to 90-100. The prompts for scores are in a do-while loop, with a boolean flag that is set to false when the user enters a negative score.

Using a switch statement, the program takes the score entered and divides it by 10. The result is the range/index of the array to be incremented eg. if 43 was entered, the program divides it by 10 (40/10 = 4) and increments array[4]. 

One problem I encountered was if the score entered was 100. For that scenario, I created one more case in the switch statement - case(10). This just increments array [9], since it would belong to that range of 90-100 anyway.
