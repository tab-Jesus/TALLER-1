
package co.edu.udec.s2.Taller1.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class CuentaBancaria {
    String NumeroCuenta;
    String Saldo;
    String TipoCuenta;      
    
    public CuentaBancaria(){
        
        this.NumeroCuenta = "xxxxxxxxx";
        this.Saldo = "00000";
        this.TipoCuenta = "debito";
     
    }
    
    public CuentaBancaria(String NumeroCuenta, String TipoCuenta){
        
        this.TipoCuenta = TipoCuenta;
        this.NumeroCuenta = NumeroCuenta;
        
    }
    
    public CuentaBancaria (String NumeroCuenta, String Saldo, String TipoCuenta){
        
     this.NumeroCuenta = NumeroCuenta;
     this.Saldo = Saldo;        
     this.TipoCuenta = TipoCuenta;   
    }
    
    
    
    
    
}
