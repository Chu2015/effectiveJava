package Minimize_mutability;

class SubComplex extends Complex{

	public SubComplex(double re, double im) {
		super(re,im);
		// TODO Auto-generated constructor stub
	}
	
	//wrong�����಻�ܽ��͸���ɷ�����
//	@Override
//	protected int hashCode() {
//		return 0;
//	}
	
	private static class AA{
		public static int a = 0;	
	}

	public static void main() {
		int a = SubComplex.AA.a;
	}
	
}

class Test{
	public static void main() {
	
	}
	
}