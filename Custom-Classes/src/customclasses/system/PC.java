package customclasses.system;

public class PC {
    private CPU cpu;
    private HardDisk hardDisk;

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void show() {
        System.out.println("CPU Speed: " + cpu.getSpeed() + " MHz");
        System.out.println("Hard Disk Capacity: " + hardDisk.getCapacity() + " GB");
    }
}
