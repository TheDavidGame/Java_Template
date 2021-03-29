package ex6.abstract_fabrik;

public class birch_table_fabrik implements fabrik {
    @Override
    public table create_table() {
        return new birch_table();
    }
}
