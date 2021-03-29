package ex6.abstract_fabrik;

import java.util.Scanner;

public class Client implements table {
private table table;

public Client(){
    System.out.println("Какой стол хотите");
    System.out.println("Стол из дуба");
    System.out.println("Стол из клёна");
    System.out.println("Стол из березы");
    int i;
    Scanner scanner = new Scanner(System.in);
    i=scanner.nextInt();
    if (i==1){
        fabrik fabrika = new oak_table_fabrik();
        table= fabrika.create_table();
    }
    else  if (i==2){
        fabrik fabrika = new maple_table_fabrik();
        table= fabrika.create_table();
    }
    else  if (i==3){
        fabrik fabrika = new birch_table_fabrik();
        table= fabrika.create_table();
    }
}
    @Override
    public void clear() {
        table.clear();
    }
}
