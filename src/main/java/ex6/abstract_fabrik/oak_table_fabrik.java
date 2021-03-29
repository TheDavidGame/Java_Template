package ex6.abstract_fabrik;

public class oak_table_fabrik implements fabrik{

    @Override
    public table create_table() {
        return new oak_table();
    }
}
