package ex6.fabrik;

public class table_factory {
    public table createTable (table_type type){
        table table = null;

        switch (type){
            case MAGICTABLE:
                table = new magic_table();
                break;
            case MAPLETABLE:
                table = new maple_table();
                break;
            case OAKTABLE:
                table = new oak_table();
                break;
        }
        return table;
    }
}
