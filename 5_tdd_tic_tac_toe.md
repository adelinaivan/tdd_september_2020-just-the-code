# Developing Tic-Tac-Toe
Business rules: 
- I want to play tic tac toe with Postman 
- I want an endpoint to which I submit a move as he x player 
- I want an endpoint to which I submit a move as the o player 
- after a player submits a move the position is considered not empty anymore
- The body for each move submit should be a json with the coordinates {x: 2, y: 1}
- Our players are programmers, so the board positions are 0 to 2
- When I submit a move I should get an error if my move is outside the board 
- When I submit a move I should get an error if I try to do a move on a position that isn't empty
- When I submit a move I and it's not my turn I should get a message stating the player who's turn it is
- After I submit a move I should get a message if the game is over (if a player linked 3 or it's a draw)

Bonus round:
- I want the board to tell me the state of the board after each move (it would be nice if we could pretty print it)