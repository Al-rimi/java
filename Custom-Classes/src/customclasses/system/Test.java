package customclasses.system;

public class Test {
    public static void main(String[] args) {
        CPU mycpu = new CPU();
        mycpu.setSpeed(2200);

        HardDisk myhd = new HardDisk();
        myhd.setCapacity(200);

        PC computer = new PC();
        computer.setCPU(mycpu);
        computer.setHardDisk(myhd);

        computer.show();
    }
}

