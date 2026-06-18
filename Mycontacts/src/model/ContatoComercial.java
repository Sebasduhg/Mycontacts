package model;

public class ContatoComercial extends Contato {

    public String empresa;

    public ContatoComercial(String nome, String telefone, String email, String empresa) {
        super(nome, telefone, email);
        this.empresa = empresa;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Empresa: " + empresa);
    }
}
