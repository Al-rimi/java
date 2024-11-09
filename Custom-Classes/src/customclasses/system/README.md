# PC System Simulation

This program simulates a PC system with classes representing a `CPU`, `HardDisk`, and `PC`. The `PC` class uses composition to combine a `CPU` and `HardDisk`.

## Class Details

- **CPU**: Holds `speed` (MHz)
- **HardDisk**: Holds `capacity` (GB)
- **PC**: 
  - `setCPU()`: Sets the `CPU` object.
  - `setHardDisk()`: Sets the `HardDisk` object.
  - `show()`: Displays `CPU` speed and `HardDisk` capacity.

## Usage

```java
CPU mycpu = new CPU();
mycpu.setSpeed(2200);

HardDisk myhd = new HardDisk();
myhd.setCapacity(200);

PC computer = new PC();
computer.setCPU(mycpu);
computer.setHardDisk(myhd);
computer.show();
```

## Sample Output

```
CPU Speed: 2200 MHz
Hard Disk Capacity: 200 GB
```

---

For any questions or issues, refer to the main repository: [Java Projects Repository](https://github.com/Al-rimi/java).
