# 🧩 LeetCode Solutions: Complexity Analysis

## 🟢 Easy Problems


| Problem | Language | Time | Space | Approach |
| :--- | :--- | :--- | :--- | :--- |
| Two Sum | C | O(n) | O(n) | Hash Map (One-pass) |
| Add Binary | Java | O(max(N, M)) | O(max(N, M)) | Bit-by-bit addition with carry |
| Add Digits | Java | O(1) | O(1) | Digital Root (Mathematical formula) |
| Best Time to Buy/Sell Stock | Java | O(n) | O(1) | One-pass (Min price tracking) |
| Binary Tree Inorder | Java | O(n) | O(h) | DFS (Recursive) |
| Binary Tree Postorder | Java | O(n) | O(h) | DFS (Recursive) |
| Binary Tree Preorder | Java | O(n) | O(h) | DFS (Recursive) |
| Climbing Stairs | Java | O(n) | O(1) | Fibonacci / DP (Space optimized) |
| Sorted Array to BST | Java | O(n) | O(log n) | Binary Search / Recursive construction |
| Count Complete Tree Nodes | Java | O(n) | O(h) | DFS / Level Order Traversal |
| Counting Bits | Java | O(n) | O(n) | Dynamic Programming (P-pattern) |
| Find the Difference | Java | O(n) | O(1) | Bit Manipulation (XOR) |
| First Occurrence in String | Java | O(n * m) | O(1) | Sliding Window / Two-pointer |
| Happy Number | C | O(log n) | O(1) | Floyd’s Cycle-finding (Tortoise/Hare) |
| Implement Stack using Queues | Java | O(1) | O(n) | Two-Queue simulation |
| Intersection of Two Arrays | Java | O(n+m) | O(n) | HashSet / Two-pointer |
| Length of Last Word | Java | O(n) | O(1) | String trimming / Backward scan |
| Longest Common Prefix | Java | O(S) | O(1) | Horizontal scanning |
| Longest Palindrome | Java | O(n) | O(1) | Character frequency (Hash Table) |
| Majority Element | Java | O(n) | O(1) | Boyer-Moore Voting Algorithm |
| Merge Sorted Array | Java | O(n+m) | O(1) | Three-pointer (Backwards merge) |
| Merge Two Sorted Lists | Java | O(n+m) | O(1) | Iterative Pointer Manipulation |
| Min Depth of Binary Tree | Java | O(n) | O(h) | BFS / Level Order Traversal |
| Number of 1 Bits | C | O(1) | O(1) | Bit Manipulation (Kernighan’s) |
| Palindrome Linked List | Java | O(n) | O(1) | Reverse second half + Two-pointer |
| Palindrome Number | Java | O(log n) | O(1) | Reversing half of the integer |
| Power of Two | Java | O(1) | O(1) | Bitwise AND check: (n & n-1) |
| Remove Duplicates (Array) | Java | O(n) | O(1) | Two-pointer (In-place) |
| Remove Duplicates (List) | Java | O(n) | O(1) | Linear scan / Node skipping |
| Remove Element | Java | O(n) | O(1) | Two-pointer (In-place) |
| Remove Linked List Elements | Java | O(n) | O(1) | Sentinel (Dummy) node iteration |
| Reverse Bits | C | O(1) | O(1) | Bit shifting and masking |
| Reverse Linked List | Java | O(n) | O(1) | Iterative pointer reversal |
| Reverse String | Python | O(n) | O(1) | Two-pointer swap |
| Roman to Integer | Java | O(n) | O(1) | Left-to-right map-based scanning |
| Search Insert Position | Java | O(log n) | O(1) | Binary Search |
| Single Number | C | O(n) | O(1) | Bit Manipulation (XOR) |
| Sqrt(x) | Java | O(log n) | O(1) | Binary Search |
| Sum of Left Leaves | Java | O(n) | O(h) | DFS with flag check |
| Valid Anagram | Java | O(n) | O(1) | Frequency Array (Hash Table) |
| Valid Palindrome | Java | O(n) | O(1) | Two-pointer / String cleanup |
| Valid Parentheses | Java | O(n) | O(n) | Stack-based character matching |

## 🟡 Medium Problems


| Problem | Language | Time | Space | Approach |
| :--- | :--- | :--- | :--- | :--- |
| Add Two Numbers | Java | O(max(m,n)) | O(1) | Linked List traversal with carry |
| Best Time Buy Stock II | Java | O(n) | O(1) | Greedy (Sum of all uphill profits) |
| Count and Say | Java | O(2^n) | O(2^n) | Iterative string building |
| Edit Distance | Java | O(m * n) | O(m * n) | Dynamic Programming (2D table) |
| First/Last Pos in Array | Java | O(log n) | O(1) | Modified Binary Search (Twice) |
| Integer to Roman | Java | O(1) | O(1) | Greedy subtraction (Greedy Map) |
| Jump Game II | Java | O(n) | O(1) | Greedy (Max reach/Range jumping) |
| Linked List Cycle | Java | O(n) | O(1) | Floyd’s Cycle-finding (Two-pointer) |
| Longest Palindromic Substr | Java | O(n^2) | O(1) | Expand Around Center |
| Longest Substring... | Java | O(n) | O(min(m, n)) | Sliding Window with HashSet |
| Remove Nth Node... | Java | O(L) | O(1) | Two-pointer (Fast/Slow offset) |
| Reverse Integer | Java | O(log n) | O(1) | Digit extraction with overflow check |
| Rotate List | Java | O(n) | O(1) | Cycle formation + Head update |
| Search a 2D Matrix | Java | O(log(m * n)) | O(1) | Binary Search on flattened index |
| String to Integer (atoi) | Java | O(n) | O(1) | DFA / Character-by-character scan |
| Swap Nodes in Pairs | Java | O(n) | O(1) | Recursive/Iterative node swapping |
| Zigzag Conversion | Java | O(n) | O(n) | Row-wise string list building |

## 🔴 Hard Problems


| Problem | Language | Time | Space | Approach |
| :--- | :--- | :--- | :--- | :--- |
| Median of Two Arrays | Java | O(log(min(m,n))) | O(1) | Binary search on shorter partition |
| Regular Expression Match | Java | O(T * P) | O(T * P) | 2D Dynamic Programming |
| Merge k Sorted Lists | Java | O(N log k) | O(k) | Min-Priority Queue (Heap) |
| Substring Concatenation | Java | O(n * k) | O(n) | Sliding Window with Map count |
| First Missing Positive | Java | O(n) | O(1) | Cyclic Sort (In-place hashing) |
