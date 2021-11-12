package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("user_by_league")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserByLeague {

    @PrimaryKeyColumn(name= "username", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    @Column("username")
    private String username;

    @PrimaryKeyColumn(name= "league", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("league")
    private int league;

    private Boolean admin;
    private Integer free_budget;
    private Integer value_portfolio;
    private Boolean joker1;
    private Boolean joker2;
    private Boolean joker3;
    private Timestamp last_login;
}
