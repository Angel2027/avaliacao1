package controller;


import model.AlunoModel;

import java.util.*;

public class AlunoController {

    public static void main(String[] args){
        /*1
        a- Constrói instâncias da classe.*/
        AlunoModel aluno1 = new AlunoModel();  //utilizando o construtor padrão.
        AlunoModel aluno2 = new AlunoModel();
        AlunoModel aluno3 = new AlunoModel(3, 30000003, "Ana", "Laura", "analaura@ifsul.edu.br");     //utilizando o construtor parametrizado.
        AlunoModel aluno4 = new AlunoModel(4, 40000004, "Tor", "Nado", "tornado@ifsul.edu.br");
        AlunoModel aluno5 = new AlunoModel(5, 50000005);    //utilizando o construtor parametrizado contendo dois atributos como parâmetro.(?)
        AlunoModel aluno6 = new AlunoModel(6, 60000006);

        //Imprime essas instâncias
        System.out.println("Alunos criados com os construtores padrão e parametrizado....");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //imprime essas instâncias com o uso do comportamento toString().
        System.out.println();
        System.out.println("Imprimindo com o uso do comportamento toString: \n");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());
        System.out.println(aluno6.toString());
        System.out.println(aluno1.getSobrenome());

        /*
        b- Modificando os estados dos objetos criados com o construtor padrão, em todos os seus atributos,
        com os métodos setters e devem ser impressos com os métodos getters*/
        System.out.println("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
        System.out.println("\nInstância de Aluno");
        aluno1.setId(1);
        aluno1.setCpf(10000001);
        aluno1.setNome("Helena");
        aluno1.setSobrenome("Tocha");
        aluno1.setEmail("helenatoc@ifsul.edu.br");
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());
        System.out.println("\n");
        aluno2.setId(2);
        aluno2.setCpf(20000002);
        aluno2.setNome("Miguel");
        aluno2.setSobrenome("Uz");
        aluno2.setEmail("migueluz@ifsul.edu.br");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());
        System.out.println("\n\n");

        /*2
        Adicionando dois tipos de coleções de objetos: List e Map.
        Coleção do tipo List*/
        List<AlunoModel> alunosList = new ArrayList<>();
        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);
        alunosList.add(aluno6);
        System.out.println("\nColeção do tipo List\n" + alunosList);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o Cliente pela chave de pesquisa id=5 na coleção do tipo List....");
        AlunoModel AlunoFind = alunosList.stream().filter(alunoModel -> aluno5.equals(5)).findAny().orElse(null);
        System.out.println(AlunoFind);

        //Ordenando a coleção do tipo List
        System.out.println();
        System.out.println(Comparator.comparingInt(AlunoModel::getId).reversed());
        System.out.println(alunosList);

        //Coleção do tipo Map  String.valueOf(id.getId())
        //HashMap<Integer, String > alunos = new HashMap<Integer, String>();
        Map<Integer, AlunoModel> alunosMap = new HashMap<>();
        alunosMap.put(aluno1.getId(),aluno1);
        alunosMap.put(aluno2.getId(),aluno2);
        alunosMap.put(aluno3.getId(),aluno3);
        alunosMap.put(aluno4.getId(),aluno4);
        alunosMap.put(aluno5.getId(),aluno5);
        alunosMap.put(aluno6.getId(),aluno6);
        System.out.println("\nColeção do tipo Map\n" + alunosMap);


        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o Cliente pela chave de pesquisa id=5 na coleção do tipo Map....");
        System.out.println(alunosMap.get(5));
        /*Ordenando a coleção do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash).
        Map<K,V> é uma coleção de pares chave/valor, não admite repetições dobjeto chave; os elementos são indexados
        pelo objeto chave (não possuem posição); acesso, inserção e remoção são rápidos.*/
    }
}
