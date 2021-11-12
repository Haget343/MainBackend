package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transactions {

    @PrimaryKeyColumn(name= "league", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("league")
    private String league;

    @PrimaryKeyColumn(name= "year", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column("year")
    private String year;

    @PrimaryKeyColumn(name= "username", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @Column("username")
    private String username;

    @PrimaryKeyColumn(name= "timestamp", ordinal = 3, type = PrimaryKeyType.CLUSTERED)   //naming??
    @Column("timestamp")
    private String timestamp;

    @PrimaryKeyColumn(name= "symbol", ordinal = 4, type = PrimaryKeyType.CLUSTERED)
    @Column("symbol")
    private String symbol;

    private Integer single_value_at_trade;
    private Integer amount;
    private Integer total_value_at_trade;
    private String type_of_transaction;   //enum einbauen   (reicht hier "Kauf" und "Verkauf"?)
}
