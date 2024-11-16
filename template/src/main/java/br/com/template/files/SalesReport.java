package br.com.template.files;

import br.com.template.generator.FileGenerator;

import java.util.Map;

public class SalesReport extends FileGenerator {
    @Override
    protected String generateFileInfo(Map<String, Object> properties) {
        StringBuilder sb = new StringBuilder();
        sb.append("================================Sales Report================================\n\n");
        Long salesSum = 0L;
        for(String prop : properties.keySet()) {
            String line = String.format("%s: %s\n", prop, properties.get(prop));
            sb.append(line);
            salesSum = isLongNumber(properties.get(prop)) + salesSum;
        }
        sb.append("Total Sales/2024: ").append(salesSum);

        return sb.toString();
    }

}
