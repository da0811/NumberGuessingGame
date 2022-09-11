# NumberGuessingGame
Coding with John


Create a "Number Guessing Game" in Java. 

Begin by creating a random number between 1 and 100. Since we haven't used random numbers yet, here's how you can create an int variable and give it a random value between 1 and 100:

Random rand = new Random();
int randomNumber = rand.nextInt(100) + 1;
You'll need to import the Random class to use this, so put this at the top of your file too:

import java.util.Random;
The user's goal is to guess the number. So your program will have to accept a number from the user using the Scanner class. After they enter their number, it should:

- If the user guessed the right number - Tell them they guessed correctly and won! The program should end.

- If the user's guess was too low - Tell them the random number is higher, and let them guess again.

- If the user's guess was too high - Tell them the random number is lower, and let them guess again.

Continue to let the user guess until they guess correctly, and end the game.

They should be able to get it right eventually with the "higher"/"lower" hints of course. 

Try to build this whole project on your own. Even if you get a little frustrated wit)h getting a little bit working, try and work through it with a little bit of Googling and a good bit of trial and error. You'll will come out of it a better programmer if you do.

If you ABSOLUTELY need it, here is the full source of an example implementation: https://www.codepile.net/pile/a7NOZqPg

If yours doesn't look exactly like this, but still works? Awesome. Over time your code style will change - I know mine has. But there are tons of ways to do just about about everything in Java. Be proud of yours.

(You may have also seen my YouTube video on this program. You can check it out here for a step-by-step walkthrough if needed: https://youtu.be/j_ax_yT7KW0 )
