package ex6.abstract_fabrik;

public class maple_table_fabrik implements fabrik {
    @Override
    public table create_table() {
        return new maple_table();
    }
}
