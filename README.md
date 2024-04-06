# TP 1  Corrections

Those are the corrections that were made to the errors committed in the given exercises


## Exo 1

The error in this code lies within the while loop. The variables i and j are incorrectly updated.

## Exo 2

The error in this code is in the for loop. The character count should go from 0 to the length of the shorter string (s1 or s2) in order to cover all characters in the string. Hence, we need to replace <= with < in the loop condition.

## Exo 3

The error in this code lies within the condition of the while loop. The condition low < high excludes the possibility of checking the element in the last array slot if low and high are equal.

## Exo 5

The error in this code lies within the comparison operator in the for loop, which should be < instead of <=. Otherwise, it would cause an ArrayIndexOutOfBoundsException.
