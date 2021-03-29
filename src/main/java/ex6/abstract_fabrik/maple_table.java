package ex6.abstract_fabrik;

public class maple_table implements table {
public maple_table(){
    System.out.println("Возьмите стол из клёна");
}
    @Override
    public void clear() {
        System.out.println("Вы убрали со стола из клёна");
    }
}
