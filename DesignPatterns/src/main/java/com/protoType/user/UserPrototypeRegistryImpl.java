package com.protoType.user;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {
    private Map<UserType, User> users = new HashMap<UserType, User>();

    @Override
    public void addPrototype(User user) {
        users.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return users.get(type);
    }

    @Override
    public User clone(UserType type) {
        return users.get(type).cloneObject();
    }
}
