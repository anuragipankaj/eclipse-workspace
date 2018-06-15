package stepDefinitions;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import cucumber.api.java.en.*;

public class ApachePOIExcel {

    public XSSFWorkbook workbook;

    public ApachePOIExcel()
    {

    }
  
    @When("^I read the excel file \"(.*?)\"$")
    public void i_read_the_excel_file(String arg1) throws Throwable 
    {
            workbook = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"/"+arg1));
            System.out.println("Reading data .....");
    }

    @Then("^I access a worksheet$")
    public void i_access_a_worksheet() throws Throwable
    {
        XSSFSheet sheet = workbook.getSheet("Sheet1");
    }

    @Then("^I access the rows and cells$")
    public void i_access_the_rows_and_cells() throws Throwable {
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
        {
            Row currentRow = sheet.getRow(i);
            for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
            {
                Cell currentCell = currentRow.getCell(j);
                switch (currentCell.getCellType())
                {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(currentCell.getStringCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(currentCell.getNumericCellValue() + "\t");
                        break;
                }
            }
            System.out.println("\n");
        }
    }

}