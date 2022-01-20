package theBestDatabase.tableAbstraction;

import theBestDatabase.DBThingys.Record;
import theBestDatabase.interfaces.Get;

import java.util.List;

public abstract class GetRecords implements Get<Record> {
    @Override
    public List<Record> get() {
        return null;
    }
}
