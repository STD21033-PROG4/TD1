package com.prog4.TD1P1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum ClassUniqueInstance {
    INSTANCE(0);

    private int click;

    private ClassUniqueInstance(int click) {
        this.click = click;
    }

    public ClassUniqueInstance getInstance() {
        return INSTANCE;
    }
}
