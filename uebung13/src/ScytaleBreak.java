/**
 * Copyright by Martin Weidner (martin.weidner@student.kit.edu) and
 * 				Sebastian Schlag (sebastian.schlag@student.kit.edu
 */

public class ScytaleBreak {
	private static String[] allScytales = {
		"T ce;ee  gced b,ia rIo a v'fsuyddrtetlwroawdwdnlhhohl nlhdharate dygl ofvwe t tei ihnheey ve a d eef la ter,l uoda,so,wkrearSes sewee;e n hepwya ar  m ns re log -n  o i ont orhh dad   gtde tasntb.waasdht wsenhhsd'bdaldm cyoweea,s gali ara,s dooi ni ehe hdltei Ae nlo ahona rn  ianirey n  g  ufr cw anne yerdsl gd whn u rs dabnrdtlv gdaaokateifkhftdi h r eawai lnedo.adhe nu d t etr nloilu",
		"Onris tinesnagenetegto t  l  lpofafohdl in feeatndi rnyhe nws te c aebh elatlaiavo eflniegwr lgrnso,d ;,i,o oi  n dtwnaaga;hn nn n a hddadatte    n orscywdr  haoe orhetunwsea cnthesnwhg e tdai oni ,snpu na  grts  wa i htwhlintehhiwtco eica e c lhyastame sgsami.w a ked atipe sNsonu tto s tao whsa   o eisowafsrn na  h gi lcief thkot ai e o,hvtfrbl ao e y sduulb sh rplohpeai .ner "
	};
	public static void main(String[] args) {
		String res;
		for(String s : allScytales){
			res = breakScytale(s);
			System.out.println(res);
		}
	}
	
	private static String breakScytale(String s) {
		char[] charset = s.toCharArray();
		char[] resultSet = getColWiseTransposed(charset,8);
		return String.valueOf(resultSet);
	}
	private static void printField(char[][] c ){
		for (int i = 0; i < c.length; i++) {
			char[] array_element = c[i];
			System.out.println(String.valueOf(array_element));
		}
	}
//	private static char[] getRowWiseTransposed(char[] charset, int i) {
//		int cols = i;
//		int lines = charset.length / i;
//		int ctr=0;
//		char[][] field = new char[lines+2][cols];
//		System.out.println("Lines: "+field.length+", Cols: "+field[0].length);
//		for (int j = 0; j < charset.length; j++) {
//			System.out.println("line: "+j/cols + ", col: "+j%cols);
//			field[j/cols][j%cols] = charset[j];
//		}
//		
//		printField(field);
//		
//			for(int j=0;j<cols;j++){
//				for(int l=0;l<lines;l++){
//				charset[ctr] = field[l][j];
//				ctr++;
//			}}
//		return charset;
//	}
	private static char[] getColWiseTransposed(char[] charset, int i) {
		int cols = i;
		int lines = charset.length / i;
		if(charset.length%i>0)
			lines++;
		int ctr=0;
		char[][] field = new char[lines][cols];
		System.out.println("Lines: "+field.length+", Cols: "+field[0].length);
		//for (int j = 0; j < charset.length; j++) {
		//	System.out.println("line: "+j/cols + ", col: "+j%cols);
		//	field[j/cols][j%cols] = charset[j];
		//}
		
			for(int j=0;j<cols&&ctr<charset.length;j++){
				for(int l=0;l<lines&&ctr<charset.length;l++){
					System.out.println("line: "+l+" col: "+j);
				field[l][j] = charset[ctr];
				ctr++;
			}
		}
		ctr = 0;
		printField(field);
		for(int l=0;l<lines;l++){
			for(int j=0;j<cols;j++){
				
				charset[ctr] = field[l][j];
				ctr++;
			}}
		return charset;
	}
}
