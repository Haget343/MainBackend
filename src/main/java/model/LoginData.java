package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("login_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginData {

    @PrimaryKeyColumn(name= "username", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("username")
    private String username;

    @PrimaryKeyColumn(name= "uuid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column("uuid")
    private int uuid;

    private String email;
    private String league1;
    private String league2;
    private String league3;
    private String league4;
    private String league5;
    private String league6;
    private String league7;
    private int league_amount;

}


