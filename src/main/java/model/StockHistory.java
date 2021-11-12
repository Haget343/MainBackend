package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("stock_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockHistory {
    @PrimaryKeyColumn(name= "symbol", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("symbol")
    private String symbol;

    @PrimaryKeyColumn(name= "day", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @Column("day")
    private Timestamp day;

    private Integer day_close;
}
