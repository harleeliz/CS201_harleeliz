/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Jun, Harlee Ramos
 */
public class ZoningTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - default constructor, toString");
		Zoning p1=new Zoning();	
		System.out.println("EXPECTED RESULT:Length:125.0 Width:25.0");
		System.out.println("YOUR RESULT    :"+p1.toString());
		System.out.println("PASSED="+p1.toString().equals("Length:125.0 Width:25.0")+"\n");

		System.out.println("Test Case 2 - non-default constructor, set* methods");
		Zoning p2=new Zoning(155, 65);	
		System.out.println("EXPECTED RESULT:Length:155.0 Width:65.0");
		System.out.println("YOUR RESULT    :"+p2.toString());
		System.out.println("PASSED="+p2.toString().equals("Length:155.0 Width:65.0"));
		p2.setLength(200);
		p2.setWidth(50);
		System.out.println("EXPECTED RESULT:Length:200.0 Width:50.0");
		System.out.println("YOUR RESULT    :"+p2.toString());
		System.out.println("PASSED="+p2.toString().equals("Length:200.0 Width:50.0")+"\n");
		
		System.out.println("Test Case 3 - heightLimit R1");
		Zoning p3a=new Zoning(100,20);			
		System.out.println("EXPECTED RESULT:25.0");
		System.out.println("YOUR RESULT    :"+p3a.heightLimit());
		System.out.println("PASSED="+(Math.abs(p3a.heightLimit()-25)<.000001));
		Zoning p3b=new Zoning(100,19.5);
		System.out.println("EXPECTED RESULT:25.0");
		System.out.println("YOUR RESULT    :"+p3b.heightLimit());
		System.out.println("PASSED="+(Math.abs(p3b.heightLimit()-25)<.000001)+"\n");		

		System.out.println("Test Case 4 - heightLimit R2");
		Zoning p4=new Zoning(100,20.1);				
		System.out.println("EXPECTED RESULT:25.2");
		System.out.println("YOUR RESULT    :"+p4.heightLimit());
		System.out.println("PASSED="+(Math.abs(p4.heightLimit()-25.2)<.000001)+"\n");
		
		System.out.println("Test Case 5 - heightLimit R3");
		Zoning p5a=new Zoning();				
		System.out.println("EXPECTED RESULT:41.25");
		System.out.println("YOUR RESULT    :"+p5a.heightLimit());
		System.out.println("PASSED="+(Math.abs(p5a.heightLimit()-41.25)<.000001));
		Zoning p5b=new Zoning(100,25);
		System.out.println("EXPECTED RESULT:35.0");
		System.out.println("YOUR RESULT    :"+p5b.heightLimit());
		System.out.println("PASSED="+(Math.abs(p5b.heightLimit()-35)<.000001));			
		Zoning p5c=new Zoning(100,25.1);
		System.out.println("EXPECTED RESULT:35.1");
		System.out.println("YOUR RESULT    :"+p5c.heightLimit());
		System.out.println("PASSED="+(Math.abs(p5c.heightLimit()-35.1)<.000001));	
		Zoning p5d=new Zoning(100,35);
		System.out.println("EXPECTED RESULT:45.0");
		System.out.println("YOUR RESULT    :"+p5d.heightLimit());
		System.out.println("PASSED="+(Math.abs(p5d.heightLimit()-45)<.000001)+"\n");	

		System.out.println("Test Case 6 - heightLimit R4");
		Zoning p6a=new Zoning(100,35.1);		
		System.out.println("EXPECTED RESULT:45.05");
		System.out.println("YOUR RESULT    :"+p6a.heightLimit());
		System.out.println("PASSED="+(Math.abs(p6a.heightLimit()-45.05)<.000001));
		Zoning p6b=new Zoning(125,40);
		System.out.println("EXPECTED RESULT:52.5");
		System.out.println("YOUR RESULT    :"+p6b.heightLimit());
		System.out.println("PASSED="+(Math.abs(p6b.heightLimit()-52.5)<.000001)+"\n");

		System.out.println("Test Case 7 - heightLimit R5");
		Zoning p7=new Zoning(150,40);			
		System.out.println("EXPECTED RESULT:55.0");
		System.out.println("YOUR RESULT    :"+p7.heightLimit());
		System.out.println("PASSED="+(Math.abs(p7.heightLimit()-55)<.000001)+"\n");

		System.out.println("Test Case 8 - unitCountLimit R1");
		Zoning p8a=new Zoning(100,20);		
		System.out.println("EXPECTED RESULT:1");
		System.out.println("YOUR RESULT    :"+p8a.unitCountLimit());
		System.out.println("PASSED="+(p8a.unitCountLimit()==1));
		Zoning p8b=new Zoning(100,19.5);
		System.out.println("EXPECTED RESULT:1");		
		System.out.println("YOUR RESULT    :"+p8a.unitCountLimit());
		System.out.println("PASSED="+(p8b.unitCountLimit()==1)+"\n");	

		System.out.println("Test Case 9 - unitCountLimit R2");
		Zoning p9=new Zoning(100,20.1);	
		System.out.println("EXPECTED RESULT:2");
		System.out.println("YOUR RESULT    :"+p9.unitCountLimit());
		System.out.println("PASSED="+(p9.unitCountLimit()==2)+"\n");
		
		System.out.println("Test Case 10 - unitCountLimit R3");
		Zoning p10a=new Zoning();				
		System.out.println("EXPECTED RESULT:2");
		System.out.println("YOUR RESULT    :"+p10a.unitCountLimit());
		System.out.println("PASSED="+(p10a.unitCountLimit()==2));
		Zoning p10b=new Zoning(100,25);
		System.out.println("EXPECTED RESULT:2");
		System.out.println("YOUR RESULT    :"+p10b.unitCountLimit());
		System.out.println("PASSED="+(p10b.unitCountLimit()==2));			
		Zoning p10c=new Zoning(100,25.1);
		System.out.println("EXPECTED RESULT:2");
		System.out.println("YOUR RESULT    :"+p10c.unitCountLimit());
		System.out.println("PASSED="+(p10c.unitCountLimit()==2));	
		Zoning p10d=new Zoning(100,35);
		System.out.println("EXPECTED RESULT:2");
		System.out.println("YOUR RESULT    :"+p10d.unitCountLimit());
		System.out.println("PASSED="+(p10d.unitCountLimit()==2)+"\n");	

		System.out.println("Test Case 11 - unitCountLimit R4");
		Zoning p11a=new Zoning(100,35.1);		
		System.out.println("EXPECTED RESULT:3");
		System.out.println("YOUR RESULT    :"+p11a.unitCountLimit());
		System.out.println("PASSED="+(p11a.unitCountLimit()==3));
		Zoning p11b=new Zoning(100,40);
		System.out.println("EXPECTED RESULT:3");		
		System.out.println("YOUR RESULT    :"+p11a.unitCountLimit());
		System.out.println("PASSED="+(p11b.unitCountLimit()==3)+"\n");	

		System.out.println("Test Case 12 - unitCountLimit R5");
		Zoning p12=new Zoning(150,40);	
		System.out.println("EXPECTED RESULT:4");
		System.out.println("YOUR RESULT    :"+p12.unitCountLimit());
		System.out.println("PASSED="+(p12.unitCountLimit()==4)+"\n");

	}
}