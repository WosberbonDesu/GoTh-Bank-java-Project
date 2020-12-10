
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ParaYatirma extends DbConnection implements IBilgiController{

    private int yatirilacakMiktar = 0;
    
    public boolean paraYatirildiMi() {
        if(bilgilerGecerliMi()) {
            String query = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye + '" + this.yatirilacakMiktar + "'"
                    + " WHERE kullanici_id = '" + getHesapBilgileri().getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() + this.yatirilacakMiktar);
            } catch (SQLException ex) {
                Logger.getLogger(ParaYatirma.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.yatirilacakMiktar == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getYatirilacakMiktar() {
        return yatirilacakMiktar;
    }

    public void setYatirilacakMiktar(int yatirilacakMiktar) {
        this.yatirilacakMiktar = yatirilacakMiktar;
    }
    
    
    
    
}
