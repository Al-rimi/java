# StopWatch Class

This program implements a `StopWatch` class to measure elapsed time for a sorting operation. The class provides methods to start, stop, and get elapsed time.

## Class Details

- **Fields**: `startTime`, `endTime`
- **Methods**: 
  - `start()`: Resets `startTime`.
  - `stop()`: Sets `endTime`.
  - `getElapsedTime()`: Returns elapsed time in milliseconds.

## Usage

```java
StopWatch stopWatch = new StopWatch();
int[] numbers = new int[1000000];
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = (int)(Math.random() * 1000000);
}
stopWatch.start();
Arrays.sort(numbers);
stopWatch.stop();
System.out.printf("Elapsed time for sorting %,d elements: %.3f seconds", 
    numbers.length, stopWatch.getElapsedTime() / 1000.0);
```

## Sample Output

```
Elapsed time for sorting 1,000,000 elements: 0.347 seconds
```

---

For any questions or issues, refer to the main repository: [Java Projects Repository](https://github.com/Al-rimi/java).
