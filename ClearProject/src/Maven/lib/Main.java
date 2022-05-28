package Maven.lib;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost/postgres?user=postgres&password=Mashina.462";
    private static String conok="Соединение с бд установлено";
    private static String conerr="Произошла ошибка подключения к бд";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL)){
            System.out.println(String.format("%s",conok));
            Statement statement = connection.createStatement();
            String str = "Select * from testtable";
            boolean isExecuted=statement.execute(str);
            if (isExecuted){
                System.out.println("Select executed");
                ResultSet resultSet= statement.executeQuery(str);
                while (resultSet.next()){
                    System.out.println(resultSet.getInt("id"));
                    int count = 2;
                    String SQL = "Select * from test WHERE id = ?;";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)); {
                        preparedStatement.setInt(1, count);
                        ResultSet resultSet = preparedStatement.executeQuery();

                        while (resultSet.next()) {
                            System.out.println(resultSet.getInt("ID"));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(String.format("%s",conerr));
            e.printStackTrace();
        }


    }
}