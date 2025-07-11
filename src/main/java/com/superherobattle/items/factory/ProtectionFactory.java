package com.superherobattle.items.factory;

import com.superherobattle.enums.ProtectionType;
import com.superherobattle.items.Protection;

public class ProtectionFactory {

    public static Protection createProtection(ProtectionType type) {
        return new Protection(type.getName(), type.getLevel(), type);
    }
}

