/**
 * @author Rustom Trayvilla
 * @since June 19, 1995
 * @version 1.0
 */
package JavaAdvance;

/*
 * Annotations are special notes 
 * for giving extra information
 * to compiler or tools
 */
public class JavaAnnotations extends JavaExtendAnnotation {

	/*
	 *Many types of @Annotations suchs as
	 *@Overrisde, @Deprecatded and @SuppressWarnings 
	 */
	
	
	/*
	 * It'll give error in main class
	 * when method name is spelled
	 * differently
	 */
	public void outPut() {
		super.outPut();
	}
	
	/*
	 * @Depracted method warns developer
	 * not use a method because it maybe be 
	 * remove or replaced in the future
	 */
	
	@Deprecated
	static void warnMethod() {
		System.out.println("Warning Deprecated AnnotationS!");
	}
		
}
