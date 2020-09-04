# Some clarifications about TDD:
- TDD is neither about "Testing" nor about "Design".
- TDD does not mean "write some of the tests, then build a system that passes the tests.
- TDD does not mean "do lots of Testing."
- TDD approach is primarily a specification technique. It ensures that your source code is thoroughly tested at confirmatory level.
- With traditional testing, a successful test finds one or more defects. It is same as TDD. When a test fails, you have made progress because you know that you need to resolve the problem.
TDD ensures that your system actually meets requirements defined for it. It helps to build your confidence about your system.
- You should "test with a purpose". You should know why you are testing something and what level its need to be tested.

# 1. If It's Not Testable, It's Not Designed Well
Writing the tests first and focusing on making readable unit tests will make your code more testable.

The easiest to test methods are the ones that can be tested as a black box, meaning they focus on input and output.

The most common things that make code less testable:
- void methods that have side effects - every method should have an output
- usage of statics - because you can't ensure the isolation of the unit
- creating new instances inside methods, instead of using factories

# 2. Logic branches coverage and Single responsibility 
If you don't add a test for each else of every if you can't ensure it won't be deleted.

If your logic is complex, you might want to delegate it. 

If you write tests for each logic branch you document the behaviour of the class.

# 3. Logic branches DIY
Your task is to process a sequence of integer numbers to determine the following statistics:

- minimum value
- maximum value
- number of elements in the sequence
- average value

For example: [6, 9, 15, -2, 92, 11]

- minimum value = -2
- maximum value = 92
- number of elements in the sequence = 6
- average value = 21.833333

# 4. Intervals and coverage
f(a,b) = a + b requires at least 2 tests because you need to prove both parameters are take into account.

# 5. Validation DIY
There is a bug in our code. The DtoValidationExampleController does not accept SuperComplexDtos with optionalText "Q6KklkVgLRYPYB8gBDP0OYEEQcojRdTDVgotgs09MW1c0O1bzrc07RRym9rdYzxtoIhkPsN2ilcecTee2qfblNxTUqSIT0gIySMevc7FxjMFTn7xkAb4QLvwNtq53875ttaBojES2YvCIARpPq6K0oDIwUf0zQFiT2VZixUUSUUtgdYiB1wu0Htm04H8DurXtizCihFQX2YM7p1qhHKoMscj8YBlaI52cz4WTUOzFU3IGj1qBlqmFpiJfLb2f5Kf
". But our business rules say that the maximum supported length for that should be 2000.
