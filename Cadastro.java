/**
 * A classe Cadastro implementa um cadastro de professores.
 * 
 * @author Isabel 
 * @version maio/2005
 */

import java.util.ArrayList;

public class Cadastro
{
    private ArrayList<Professor> array;

    // Construtor recebe o tamanho inicial do cadastro
    public Cadastro(int capacidade)
    {
        try {
            if (capacidade <= 0) {
                throw new IllegalArgumentException();
            }
        } catch(IllegalArgumentException e) {
            e.getMessage();
            e.printStackTrace();
        }

        /* código na main se eu mandasse um throws do construtor
        try{
            Cadastro c1 = new Cadastro(-1);
        }
        catch(IllegalArgumentException e){
            e.getMessage();
            e.printStackTrace();
        }
        */
        
        
        // crie o objeto ArrayList considerando que se o usuário
        // passou um valor negativo deve ser gerada uma exceção
        // IllegalArgumentException
    }
        
    // Adiciona um objeto no array
    public void insere(Professor p)
    {
        try{
            if(!(p instanceof Professor))
                throw new IllegalArgumentException();
            this.array.add(p);
        }catch(IllegalArgumentException e)
        {
            e.getMessage();
            e.printStackTrace();
        }
    }
    
     // Adiciona um objeto numa posição específica do array
     // Caso ocorra uma exceção, faça o método retornar false,
     // senão o método deve retornar true.
    public boolean insere(Professor p, int posicao)
    {
        try{
            this.array.add(posicao, p);
            return true;
        }
        catch(Exception e)
        {
            e.getMessage();
            e.printStackTrace();
            return false;
        }
    }   
    
    // Remove o professor cujo nome é passado por parâmetro.
    // Você deve percorrer a coleção obrigatoriamente usando
    // iterator, e comparar o nome. Se encontrar, remova o objeto
    // e retorne true. Caso contrário, retorne false
    public boolean remove(String nome)
    {
        return true;
    }
    
    // Consulta se o professor cujo nome é passado por parâmetro
    // está no array.Você deve percorrer a coleção obrigatoriamente 
    // usando iterator, e comparar o nome. Se encontrar, retorne a
    // referência do objeto. Caso contrário, retorne false
    public Professor consulta(String nome)
    {
        return null;
    }    
    
    // Retorna a referência para o objeto que está armazenado no array
    // na posição passada como parâmetro. Lembre que uma exceção 
    // IndexOutOfBoundsException pode ser gerada, e propague esta 
    // exceção.
    public Professor get(int posicao)
    {
        return null;
    }      
    
}