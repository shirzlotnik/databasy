package theBestDatabase.DBThingys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cell <T extends Object> {
    T attribute;
}
