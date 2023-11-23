

/**
 * Notebook
 */
public class Notebook {
    int amountOfRAM;
    int sizeOfHardDrive;
    String operatingSysytem;
    int monitorDiagonal;

    public Notebook(int amountOfRAM, int sizeOfHardDrive, String operatingSysytem, int monitorDiagonal){
        this.amountOfRAM = amountOfRAM;
        this.sizeOfHardDrive = sizeOfHardDrive;
        this.operatingSysytem = operatingSysytem;
        this.monitorDiagonal = monitorDiagonal;
    }

    @Override
    public String toString() {
        return "Обьем оперативки -> " + amountOfRAM +"\n"
            + "Обьем жесткого диска -> " + sizeOfHardDrive +"\n"
            + "Операционная система -> " + operatingSysytem +"\n"
            + "Диагональ монитора ->" + monitorDiagonal + "\n";
    }    

    @Override
    public boolean equals(Object obj) {
        Notebook nb = (Notebook) obj;
        return amountOfRAM == nb.amountOfRAM && sizeOfHardDrive == nb.sizeOfHardDrive 
            && operatingSysytem.equals(nb.operatingSysytem) && monitorDiagonal == nb.monitorDiagonal;
    }
}