package service;
import Constant.constant;
import model.User;
import java.util.UUID;
import java.util.ArrayList;

public class AuthService {
    ArrayList<User> DS = new ArrayList<>();
    public AuthService(ArrayList<User> DS) {
        this.DS = DS;
    }
    public boolean Login(String username, String password){
        for(User x : DS){
            if(x.getUsername().equals(username) && x.getPassword().equals(password) )
            {
                System.out.println(constant.SUCCESSFUL_MES.Success_login);
                return true;
            }
        }
        System.out.println(constant.ERROR_MES.Error_login);
        return false;
    }
    public void Register( String username, String password, String email, String phoneNumber){
        String id = UUID.randomUUID().toString();
        User x = new User(id, username, password, email, phoneNumber);
        DS.add(x);
        System.out.println(constant.SUCCESSFUL_MES.Success_register);
        return;
    }
    public void ChangePass(String userId, String newPassword, String confirmNewPassword){
        for(User x : DS){
            if(x.getId().equals(userId) && newPassword.equals(confirmNewPassword) ){
                x.setPassword(newPassword);
                System.out.println(constant.SUCCESSFUL_MES.Success_changepass);
                return;
            }
        }
        System.out.println(constant.ERROR_MES.Error_changepass);
        return;
    }
}
