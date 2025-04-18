## Linear Search Algorithm

### Summary
Linear search (or sequential search) scans each element of an array one by one until it finds the target value or reaches the end.  
- **Best case**: O(1) (target at first position)  
- **Average case**: O(n/2) → O(n)  
- **Worst case**: O(n) (target at last position or not present)  
- **Space**: O(1)  

---

### Close‑to‑English Description
1. **Inputs**  
   - An array `A` of length _n_.  
   - A target value `X`.  
2. **Initialize** an index counter `i = 0`.  
3. **Loop** while `i < n`  
   1. Compare `A[i]` with `X`.  
   2. If they are equal, **stop** and **return** “found at index `i`.”  
   3. Otherwise, increment `i` by 1 and **continue**.  
4. If you finish the loop without finding `X`, **return** “not found.”

---

### Pseudocode Procedure
```plaintext
PROCEDURE LinearSearch(A, X):
  // A: array of length n
  // X: target value
  FOR i FROM 0 TO n − 1 DO
    IF A[i] == X THEN
      RETURN i      // Found at index i
    END IF
  END FOR
  RETURN −1         // Not found
END PROCEDURE
