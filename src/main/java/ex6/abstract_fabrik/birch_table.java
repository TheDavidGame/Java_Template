package ex6.abstract_fabrik;

public class birch_table implements table{
    public birch_table(){
        System.out.println("Возьмите стол из березы");
    }
    @Override
    public void clear() {
        System.out.println("Вы убрали со стола из березы");
    }
}
