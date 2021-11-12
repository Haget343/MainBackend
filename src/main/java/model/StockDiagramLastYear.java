package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("stock_diagram_last_year")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDiagramLastYear {

    @PrimaryKeyColumn(name= "symbol", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("symbol")
    private String symbol;

    @PrimaryKeyColumn(name= "week", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @Column("week")
    private Timestamp week;

    private Integer sunday_close;
}
