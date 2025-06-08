Sure! Let's go through your Java program **line by line**, explaining each part clearly:

---

### \`\`\`java

public class program\_all\_bitwise {

````
This defines a **public class** named `program_all_bitwise`. Every Java application must have at least one class, and the class name usually matches the filename.

---

### ```java
    public static void main(String[] args) {
````

This is the **main method**, which is the entry point of any Java program. The program starts executing from here.

---

### \`\`\`java

```
    int a = 5;  // binary: 0101
    int b = 3;  // binary: 0011
```

````
You declare two integer variables:
- `a = 5` (Binary: `0101`)
- `b = 3` (Binary: `0011`)

These values are used for all the bitwise operations.

---

### ```java
        System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")\n");
````

This prints the decimal and binary form of `a` and `b`.

* `Integer.toBinaryString(x)` converts the number `x` to a binary string.
* The newline `\n` separates the input display from the result output.

---

### \`\`\`java

```
    // Bitwise AND
    int andResult = a & b;
    System.out.println("a & b = " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");
```

```
Performs a **bitwise AND** (`&`):
```

0101 (5)
& 0011 (3)
\= 0001 (1)

````
So, `andResult` is `1`.

---

### ```java
        // Bitwise OR
        int orResult = a | b;
        System.out.println("a | b = " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");
````

Performs a **bitwise OR** (`|`):

```
  0101 (5)
| 0011 (3)
= 0111 (7)
```

So, `orResult` is `7`.

---

### \`\`\`java

```
    // Bitwise XOR
    int xorResult = a ^ b;
    System.out.println("a ^ b = " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");
```

```
Performs a **bitwise XOR** (`^`):
```

0101 (5)
^ 0011 (3)
\= 0110 (6)

````
So, `xorResult` is `6`.

---

### ```java
        // Bitwise Complement (NOT)
        int complementResult = ~a;
        System.out.println("~a = " + complementResult + " (Binary: " + Integer.toBinaryString(complementResult) + ")");
````

Performs a **bitwise NOT** (`~`) on `a`:

* Inverts all bits of `a`. For `a = 5`, the result is:

  ```
  ~0101 (5) = 1010 (but in 32-bit two's complement it becomes -6)
  ```

So, `complementResult` is `-6`.

---

### \`\`\`java

```
    // Left Shift
    int leftShift = a << 1;
    System.out.println("a << 1 = " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");
```

```
**Left shift** shifts bits to the left by 1:
```

0101 (5)
<< 1
\= 1010 (10)

````
So, `leftShift` is `10`.

---

### ```java
        // Right Shift (signed)
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");
````

**Right shift** shifts bits to the right by 1, keeping the sign:

```
  0101 (5)
>> 1
= 0010 (2)
```

So, `rightShift` is `2`.

---

### \`\`\`java

```
    // Unsigned Right Shift
    int unsignedRightShift = a >>> 1;
    System.out.println("a >>> 1 = " + unsignedRightShift + " (Binary: " + Integer.toBinaryString(unsignedRightShift) + ")");
```

```
**Unsigned right shift** (`>>>`) also shifts bits right, but fills the left with 0 (even for negative numbers). Since `a = 5` is positive, the result is the same as `>>`:
```

0101 (5)

> > > 1
> > > \= 0010 (2)

```
So, `unsignedRightShift` is `2`.

---

### Summary of Bitwise Operators Demonstrated:
| Operator | Description             |
|----------|-------------------------|
| `&`      | AND                     |
| `|`      | OR                      |
| `^`      | XOR                     |
| `~`      | NOT (complement)        |
| `<<`     | Left shift              |
| `>>`     | Signed right shift      |
| `>>>`    | Unsigned right shift    |

Let me know if you want a visual representation (bit-by-bit) or flowchart of any operation!
```
