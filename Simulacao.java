/**
 * Write a description of class Simulacao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Simulacao
{

    public static void main(String args[])
    {
        ProfDE pd1 = new ProfDE("Lucas", 123, 5);
        ProfDE pd2 = new ProfDE("Carlos", 222, 5);
        ProfHorista pf1 = new ProfHorista("Fernando", 213, 40, 7);
        ProfHorista pf2 = new ProfHorista("Rodrigo", 312, 40, 10);
        Cadastro c1 = new Cadastro(5);
        c1.insere(pd1); //por que dá nullpointerexception com o array.add(p) em Cadastro? perguntar
    

        // Crie alguns dois objetos ProfDE, dois objetos ProfHorista e um objeto cadastro
        // Depois insira, consulte e remova elementos do cadastro provocando a ocorrência 
        // de exceções. Faça o tratamento aqui exibindo mensagens específicas para cada
        // exceção que pode ocorrer.
    }
    
    
    
}