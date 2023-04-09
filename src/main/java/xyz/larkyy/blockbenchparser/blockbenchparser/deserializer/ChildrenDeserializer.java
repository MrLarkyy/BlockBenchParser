package xyz.larkyy.blockbenchparser.blockbenchparser.deserializer;

import com.google.gson.*;
import xyz.larkyy.blockbenchparser.blockbenchparser.blockbench.BBElementChildren;
import xyz.larkyy.blockbenchparser.blockbenchparser.blockbench.BBBone;
import xyz.larkyy.blockbenchparser.blockbenchparser.blockbench.BBChildren;

import java.lang.reflect.Type;
import java.util.UUID;

public class ChildrenDeserializer implements JsonDeserializer<BBChildren> {

    private final GsonBuilder gson;

    public ChildrenDeserializer(GsonBuilder builder) {
        gson = builder;
    }
    @Override
    public BBChildren deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonObject()) {
            return gson.create().fromJson(jsonElement, BBBone.class);
        }
        return new BBElementChildren(UUID.fromString(jsonElement.getAsString()));
    }
}
