package org.example;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Type {
    BREAKFAST, DINNER, LUNCH, SNACK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BREAKFAST: return "breakfast";
            case DINNER: return "dinner";
            case LUNCH: return "lunch";
            case SNACK: return "snack";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("breakfast")) return BREAKFAST;
        if (value.equals("dinner")) return DINNER;
        if (value.equals("lunch")) return LUNCH;
        if (value.equals("snack")) return SNACK;
        throw new IOException("Cannot deserialize Type");
    }
}
