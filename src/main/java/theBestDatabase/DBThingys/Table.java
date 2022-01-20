package theBestDatabase.DBThingys;

import javafx.collections.transformation.SortedList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.reflect.generics.tree.Tree;

import javax.swing.*;
import java.io.File;
import java.util.SortedMap;
import java.util.TreeMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Table {
    SortedMap<String, File> recordsByIndex;
    SortedList<File> recordsFiles;
    File indexesFile;
}
