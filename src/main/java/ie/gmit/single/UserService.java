package ie.gmit.single;
//Store
public class UserService {
    private  Store store = new Store();

    public  void saveUser(User user){
        store.store(user);
    }
}
