package AbstractClassExample;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getDate() {
        System.out.println("Veri MySql'dan getirildi");
    }
}
