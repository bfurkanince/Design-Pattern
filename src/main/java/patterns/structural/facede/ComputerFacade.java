package patterns.structural.facede;

public class ComputerFacade {

    CPU cpu ;
    HardDrive hardDrive;
    Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }

    public void startComputer(){
        cpu.execute();
        hardDrive.read();
        memory.load();
    }

}
