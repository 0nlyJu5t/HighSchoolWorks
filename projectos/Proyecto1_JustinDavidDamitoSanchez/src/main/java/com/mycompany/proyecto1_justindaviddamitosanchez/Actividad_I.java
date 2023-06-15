/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_justindaviddamitosanchez;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Justin damito sanchez
 */
public class Actividad_I {
    public static void main(String[] args) {
        
        //instancias 
        DecimalFormat decimal = new DecimalFormat("#.##");
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();
        
        //declaracion y inicializacion de arreglo
        String empleadosInfo[][] = new String[7][7];
        
        //declaracion de variables
        double salario,horasEx,salarioEx,aguinaldo;
        
        //bucle for para el ingreso de informacion
        for(int i = 0; i < empleadosInfo.length; i++){
            empleadosInfo[i][0] = validacion("cedula",i+1);
            empleadosInfo[i][1] = validacion("nombre",i+1);
            empleadosInfo[i][2] = validacion("genero",i+1);

            salario = validacionNumber("salario",i+1);
            horasEx = validacionNumber("horas extra",i+1);
            
            //operaciones
            salarioEx = salarioExCalc(salario,horasEx);
            aguinaldo = aguinaldoCalc(salario,salarioEx);

            empleadosInfo[i][3] = decimal.format(salario);
            empleadosInfo[i][4] = decimal.format(horasEx);
            empleadosInfo[i][5] = decimal.format(salarioEx);
            empleadosInfo[i][6] = decimal.format(aguinaldo);                         
        }

             //PROCESO PARA HACER EL DOCUMENTO EXCEL
        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        XSSFSheet sheet = workbook.createSheet("informeEmpleados");
          

        Map<Integer, Object[]> data = new TreeMap<>();
        data.put(1, new Object[]{"ID", "cedula", "nombre", "genero", "salario", "horas extra", "salario extra", "aguinaldo"});
        int rowNumber = 2;
        for (int i = 0; i < empleadosInfo.length; i++) {
            data.put(rowNumber++, new Object[]{i + 1, empleadosInfo[i][0], empleadosInfo[i][1], empleadosInfo[i][2], empleadosInfo[i][3], empleadosInfo[i][4], empleadosInfo[i][5], empleadosInfo[i][6]});
            
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
        
            // Ajustar el tamaño de las celdas al contenido
        for (int i = 0; i < data.get(1).length; i++) {
            sheet.autoSizeColumn(i);
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
        
            //PROCESO PARA HACER EL DOCUMENTO PDF
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("InformeEmpleados.pdf"));
            document.open();
            document.add(new Paragraph("Autor: Justin David Dámito Sánchez 11-2"));
            document.add(new Paragraph("fecha: " + dateFormat.format(date)));
            for(int i = 0;i < empleadosInfo.length;i++){
                document.add(new Paragraph("\nCedula:" + empleadosInfo[i][0]));
                document.add(new Paragraph("Nombre:" + empleadosInfo[i][1]));
                document.add(new Paragraph("Genero:" + empleadosInfo[i][2]));
                document.add(new Paragraph("Salario:" + empleadosInfo[i][3]));
                document.add(new Paragraph("Horas Extra:" + empleadosInfo[i][4]));
                document.add(new Paragraph("Salario Extra:" + empleadosInfo[i][5]));
                document.add(new Paragraph("aguinaldo:" + empleadosInfo[i][6]));
            }
            document.close();
            System.out.println("PDF creado correctamente.");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    //funciones de validacion de datos
public static String validacion(String peticion,int i){
    String x;
    do{
        x = JOptionPane.showInputDialog("Ingrese " + peticion +" de empleado "+ i);
        if(x.isBlank()){
           JOptionPane.showMessageDialog(null,"el campo no puede estar vacio");}
    }while(x.isBlank());
    return x;
}

public static double validacionNumber(String peticion,int i){
    Double x;
    do{
        x = Double.valueOf(JOptionPane.showInputDialog("Ingrese " + peticion +" de empleado "+ i));
        if(x < 0){
           JOptionPane.showMessageDialog(null,"el campo no puede estar vacio");}

    }while(x < 0);
    return x;
    }

public static double salarioExCalc(double salario, double horasEx){
    return (((salario/30)*1.5)*horasEx);
}

public static double aguinaldoCalc(double salario, double salarioEx){
    return (((salario*12)+salarioEx)/12);
}
}
