
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brh
 */
public class DinamikDizi implements Iterable<Integer> 
{
   private int[] dizi=null;
   private int kapasite=5;
   private int uzunluk=0;

    public DinamikDizi ()
            {
            dizi=new int[kapasite];
            }
            
    public DinamikDizi(int kap)
            {
             kapasite=kap;
              dizi=new int[kapasite];  
            }
    
     public void put(int i)
    {
    kapasiteKontrol(uzunluk+1);
    dizi[uzunluk++]=i;
    }
    private void kapasiteKontrol(int minKapasite)
    {
      int mevKapasite=getSize(); 
        if (minKapasite>mevKapasite) 
            {
            int yeniKapasite=mevKapasite*2;
            dizi=Arrays.copyOf(dizi, yeniKapasite);
            }
    }
    
    private void kapasiteKontrolE(int kapasite)
    {
      int mevKapasite=getSize(); 
        if (kapasite>=2*mevKapasite) 
            {
            int yeniKapasite=mevKapasite/2;
            dizi=Arrays.copyOf(dizi, yeniKapasite);
            }
    }
    
    
     public void ekle(int veri)
            {
            ArrayList<Integer> dizi=new ArrayList<Integer>();
            dizi.add(veri);  
            kapasiteKontrol();
            }
     
      public void ekle(int veri,int index)
            {
            ArrayList<Integer> dizi=new ArrayList<Integer>();
            dizi.add(index,veri);
            kapasiteKontrol();
            }
      public void sil(int veri)
            {
            ArrayList<Integer> dizi=new ArrayList<Integer>();
            dizi.remove(veri);
            kapasiteKontrolE();
            }  
      public void silIndex(int index)
            {
            ArrayList<Integer> dizi=new ArrayList<Integer>();
            dizi.remove(index);
            kapasiteKontrolE();
            } 
      public int kapasite()
            {
            return kapasite;
            }
      public int uzunluk()
            {
            return uzunluk;
            }
        public int[] getDizi() {
        return dizi;
    }
    @Override
    public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
        int index=0;   
        @Override
        public boolean hasNext() {
        return index<uzunluk;
        }
        @Override
        public Integer next() {
           return dizi[index++]; 
        }
    };
    }
    private int getSize() {
      return dizi.length;  
    }

    private void kapasiteKontrol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void kapasiteKontrolE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
