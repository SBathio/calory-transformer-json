package org.example;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Procedence {
    HOMEMADE, PURCHASED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HOMEMADE: return "homemade";
            case PURCHASED: return "purchased";
        }
        return null;
    }

    @JsonCreator
    public static Procedence forValue(String value) throws IOException {
        if (value.equals("homemade")) return HOMEMADE;
        if (value.equals("purchased")) return PURCHASED;
        throw new IOException("Cannot deserialize Procedence");
    }
}
