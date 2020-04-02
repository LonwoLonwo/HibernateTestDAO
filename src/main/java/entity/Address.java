package entity;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "ADRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "POST_CODE", length = 15)
    private String postCode;

    public Address(){

    }

}
