#Java Standards for CVCGames

##Formatting
* 4 Spaces, no tabs
* Space before brace
    * `while (true) {`
* Place braces in-line
    * `public void setValue(int value) {`
    * `} else {`
* Place end brace on it's own line
    *       if (x == 4) {
                return;
            }
* Space before parenthesis in conditionals
    * `if (condition) {`
* Space before and after equals
    * `int x = 4;`
* Space after comma
    * `int[] x = {1, 2, 3};`
* Comments pre line
    *       //Loop through half the array's length since sqrt must be less than 1/2 
            for(int i = 0; i < arr.length / 2; i++)
* Add lines between methods
    *       public int getX() { return x; }
            
            public int getY() { return y; }
##Code
* No spaghetti code
* Use methods where duplicate code exists
* Comment code to explain, do not comment everything
    * Don't do this:
    
          //Set x to 4
          int x = 4;
* Use lowest scope possible