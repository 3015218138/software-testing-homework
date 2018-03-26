包 lab1 ;

公共 类 TriangleProblem {
	
	public  String  isTriangle（int  a，int  b，int  c）{
		如果（a == b && b == c）{
			返回 “等边三角形” ;
		} else  if（（a == b && a ！= c）||（a == c && a ！= b）||（b == c && b ！= a））{
		    返回 “等腰三角形” ;
		} else {
			返回 “ Scalene Triangle ” ;
		}
	}
}
