package play;

import cliente.Fisica;
import cliente.Juridica;
import cliente.Pessoa;
import conta.Corrente;
import conta.Poupanca;
import javax.swing.JOptionPane;

public class BancoExe {
    public static void main(String[] args) {
        
    }
    
    
    public static Fisica inserirPessoaFisica(){
        Fisica f = new Fisica();
        f.setNome(JOptionPane.
                showInputDialog("Digite o nome do cliente: "));
        f.setEndereco(JOptionPane.
                showInputDialog("Digite o endereço do cliente: "));
        f.setEmail(JOptionPane.
                showInputDialog("Digite o e-mail do cliente: "));
        f.setTelefone(JOptionPane.
                showInputDialog("Digite o telefone do cliente: "));
        f.setCpf(JOptionPane.
                showInputDialog("Digite o telefone do cliente: "));
        return f;
    }
    
    public static Juridica inserirPessoaJuridica(){
        Juridica j = new Juridica();
        j.setNome(JOptionPane.
                showInputDialog("Digite o nome da empresa: "));
        j.setEndereco(JOptionPane.
                showInputDialog("Digite o endereço da empresa: "));
        j.setEmail(JOptionPane.
                showInputDialog("Digite o e-mail da empresa: "));
        j.setTelefone(JOptionPane.
                showInputDialog("Digite o telefone da empresa: "));
        j.setCnpj(JOptionPane.
                showInputDialog("Digite o CNPJ da empresa: "));
        return j;
    }
    
    public static Corrente inserirContaCorrente(Pessoa p){
        Corrente c = new Corrente();
        c.setAgencia("0001");
        c.setPessoa(p);
        c.setSaldo(0);
        
        c.setNroConta(JOptionPane.
                showInputDialog("Digite um número para a conta: "));
        c.setSenha(JOptionPane.showInputDialog("Digite uma senha:"));
        String credito = JOptionPane.
                showInputDialog
        ("Deseja Cartão de Crédito? (S)im ou (N)ão:");
        c.setCartaoCredito(false);
        if (credito.equals("S")){
            c.setCartaoCredito(true);
        }
        return c;
    }
    
    public static Poupanca inserirContaPoupanca(Pessoa p){
        Poupanca poupa = new Poupanca();
        poupa.setAgencia("0001");
        poupa.setPessoa(p);
        poupa.setSaldo(0);
        
        poupa.setNroConta(JOptionPane.
                showInputDialog("Digite um número para a conta: "));
        poupa.setSenha(JOptionPane.showInputDialog("Digite uma senha:"));
        
        return poupa;
    }

}
