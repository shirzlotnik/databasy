package theBestDatabase.DBThingys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Table {
    TreeMap<Cell, Record> recordsSorted;
}
