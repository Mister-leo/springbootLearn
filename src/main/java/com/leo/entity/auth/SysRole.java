package com.leo.entity.auth;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "role_t")
public class SysRole implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String roles;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="role_permission_t",joinColumns = {@JoinColumn(name="rid")},inverseJoinColumns = {@JoinColumn(name="pid")})
    private List<SysPermission> permissions;


    @ManyToMany
    @JoinTable(name="user_role_t",joinColumns = {@JoinColumn(name="rid")},inverseJoinColumns = {@JoinColumn(name="uid")})
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
