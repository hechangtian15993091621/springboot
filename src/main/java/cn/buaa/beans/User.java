package cn.buaa.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author hct
 * @Slogan 我的代码永远 0 错误
 * @date 2021/4/28
 **/
public class User {
    private Integer id;
    private String name;
    private List<String> hobbies;
    private String[] alias; //外号
    private Map<String,String> relatives;
    private List<User> friends;
    private Role role;
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", alias=" + Arrays.toString(alias) +
                ", relatives=" + relatives +
                ", friends=" + friends +
                ", role=" + role +
                '}';
    }



    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public Map<String, String> getRelatives() {
        return relatives;
    }

    public void setRelatives(Map<String, String> relatives) {
        this.relatives = relatives;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
