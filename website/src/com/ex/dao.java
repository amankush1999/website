package com.ex;

public interface dao 
{
   public boolean signup (user u);
   public boolean login (user u1);
   public boolean update (user u2);
   public boolean delete (String email, String password);
}
