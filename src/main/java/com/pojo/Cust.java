package com.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cust {
  private String id;
  private String dogId;
  private String custName;
  private String custNum;
  private String custAddress;
  private double custPrice;
  private long nowHas;


}
