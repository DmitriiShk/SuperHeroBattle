package com.superherobattle.items;

import com.superherobattle.enums.ProtectionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Protection {
    private final String name;
    private final int level;
    private final ProtectionType type;
}

