package ch04_pjt_02.scope;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");

		DependencyBean dependencyBean_01 = ctx.getBean("dependencyBean", DependencyBean.class);
		DependencyBean dependencyBean_02 = ctx.getBean("dependencyBean", DependencyBean.class);
		
		if(dependencyBean_01.equals(dependencyBean_02)) {
			System.out.println("dependencyBean_01 == dependencyBean_02");
//								이 두녀석이 같은 녀석을 참조하고 있으면 이것을 반환
		} else {
			System.out.println("dependencyBean_01 != dependencyBean_02");
		}
		
		ctx.close();
	}
}
