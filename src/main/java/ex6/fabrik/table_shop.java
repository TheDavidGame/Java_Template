package ex6.fabrik;

public class table_shop {
    private final table_factory table_factory;

    public table_shop(table_factory table_factory){
        this.table_factory = table_factory;
    }

    public table order_table(table_type type){
        table table = table_factory.createTable(type);
        table.clear_the_table();
        table.move_the_table();
        table.put_on_a_table();

        System.out.println("Спасибо за заказ");
        return table;
    }
}
