package Classes;

public class importItem {
    String importItemName;

    public String getImportItemName() {
        return importItemName;
    }

    public void setImportItemName(String importItemName) {
        this.importItemName = importItemName;
    }

    @Override
    public String toString() {
        return "importItem{" +
                "importItemName='" + importItemName + '\'' +
                '}';
    }
}
