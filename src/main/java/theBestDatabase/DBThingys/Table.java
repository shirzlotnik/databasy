package theBestDatabase.DBThingys;

import javafx.collections.transformation.SortedList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import theBestDatabase.tableAbstraction.GetRecords;

import java.io.File;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Table {
    SortedMap<String, File> recordsByIndex;
    SortedList<File> recordsFiles;
    File indexesFile;
    GetRecords getRecords;

    public List<String> getIndexList () {
        return null;
    }

    public List<Record> getRecords () {
        return this.getRecords.get();
    }

    public LinkedHashMap<String, String> getColumnVales (String name) {
        LinkedHashMap<String, String> indexAndValue = new LinkedHashMap<>();
        return null;
    }

    public HashSet<String> potentialValues (String columnName) {
        return null;
    }
}
