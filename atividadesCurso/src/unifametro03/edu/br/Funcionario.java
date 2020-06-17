package unifametro03.edu.br;

public class Funcionario {
	 //atributos
    private int matricula;
    private String nome;
    private Departamento depar;

    //Construtor sem parametro
    Funcionario(){
    	
    }
    //Construtor com parametro
    public Funcionario(int matricula, String nome,Departamento depar){
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setDepar(depar);
    }
    //metodos de aecsso
        protected int getMatricula() {
            return matricula;
        }

        protected void setMatricula(int matricula) {
    		if (matricula >= 0) {
    		    this.matricula = matricula;
    		} else {
    			System.out.println("A matricula deve ser um número natural.");
    			this.encerrarFun();
    		}
        
        }

        protected String getNome() {
            return nome;
        }

        protected void setNome(String nome) {
        	if (nome.length() != 0 && nome != null) {
    			this.nome = nome;
    		} else {
    			System.out.println("Nome do funcionario inválido (O campo não pode estar vazio ou nulo)");
    			this.encerrarFun();
    		}
        }

        protected Departamento getDepar() {
            return depar;
        }

        protected void setDepar(Departamento depar) {
        	if (depar != null) {
        		  this.depar = depar;
        	} else {
        		System.out.println("Departamento não pode ser nulo. ");
        		this.encerrarFun();
        	}
          
        }
        @Override
        //Retorno
        public String toString(){
         return nome+ ", são: "+" Nome: "+nome+". Matricula: "+matricula+"."+depar+".";
    }        
    	public void encerrarFun() {
    		System.out.println("\nEncerrando programa.");
    		System.exit(0);
    	}
}
