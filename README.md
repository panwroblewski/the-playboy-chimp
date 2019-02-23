# the-playboy-chimp
the playboy chimp impl
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1552

Once upon a time, there lived a chimpanzee
called Luchu Bandor (aka Playboy Chimp).
Luchu was unhappily married to Bunty Mona,
a short but cute little lady chimp. Luchu was
tall and handsome — he was feeling uncomfortable taking Bunty to public places along with
him. People would stare at them all the while.
At one point, Luchu could not stand it anymore
and he decided to do some justice to his name.
He started looking for a new hope in the Lady
Chimps’ High School. Every day Luchu would
climb up a bamboo tree and wait for the morning
drill to start. From there he could see each and
every lady chimp doing their routine drill. Now,
Luchu was looking for the tallest lady chimp that
would be shorter than he; he would also like to
consider someone a little taller than he. But
someone of his same height will never be on his
list. Every morning Luchu picks up a line of lady
chimps and finds the best two according to his
set criterion. His job has been made easy by the
fact that the lady chimps in each line are ordered
by their height, the shortest one is in the front
and the tallest one is at the back. Your task is
to help Luchu on one particular day to find two
lady chimps: the tallest one shorter than he and
the shortest one taller than he.
Input
There will be only one set of input for this problem. The first line of input gives you a number N (1 ≤ N ≤ 50000), the number of lady chimps on
the line. In the next line you would have N integers (in the range 1 to 231 − 1 giving the heights of
the N chimps. There would be a single space after every number. You can assume that the chimps
are ordered in non-decreasing order of their heights. In the next line you would have an integer Q
(1 ≤ Q ≤ 25000) giving the number of queries. Then in the next line Q queries will follow. Then you
would have Q numbers giving the height of Luchu! Dont worry, Luchu is from the land where people
can have 3 birthdates; Q heights for a chimpanzee will make no difference here. The Q numbers are
listed on a line and their range from 1 to 231 − 1, and as before you would find a single space after
every query number. The query numbers are not supposed to come in any particular order.
Output
For each query height, print two numbers in one line. The first one would be the height of the tallest
lady chimp that is shorter than Luchu, and the next number would be the height of the shortest lady
chimp that is taller than he. These two numbers are to be separated by a single space. Whenever it is
impossible to find any of these two heights, replace that height with an uppercase ‘X’.
Sample Input
4
1 4 5 7
4
4 6 8 10
Sample Output
1 5
5 7
7 X
7 X
