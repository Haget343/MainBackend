package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("stocks_by_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StocksByUser {
    @PrimaryKeyColumn(name= "username", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("username")
    private String username;

    @PrimaryKeyColumn(name= "league", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column("league")
    private int league;

    @PrimaryKeyColumn(name= "symbol", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @Column("symbol")
    private int symbol;

    private Integer amount;
    private Timestamp time_last_updated;
}
