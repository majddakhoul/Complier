package Classes;

import java.util.List;

public class ImportStmt {
    String fromModule;

    List<importItem> importItems;

    boolean isFromImport;

    public String getFromModule() {
        return fromModule;
    }

    public void setFromModule(String fromModule) {
        this.fromModule = fromModule;
    }

    public List<importItem> getImportItems() {
        return importItems;
    }

    public void setImportItems(List<importItem> importItems) {
        this.importItems = importItems;
    }

    public boolean isFromImport() {
        return isFromImport;
    }

    public void setFromImport(boolean fromImport) {
        isFromImport = fromImport;
    }

    @Override
    public String toString() {
        return "ImportStmt{" +
                "fromModule='" + fromModule + '\'' +
                ", importItems=" + importItems +
                ", isFromImport=" + isFromImport +
                '}';
    }
}
