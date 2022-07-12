package com.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

  private String dogId;
  private String dogName;
  private String dogAge;
  private String dogSex;
  private String dogDescription;
  private double dogPrice;
  private String nowHas;

}
