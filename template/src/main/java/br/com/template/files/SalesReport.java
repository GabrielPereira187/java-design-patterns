package br.com.template.generator;

import java.util.Map;

public class SalesFile extends FileGenerator {
    @Override
    protected String generateFileInfo(Map<String, Object> properties) {
        StringBuilder sb = new StringBuilder();
        sb.append("================================Sales Report================================\n\n");
        Long salesSum = 0L;
        for(String prop : properties.keySet()) {
            String line = String.format("%s: %s\n", prop, properties.get(prop));
            sb.append(line);
            if(properties.get(prop) instanceof Long) {
                salesSum = ((Long)properties.get(prop)) + salesSum;
            }
        }

        sb.append("Total Sales/2024: " + salesSum);

        return sb.toString();
    }


}
