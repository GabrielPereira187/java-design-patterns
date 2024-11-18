package br.com.template.generator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class FileGenerator {

    public final void generateFile(String name, Map<String, Object> properties) throws IOException {
        String fileInfo = generateFileInfo(properties);
        byte[] bytes = fileInfo.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    protected abstract String generateFileInfo(Map<String, Object> properties);

    protected Long isLongNumber(Object prop) {
        return (prop instanceof Long) ? ((Long)(prop)) : 0;
    }

}
