// O projeto trata-se de um programa que conseguirá após o cadastro do seu usuário,
public class Localidade {
    
    private String asaNorte;
    private String ceilandia;
    private String aguasClaras;
    private String asaSul;
    private String guara;
    
    public Localidade(){
 } 

public Localidade(String asaNorte,String ceilandia,String aguasClaras,String asaSul,String guara){
    this.asaNorte = asaNorte;
    this.ceilandia = ceilandia;
    this.aguasClaras = aguasClaras;
    this.asaSul = asaSul;
    this.guara = guara;
}
public void setAsaNorte (String nome){
    asaNorte = nome;
}
public String getAsaNorte(){
    return asaNorte;
}
public void setCeilandia(String nome){
    ceilandia = nome;
}
public String getCeilandia(){
    return ceilandia;
}
public void setAguasClaras(String nome){
    aguasClaras = nome;
}
public String getAguasClaras(){
    return aguasClaras;
}
public void setAsaSuL(String nome){
    asaSul = nome;
}
public String getAsaSul(){
    return asaSul;
}
public void setGuara(String nome){
    guara = nome;
}
public String getGuara(){
    return guara;
}
String local;
String plano;
String aguas;
String ceila;
public void mercadosPlano(){
    if (local.equals(plano)){
    System.out.printf("-Supermercado Extra asa norte(X Km)\n-Supermercado Atacadao asa sul(Y Km)\n");
    }
}
public void mercadosAguaC(){
    if (local.equals(aguas)){
        System.out.println("-Supermercado Dona de casa (X km)");
    }   
}
}