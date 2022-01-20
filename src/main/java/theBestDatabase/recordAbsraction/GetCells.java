package theBestDatabase.recordAbsraction;

import theBestDatabase.DBThingys.Cell;
import theBestDatabase.DBThingys.Record;
import theBestDatabase.interfaces.Get;

import java.util.List;

public abstract class GetCells implements Get<Cell> {
    @Override
    public List<Cell> get() {
        return null;
    }
}
