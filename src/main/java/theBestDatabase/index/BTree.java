package theBestDatabase.index;

import theBestDatabase.DBThingys.Cell;
import theBestDatabase.DBThingys.Record;
import theBestDatabase.DBThingys.Table;
import theBestDatabase.index.absraction.Index;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BTree extends Index {
    HashMap<Cell, Byte[]> bTree;

    public HashMap<Cell, Byte[]> makeIndex(Table table) {
        this.bTree = new HashMap<>();
        List<Record> records = table
    }
}
