package theBestDatabase.DBThingys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Record {
    List<Cell> cells;
    public static Object index;
}
