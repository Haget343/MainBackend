package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("portfolio_history_by_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioHistoryByUser {

    @PrimaryKeyColumn(name= "username", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @Column("username")
    private String username;

    @PrimaryKeyColumn(name= "league", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("league")
    private int league;

    @PrimaryKeyColumn(name= "day", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @Column("day")
    private String day;

    private Integer value_portfolio;
    private Integer free_budget;

}
