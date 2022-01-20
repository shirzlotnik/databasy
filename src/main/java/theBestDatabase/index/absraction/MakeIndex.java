package theBestDatabase.index.absraction;

import theBestDatabase.DBThingys.Cell;

import java.util.HashMap;
import java.util.HashSet;

public interface MakeIndex {
    public HashMap<Cell, Byte[]> makeIndex (HashSet<Cell> cellValues);
}
