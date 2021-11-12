package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("markets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Markets {

    @PrimaryKeyColumn(name= "league", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("league")
    private int league;

    @PrimaryKeyColumn(name= "symbol", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @Column("symbol")
    private String symbol;

    private Integer current_value;
    private Timestamp date_entered;
    private Timestamp date_left;         //Anpassung abgleichen
    private Boolean joker_active;
}
