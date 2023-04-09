package xyz.larkyy.blockbenchparser.blockbenchparser;

import com.google.gson.*;
import xyz.larkyy.blockbenchparser.blockbenchparser.blockbench.BBChildren;
import xyz.larkyy.blockbenchparser.blockbenchparser.blockbench.BBModel;
import xyz.larkyy.blockbenchparser.blockbenchparser.deserializer.ChildrenDeserializer;
import xyz.larkyy.blockbenchparser.blockbenchparser.deserializer.DoubleDeserializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BlockBenchParser {

    public static BBModel readModel(File file) {
        if (file.isDirectory()) {
            return null;
        }
        var name = file.getName();
        if (!name.endsWith(".bbmodel")) {
            return null;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(Double.class,new DoubleDeserializer());
        gsonBuilder.registerTypeAdapter(BBChildren.class,new ChildrenDeserializer(gsonBuilder));
        Gson gson = gsonBuilder.create();
        BBModel model;
        try {
            model = gson.fromJson(new FileReader(file), BBModel.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return model;
    }

}
