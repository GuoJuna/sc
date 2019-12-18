package com.gj.app.demo;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2019/2/22
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
	public static String[][] num0 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", " ", " " }, { "|", " ", "|" }, { " ", "-", " " } };
	public static String[][] num1 = new String[][] { { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " } };
	public static String[][] num2 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " } };
	public static String[][] num3 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
	public static String[][] num4 = new String[][] { { " ", " ", " " }, { "|", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", " ", " " } };
	public static String[][] num5 = new String[][] { { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
	public static String[][] num6 = new String[][] { { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " } };
	public static String[][] num7 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " } };
	public static String[][] num8 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " } };
	public static String[][] num9 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };

	public static String[][] option = new String[][] { { " ", " ", " " }, { " ", "●", " " }, { " ", " ", " " }, { " ", "●", " " }, { " ", " ", " " } };
	public static String[][][] numAll = new String[][][] { num0, num1, num2, num3, num4, num5, num6, num7, num8, num9 };
	public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	public static void main(String[] args) {
		print();
	}

	public static void print() {
		String[][][] newStr = getDateArray();
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < newStr.length; k++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(newStr[k][i][j]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static String[][][] getDateArray() {
		String[][][] dateArray = new String[5][][];
		String dateStr = sdf.format(new Date());
		char[] dateChars = dateStr.toCharArray();
		for (int i = 0; i < dateChars.length; i++) {
			switch (dateChars[i]) {
				case ':':
					dateArray[i] = option;
					break;
				default:
					dateArray[i] = numAll[Integer.valueOf(String.valueOf(dateChars[i]))];
					break;
			}
		}

		return dateArray;
	}
}
