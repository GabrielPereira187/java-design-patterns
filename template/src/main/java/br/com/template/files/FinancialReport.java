package br.com.template.generator;

import java.util.Map;

public class FinancialReport extends FileGenerator{
    @Override
    protected String generateFileInfo(Map<String, Object> properties) {
        StringBuilder sb = new StringBuilder();
        sb.append("================================Financial Report================================\n\n");
        for(String prop : properties.keySet()) {
            sb.append(properties.get(prop));
        }

        return sb.toString();
    }
}
