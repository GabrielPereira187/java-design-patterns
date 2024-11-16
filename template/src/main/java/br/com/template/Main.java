package br.com.template;

import br.com.template.files.FinancialReport;
import br.com.template.files.SalesReport;
import br.com.template.generator.FileGenerator;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> financialMap = new LinkedHashMap<>();
        financialMap.put("Profit Jan/2024", 2000L);
        financialMap.put("Profit Fev/2024", 3000L);
        financialMap.put("Profit Mar/2024", -1000L);

        Map<String, Object> salesMap = new LinkedHashMap<>();
        salesMap.put("Sales Jan/2024", 10000L);
        salesMap.put("Sales Fev/2024", 8000L);
        salesMap.put("Sales Mar/2024", 5000L);

        FileGenerator fileGeneratorSales = new SalesReport();
        try {
            fileGeneratorSales.generateFile("sales_report_file.txt", salesMap);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileGenerator fileGeneratorFinancial = new FinancialReport();
        try {
            fileGeneratorFinancial.generateFile("financial_report_file.txt", financialMap);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}