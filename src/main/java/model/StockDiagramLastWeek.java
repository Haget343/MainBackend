package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("stock_diagram_last_week")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDiagramLastWeek {
    @PrimaryKeyColumn(name= "symbol", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("symbol")
    private String symbol;

    @PrimaryKeyColumn(name= "quarter_hour", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @Column("quarter_hour")
    private Timestamp quarter_hour;

    private Integer value;
}
