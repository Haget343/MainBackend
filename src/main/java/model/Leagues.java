package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Time;
import java.sql.Timestamp;

@Table("leagues")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leagues {

    @PrimaryKeyColumn(name= "league", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("league")
    private int league;

    private Integer leaguecode;
    private Integer stock_amount;
    private Integer start_budget;
    private Integer transaction_costs;
    private Time update_stock_intervall;
    private Integer stock_tech_probability;               //ab hier: klären welche Ligaeinstellungsmöglichketiten angeboten werden sollen
    private Integer stock_industry_probability;
    private Integer crypto_probability;
    private Integer etf_probability;

}
