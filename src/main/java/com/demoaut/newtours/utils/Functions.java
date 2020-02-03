package com.demoaut.newtours.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Functions {

	public static void main(String[] args) {

	}

	@SuppressWarnings("resource")
	public static void txtResultado(String resultado) throws IOException {
		String ruta = System.getProperty("user.dir") + "\\target\\site\\resultadoEjecucion.txt";
		File archivo = new File(ruta);
		BufferedWriter bw;
		String cadena;
		try {
			FileReader f = new FileReader(archivo);
			cadena = new BufferedReader(f).readLine();
			if (!cadena.equals("PASSED")) {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(resultado);
				bw.close();
			}
		} catch (Exception e) {
			bw = new BufferedWriter(new FileWriter(archivo));
			bw.write(resultado);
			bw.close();
		}
	}

}
