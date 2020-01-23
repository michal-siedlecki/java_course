package com.siedlecki;

public class Menu {

    public double getPrice(String product){
        if (product.equals      ("white bread"))    {return 5;}
        else if (product.equals ("brown bread"))    {return 8;}
        else if (product.equals ("beef 100%"))      {return 18;}
        else if (product.equals ("beef 80%"))       {return 14;}
        else if (product.equals ("cheese"))         {return 8;}
        else if (product.equals ("tomato"))         {return 4;}
        else if (product.equals ("onion"))          {return 6;}
        else if (product.equals ("mango"))          {return 7;}
        else if (product.equals ("lettuce"))        {return 3;}
        else if (product.equals ("cucumber"))       {return 4;}
        else if (product.equals ("paprica"))        {return 5;}
        else if (product.equals("beacon"))          {return 8;}
        else if (product.equals("drink and chips")) {return 18;}

        else {return -1;}
    }

}
