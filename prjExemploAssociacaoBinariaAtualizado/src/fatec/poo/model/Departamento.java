
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //multiplicidade 1..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[3];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
                                                        
    public void addFuncionario(Funcionario f){ 
        funcionarios[numFunc++] = f;       
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. Funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int cont=0; cont < numFunc; cont++){
             System.out.print(funcionarios[cont].getRegistro() + "\t\t");
             System.out.print(funcionarios[cont].getNome() +"\t\t");
             System.out.println(funcionarios[cont].getCargo());
        }   
    }
}
