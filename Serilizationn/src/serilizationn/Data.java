/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilizationn;

import java.io.*;
/**
 public class Data implements Serializable
4 {
5      private String name;
6      private String surname;
7      private int age;
8 
 * @author zhr
 */
public class Data implements Serializable 
{
  private String name;
  private String surname; 
  private int age; 
    
  
  public Data(String a, String b, int c)
  {
   this.name=a;
   this.surname=b;
   this.age=c;
  }
  
  public String getName()
  {
   return this.name;
  }
  
  public String getSurname()
  {
   return this.surname;
  }
  
  public int getAge()
  {
   return this.age;
  }
  
}
