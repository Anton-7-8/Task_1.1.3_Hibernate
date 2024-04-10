package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;
/**
 *  Создание таблицы User(ов)
 *  Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в
 *  консоль ( User с именем – name добавлен в базу данных )
 *  Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
 *  Очистка таблицы User(ов)
 *  Удаление таблицы
 */
public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl(new Util());
        userDao.createUsersTable();
        userDao.saveUser("Name1", "LastName1", (byte) 30);
        userDao.saveUser("Name2", "LastName2", (byte) 26);
        userDao.saveUser("Name3", "LastName3", (byte) 28);
        userDao.saveUser("Name4", "LastName4", (byte) 18);
        userDao.removeUserById(4);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();






/*        Util util = new Util();
        util.getConnection();*/
        // реализуйте алгоритм здесь
/*        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1",(byte) 20);
        userDao.saveUser("Name2", "LastName2",(byte) 28);
        userDao.saveUser("Name3", "LastName3",(byte) 30);
        userDao.saveUser("Name4", "LastName4",(byte) 38);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();*/
    }
}
