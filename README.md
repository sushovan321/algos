# algos
Binary Search Algorithm:
The main idea of binary search is to keep track of the current range of reasonable guesses.
For eg: If you have to identify a number(lets take:8) between 1-50.If we want to break our guessing game into multiple reasonable steps:
1.Let's say the first no guessed is 25.
2.So the no is on higher side.
3.Then we can eliminate 25-50 from our guessing range.
4.So the new search range is 1-24.
5.Now If you guess the no as 12.
6.Then the no is on the higher side.
7.Then we can eliminate 12-24 from our guessing range.
8.So the new search range is 1-11
9.Now If you guess the no as 6
10.Then the no is on the lower side.
11.Then we can eliminate 1-6 from our guessing range.
12.The new search range is now 7-11
13.Now If you guess the no as 9
14.Then the no is on the higher side.
15.Then we can eliminate 9-11 from our guessing range.
16.The new search range is now 7-9
17.So the guessed item is now 8 which matches the no we are looking for.

So this can be put across as below:
Let min = 1 and max = n
Guess the average of max and min, rounded down so that it is an integer.
If you guessed the number, stop. You found it!
If the guess was too low, set min to be one larger than the guess.
If the guess was too high, set max to be one smaller than the guess.
Go back to step two.
So The pseudocode for binary search algorithm can be put as:
1. Let min = 0 and max=n-1
2.If max <min then stop.Target is not present in array.Return -1
3.Compute guess as the average of min and max, rounded to integer value
4.If array[guess] == target then stop.Return guess.
5.If array[guess] >target, the max= guess -1, return to step 2
6.If array[guess] < target, then min = guess+1, return to step 2.
