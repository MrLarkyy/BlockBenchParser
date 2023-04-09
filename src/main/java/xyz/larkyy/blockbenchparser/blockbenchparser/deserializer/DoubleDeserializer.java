package xyz.larkyy.blockbenchparser.blockbenchparser.deserializer;

import com.google.gson.*;

import java.lang.reflect.Type;

public class DoubleDeserializer implements JsonDeserializer<Double> {
    @Override
    public Double deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String str = jsonElement.getAsString();
        if (str == null || str.isEmpty() || str.isBlank()) {
            return null;
        }
        return Double.parseDouble(str);
    }
}
