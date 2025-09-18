package org.example;

public class Direccion {
  //  private Direccion direccion;//Composicion Mi direccion normal donde vivo, ajustes, casa
    private String calle;
    private String codigoPostal;
    private String numeroCasa;
    private String ciudad;


    public Direccion(String calle, String codigoPostal, String numeroCasa, String ciudad) {
        if(calle==null||codigoPostal==null||numeroCasa==null||ciudad==null){
            throw new IllegalArgumentException("Los datos estan incorrectos");
        }
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.numeroCasa = numeroCasa;
        this.ciudad = ciudad;

    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void imprimirDatosDireccion(){
        System.out.println(calle);
        System.out.println(codigoPostal);
        System.out.println(numeroCasa);
    }
}
