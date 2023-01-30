package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public void add(User user);
    public List<User> getList();
    public User getUser(long id);
    public void deleteUser(long id);
    public void editUser(User user);
}
