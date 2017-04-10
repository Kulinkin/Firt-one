package project;

import project.dao.UserDao;
import project.entity.User;
import java.util.Optional;

public class UserDemo {

    public static void main(String[] args) {
        Optional<User> userOptional
                = UserDao.getUserInstance().saveUser(new User("Max"));
        if (userOptional.isPresent()) {
            System.out.println(userOptional.get());
        }
    }
}
