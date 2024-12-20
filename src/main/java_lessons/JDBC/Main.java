package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        read();
        create();
        update();
        delete();
    }
     public static void read() {
         Connection connection = null;
         DBHelper dbHelper = new DBHelper();
         Statement statement = null; // SQL statement
         ResultSet resultSet = null; // SQL result
         try {
             connection = dbHelper.getConnection();
             System.out.println("Connected to the database");
             statement = connection.createStatement();
             resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
             ArrayList<Country> countries = new ArrayList<Country>();
             while (resultSet.next()) {
                 countries.add(new Country(
                         resultSet.getString("Code"),
                         resultSet.getString("Name"),
                         resultSet.getString("Continent"),
                         resultSet.getString("Region")));
                 for (int i = 0; i < countries.size(); i++) {
                     System.out.println(countries.get(i));
                 }
             }
         }catch (SQLException exception) {
             dbHelper.showDBErrorMessage(exception);
         } finally {
             try {
                 connection.close();
             } catch (Exception exception) {
                 exception.printStackTrace();
             }
         }
     }

     public static void create() {
         Connection connection = null;
         DBHelper dbHelper = new DBHelper();
         PreparedStatement preparedStatement = null;
         try {
             connection = dbHelper.getConnection();
             System.out.println("Connected to the database");
             String sql = "insert into city (Name, CountryCode, District, Population) values (?,?,?,?)";
             preparedStatement = connection.prepareStatement(sql);
             // ('Agri', 'TUR', 'Agri', 511238)
             preparedStatement.setString(1, "Agri");
             preparedStatement.setString(2, "TUR");
             preparedStatement.setString(3, "Agri");
             preparedStatement.setInt(4, 511238);
             int result = preparedStatement.executeUpdate();
             System.out.println(result + " Data inserted into city table");
         }catch (SQLException exception) {
             dbHelper.showDBErrorMessage(exception);
         } finally {
             try {
                 connection.close();
             } catch (Exception exception) {
                 exception.printStackTrace();
             }
         }
     }

     public static void update() {
         Connection connection = null;
         DBHelper dbHelper = new DBHelper();
         PreparedStatement preparedStatement = null; // SQL statement
         try {
             connection = dbHelper.getConnection();
             System.out.println("Connected to the database");
             String sql = "update city set Population = ? where id = ?";
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1, 511000);
             preparedStatement.setInt(2, 4080);
             int result = preparedStatement.executeUpdate();
             System.out.println(result + " Data updated into city table");
         }catch (SQLException exception) {
             dbHelper.showDBErrorMessage(exception);
         } finally {
             try {
                 connection.close();
             } catch (Exception exception) {
                 exception.printStackTrace();
             }
         }
     }

     public static void delete() {
         Connection connection = null;
         DBHelper dbHelper = new DBHelper();
         PreparedStatement preparedStatement = null; // SQL statement
         try {
             connection = dbHelper.getConnection();
             System.out.println("Connected to the database");
             String sql = "delete from city where id = ?";
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1, 4083);
             int result = preparedStatement.executeUpdate();
             System.out.println(result + " Data deleted from city table");
         }catch (SQLException exception) {
             dbHelper.showDBErrorMessage(exception);
         } finally {
             try {
                 connection.close();
             } catch (Exception exception) {
                 exception.printStackTrace();
             }
         }
     }

}
