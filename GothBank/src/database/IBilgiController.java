
package database;

import database.transactions.HesapBilgileri;


public interface IBilgiController {
    
    public boolean bilgilerGecerliMi();
    
    public HesapBilgileri getHesapBilgileri();
    
}
