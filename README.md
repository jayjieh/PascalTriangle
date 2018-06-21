# Pascal's Triangle
Given an index k, return the kth row of the Pascal's triangle

### Example:
```sh
For example, when k = 3, the row is [1,3,3,1]
```

### Prerequisite
* Ensure you have Java 8 installed ,


#### To get the the kth row we do : 
* 1. Initialize the result
        ```sh
             ArrayList<Integer> result = new ArrayList<>();
        ```
* 2. Validate to ensure no kth value less than zero is given
        ```sh
           if (rowIndex < 0) {
                return result;
             }
        ```
* 3. We then add the next element
     ```sh
        result.add(1);
     ```
* 4. We then loop through against the number of rows to fnd the row listing the kth
   
        ```sh
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        ```


License
----

Owori Juma





