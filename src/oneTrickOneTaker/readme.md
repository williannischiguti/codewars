<h1> One trick, one taker </h1>

Rules
YaCg is a trick-taking game ie a game in which series of rounds, called "tricks", are played. At the end of a "trick" the winner of the trick "takes" it (and becomes the "trick-taker").

A standard 52-card pack is used. The cards in each suit rank from highest to lowest: A K Q J 10 9 8 7 6 5 4 3 2.

(new) rule
The leader (==1st player) leads to the first trick. He may lead any card in his hand. Each other players must FOLLOW suit by playing a card of the suit led if he has one. A player with no card of the suit led may "discard" any card.

The trick is won by the highest card of the suit led.

Examples
["2H","8H","KD","KH"] // --> "KH" wins 'cause "H" is the suit led and "KH" is the highest of "H"
["2H","8C","JD","KS"] // --> "2H" wins 'cause "H" is the suit led and "2H" is the only "H"
Task
Code a function winnerOfTrick( cards, players ) which return the name of the "trick-taker" ie the one who wins the trick.

Input
cards is an array of card-codes of the form "RS" where :

"R" is the rank of the card ( one of A, K, Q, J, T (for 10), 9, 8, 7, 6, 5, 4, 3 or 2 )
"S" is the *suit * of the card (one of "H" (Hearts), "C" (Clubs), "D" (Diamonds) and "S" (Spades))
eg : [ "2H", "3H", "4C", "KD", "AS" ]

players is an array of yagc-fanatic yak-boys/girls.

eg : [ "ALgichh", "Bdobd", "Charmolg", "Dbrang", "Erming" ]

Output
a string of the form "Bdobd wins".
Examples:
winnerOfTrick( ["2D", "3D", "4S"],  ["GgbA", "mZoIs", "S'Lg"] ) // -> "mZoIs wins" ("3D" is the highest "D")
winnerOfTrick( ["2D", "3H", "4S"],  ["GgbA", "mZoIs", "S'Lg"] ) // -> "GgbA wins" ("2D" is the highest "D")