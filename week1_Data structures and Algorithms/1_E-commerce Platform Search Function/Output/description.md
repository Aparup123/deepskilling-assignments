# E-commerce Platform Search Function

## Understand Asymptotic Notation:

### Big O notation: 
Big O is a mathematical expression to express the time and space complexity of an algorithm. It helps us analyze and compare algorithm by how much time it takes and how much memory it uses without depending on any physical hardware.

### Search algorithm best, average, and worst-case scenarios:
- **Best case:** If the target item is found in the first iteration of the algorithm. Helps us to find out how the algorithm performs in the best possible scenario.
- **Average Case:** The possibility of the target element to exist in the data structure is equally likely for every index. Helps us to find out how the algorithm performs on average.
- **Worst Case:** If the target item is not found in the data structure or is found at the last index. Helps us to find out how the algorithm performs in the worst possible scenario.

### Analysis of search algorithms:
#### Comparison table for search algorithms:

| Algorithm | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

#### Discussion
For my platform for faster search the binary search algorithm is suitable. But if all occurrences of the products containing the search term is to be retrieved, the linear search should be applied. 

