package ex6.abstract_fabrik;

public class oak_table implements table{
public oak_table(){
    System.out.println("Возьмите стол из дуба");
}
    @Override
    public void clear() {
        System.out.println("Вы убрали со стола из дуба");
    }
}
