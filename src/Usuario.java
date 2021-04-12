
public class Usuario {
    public int prontoPago;
    public int servicioPublico;
    public int traslado;
    public int descuento=0;

    public Usuario(int prontoPago, int servicioPublico, int traslado) {
        this.prontoPago = prontoPago;
        this.servicioPublico = servicioPublico;
        this.traslado = traslado;
    }
    
    public void descuento(){
        if( prontoPago==1){
            descuento=descuento+10;
        }else if(servicioPublico == 1){
            descuento =descuento+15;
        }else if( traslado == 1){
            descuento =descuento+20;
        }
    }
}
