package InnerClass;

public class Main{
    public static void main(String[] args) {
        DatabaseHelper.Crud.Create();
        DatabaseHelper.Crud.Read();
        DatabaseHelper.Crud.Update();
        DatabaseHelper.Crud.Delete();

        DatabaseHelper.Connection.CreateConnection();
    }
}
