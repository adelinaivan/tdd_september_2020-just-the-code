# 1. How to TDD?

## TDD Algorithm
1. Write a test
2. Run all the tests and confirm that the last one is failing
3. Write the implementation code
4. Run all the tests
5. Refactor
6. Rinse and repeat

## What are the benefits?
   - you don't have to write unit tests when you finish development
   - tests tend to be more relevant 
   - tests help you keep track of business rules 
   - you can refactor you code when you finish without being afraid of breaking something (important)
   - you write code that is easier to test, and that makes tests easier to maintain
   - if you write your unit tests simple enough, they document the behaviour of the code and the intent of the author (code + tests = documentation)

## TDD example 
Write an API endpoint that returns true or false depending on whether its input integer is a leap year or not.

A leap year is divisible by 4 but is not otherwise divisible by 100 unless it is also divisible by 400.

# 2. TDD DIY
## FizzBuzz 
Implement the FizzController logic. It should print the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

Sample output values:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
… etc up to 100

## Absolute value addition
Enhance our calculator API so that it adds the absolute value of two number. 

EG: Input 2, -3 => Output should be 5.
Absolute value examples: |2| = 2, |-3| = 3;

## Prime Factor
Write an API endpoint that takes an integer argument and returns a List<int>. 
That list contains the prime factors in numerical sequence.

For example:
- 100 should return 2, 2, 5, 5
- 2 should return 2
- Smaller than 2 should return an empty list