package theBestDatabase.DBThingys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.ldap.SortKey;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Record {
    List<Cell> cells;
    SortKey key;
}
