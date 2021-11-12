package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("stocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stocks {

    @PrimaryKeyColumn(name= "stocks", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("stocks")
    private String stocks;

    private Timestamp last_updated;
    private Integer current_value;
    private Integer bid_value;
    private Integer ask_value;
    private Integer day_open;
    private Integer day_high;
    private Integer day_low;
    private Integer last_day_close;
    private String sector;
    private String type;
    private Integer volume;
    private Integer view_counter_weekly;
}
