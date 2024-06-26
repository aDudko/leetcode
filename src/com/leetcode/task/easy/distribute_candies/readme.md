<h2>Distribute Candies</h2>


<p>Alice has <code>n</code> candies, where the <code>i<sup>th</sup></code> candy is of type <code>candyType[i]</code>.
Alice noticed that she started to gain weight, so she visited a doctor.</p>

<p>The doctor advised Alice to only eat <code>n / 2</code> of the candies she has (<code>n</code> is always even).
Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still
following the doctor's advice.</p>

<p>Given the integer array <code>candyType</code> of length <code>n</code>, return <i>the <b>maximum</b> number of
different types of candies she can eat if she only eats <code>n / 2</code> of them</i>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>candyType = [1, 1, 2, 2, 3, 3]</code></p>
<p><b>Output:</b> <code>3</code></p>
<p><b>Explanation:</b> <code>Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of
each type.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>candyType = [1, 1, 2, 3]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> <code>Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she
still can only eat 2 different types.</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>candyType = [6, 6, 6, 6]</code></p>
<p><b>Output:</b> <code>1</code></p>
<p><b>Explanation:</b> <code>Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>n == candyType.length</code></li>
    <li><code>2 <= n <= 10<sup>4</sup></code></li>
    <li><code>n</code> is even.</li>
    <li><code>-10<sup>5</sup> <= candyType[i] <= 10<sup>5</sup></code></li>
</ul>