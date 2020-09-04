# 1. Bug Fixing DIY
## Rule number one
Add a test for every bug you have to fix to reproduce it, then fix it.

That way you ensure your fix won't be removed even if it's convoluted. :)
Also, if you are well covered by tests, you ensure you can refactor the code into something more readable.

## DIY Bug fixing 
If there is bug in the system. Our UI is sending the empty string (""") for the optional fields in some cases, and the server doesn't accept the value. 
The field being optional, we should accept the value too. 
The problem is in out DTO validation annotation. Replicate the bug and fix it. 

# 3. You can use tests to learn something
This can be either an external framework. 
Or it can be something about your application that you didn't know about.

# 4. Learning DIY
Our SuperComplexDto needs to have another string field. And it can have only have numeric characters (at least one) or be the string "SuperPreciseValueIExpect".
Use tests to find out what the regex could be. Either use Pattern and Matchers in a separate test, or use the @Pattern annotation in the SuperComplexDto.

