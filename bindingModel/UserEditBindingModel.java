package softuniBlog.bindingModel;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danny on 26.11.2016 г..
 */
public class UserEditBindingModel extends UserBindingModel {
private List<Integer> roles;
    public UserEditBindingModel(){this.roles=new ArrayList<>();}
    public List<Integer> getRoles(){return roles;}
    public void setRoles(List<Integer> roles){this.roles=roles;}
}
