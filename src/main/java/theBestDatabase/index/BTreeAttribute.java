package theBestDatabase.index;

import theBestDatabase.DBThingys.Cell;
import theBestDatabase.DBThingys.Record;
import theBestDatabase.DBThingys.Table;
import theBestDatabase.index.absraction.Index;

import java.util.*;

public class BTreeAttribute extends Index {
    HashMap<String, Byte[]> bTree;
    String columnName;

    private Byte[] getBytes (LinkedHashMap<String, String> indexAndValue, String value) {
        Byte[] bytes = new Byte[indexAndValue.size()];
        return null;
    }

    public HashMap<Cell, Byte[]> makeIndex(Table table) {
        this.bTree = new HashMap<>();
        LinkedHashMap<String, String> indexAndValue = table.getColumnVales(this.columnName);
        List<String> indexes = table.getIndexList();
        HashSet<String> potentialValues = table.potentialValues(this.columnName);
        for (String value: potentialValues) {
            this.bTree.put(value, new Byte[indexes.size()]);
        }

        return null;
    }
}
