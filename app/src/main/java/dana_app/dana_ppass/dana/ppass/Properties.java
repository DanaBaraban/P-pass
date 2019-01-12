package dana_app.dana_ppass.dana.ppass;

public class Properties {

    private boolean disabledToilet;
    private boolean changingTable;
    private boolean unisexToilet;
    private int numOfCells;

    public Properties(boolean disabledToilet, boolean changingTable, boolean unisexToilet, int numOfCells) {
        this.disabledToilet = disabledToilet;
        this.changingTable = changingTable;
        this.unisexToilet = unisexToilet;
        this.numOfCells = numOfCells;
    }

    public Properties() {
    }

    public boolean isDisabledToilet() {
        return disabledToilet;
    }

    public void setDisabledToilet(boolean disabledToilet) {
        this.disabledToilet = disabledToilet;
    }

    public boolean isChangingTable() {
        return changingTable;
    }

    public void setChangingTable(boolean changingTable) {
        this.changingTable = changingTable;
    }

    public boolean isUnisexToilet() {
        return unisexToilet;
    }

    public void setUnisexToilet(boolean unisexToilet) {
        this.unisexToilet = unisexToilet;
    }

    public int getNumOfCells() {
        return numOfCells;
    }

    public void setNumOfCells(int numOfCells) {
        this.numOfCells = numOfCells;
    }
}
