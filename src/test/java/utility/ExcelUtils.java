package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import com.weather.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtils {

	private Object getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();

		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();

		case Cell.CELL_TYPE_NUMERIC:
			return cell.getNumericCellValue();
		}

		return null;
	}

	public RequestObject getTestData(RequestObject request) throws IOException {
		String excelFilePath = "src/test/java/utility/TestData.xlsx";

		FileInputStream inputStream = new FileInputStream(new File(
				excelFilePath));

		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();

		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			while (cellIterator.hasNext()) {
				Cell nextCell = cellIterator.next();
				int columnIndex = nextCell.getColumnIndex();

				switch (columnIndex) {
				case 1:
					request.city = (String) getCellValue(nextCell);
					break;
				case 2:
					request.country = (String) getCellValue(nextCell);
					break;

				}
				System.out.println();
			}
			workbook.close();

		}
		return request;
	}
}