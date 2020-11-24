/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brh
 */
public class testDinamikDizi 
{
    public static void main(String[] args) 
    {
        DinamikDizi d=new DinamikDizi();
        d.ekle(5);
        d.ekle(6);
        d.ekle(8);
        d.ekle(7);
        d.ekle(-6);
        d.ekle(3);
            
        for (int i = 0; i <d.uzunluk() ; i++) 
        {
            System.out.println("veri = " +d.getDizi()[i]);
        }
    }
 
    
    
    
}
