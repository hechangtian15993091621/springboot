package cn.buaa.beans;

/**
 * @author hct
 * @Slogan 我的代码永远 0 错误
 * @date 2021/4/28
 **/
public class Role {
    private Integer id;
    private String role;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
