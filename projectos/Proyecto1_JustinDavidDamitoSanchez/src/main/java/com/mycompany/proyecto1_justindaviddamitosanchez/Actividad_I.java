/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_justindaviddamitosanchez;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author CTPG
 */
public class Actividad_I {
    public static void main(String[] args) {
        double salario,horasEx,salarioEx,aguinaldo;
        DecimalFormat decimal = new DecimalFormat("#.##");
    
    String workers[][] = new String[7][7];
    
        for(int i = 0; i < workers.length; i++){
        workers[i][0] = validacion();
        workers[i][1] = validacion();
        workers[i][2] = validacion();
        
        salario = validacionNumber();
        horasEx = validacionNumber();
        salarioEx = (((salario/30)*1.5)*horasEx);
        aguinaldo = (((salario*12)+salarioEx)/12);
        
        workers[i][3] = Double.toString(salario);
        workers[i][4] = Double.toString(horasEx);
        workers[i][5] = Double.toString(salarioEx);
        workers[i][6] = Double.toString(aguinaldo);                         
        }

        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        XSSFSheet sheet = workbook.createSheet("informe empleados");
          

        Map<Integer, Object[]> data = new TreeMap<>();
        data.put(1, new Object[]{"ID", "1", "2", "3", "4", "5", "6", "7"});
        int rowNumber = 2;
        for (int i = 0; i < workers.length; i++) {
            data.put(rowNumber++, new Object[]{i + 1, workers[i][3], workers[i][1], workers[i][2], workers[i][3], workers[i][4], workers[i][5], workers[i][6]});
            
        }
        Set<Integer> keyset = data.keySet();
        int rownum = 0;
        for (Integer key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            FileOutputStream out = new FileOutputStream(new File("InformeEmpleados.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("InformeEmpleados.xlsx written successfully on disk.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
public static String validacion(){
    Scanner sc = new Scanner(System.in);
    String x;
    do{
        x = JOptionPane.showInputDialog("ingrese nombre"); 
    }while(x.isBlank());
    return x;
}

public static double validacionNumber(){
    Scanner sc = new Scanner(System.in);
    Double x;
    do{
        x = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero"));
       
        
    }while(x < 0);
    return x;
}
}
