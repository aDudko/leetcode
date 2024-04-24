<h2>Range Sum Query - Mutable</h2>


<p>Given an integer array <code>nums</code>, handle multiple queries of the following types:</p>
<ul>
    <li><b>Update</b> the value of an element in <code>nums</code>.</li>
    <li>Calculate the <b>sum</b> of the elements of <code>nums</code> between indices <code>left</code>
        and <code>right</code> <b>inclusive</b> where <code>left <= right</code>.</li>
</ul>

<p>Implement the NumArray class:</p>
<ul>
    <li><code>NumArray(int[] nums)</code> Initializes the object with the integer array <code>nums</code></li>
    <li><code>void update(int index, int val)</code> <b>Updates</b> the value of <code>nums[index]</code> to be <code>val</code></li>
    <li><code>int sumRange(int left, int right)</code> Returns the <b>sum</b> of the elements of <code>nums</code> 
        between indices <code>left</code> and <code>right</code> <b>inclusive</b> 
        (i.e. <code>nums[left] + nums[left + 1] + ... + nums[right]</code>)</li>
</ul>


<h3>Example 1:</h3>
<p><b>Input:</b> <code><br>
["NumArray", "sumRange", "update", "sumRange"]<br>
[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]</code></p>
<p><b>Output:</b> <code>[null, 9, null, 8]</code></p>
<p><b>Explanation:</b><code><br>
NumArray numArray = new NumArray([1, 3, 5]);<br>
numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9<br>
numArray.update(1, 2);   // nums = [1, 2, 5]<br>
numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 3 * 10<sup>4</sup></code></li>
    <li><code>-100 <= nums[i] <= 100</code></li>
    <li><code>0 <= index < nums.length</code></li>
    <li><code>-100 <= val <= 100</code></li>
    <li><code>0 <= left <= right < nums.length</code></li>
    <li>At most <code>3 * 10<sup>4</sup></code> calls will be made to <code>update</code> and <code>sumRange</code>.</li>
</ul>
