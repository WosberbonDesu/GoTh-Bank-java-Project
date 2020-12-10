
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ParaCekme extends DbConnection implements IBilgiController {

    private int cekilecekMiktar = 0;

    public boolean paraCekildiMi() {
        if(bilgilerGecerliMi()) {
            String query = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye - '" + this.cekilecekMiktar + "'"
                    + " WHERE kullanici_id = '" + getHesapBilgileri().getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - this.cekilecekMiktar);
            } catch (SQLException ex) {
                Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.cekilecekMiktar == 0
                 || getHesapBilgileri().getBakiye() < this.cekilecekMiktar);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getCekilecekMiktar() {
        return cekilecekMiktar;
    }

    public void setCekilecekMiktar(int cekilecekMiktar) {
        this.cekilecekMiktar = cekilecekMiktar;
    } 
    
}
