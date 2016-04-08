package algorithm.RectangleArea.java;

public class RectangleArea {

	public static void main(String[] args) {
		System.out.println("First rectangle:(-2,-2),(2,2)");
		System.out.println("Second rectangle:(3,3),(4,4)");
		int area = computeArea(-2,-2,2,2,3,3,4,4);
		System.out.println("Total area is:"+area);
	}
	
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // 1'st rectangle
		int areaA = (C-A)*(D-B);
		// 2'nd rectangle
        int areaB = (G-E)*(H-F);
        // repeat area
        int repeat = 0;
        if(C<=E || G<=A || H<=B || D<=F)
            repeat = 0;
        else
            repeat = (Math.min(C,G)-Math.max(A,E))*(Math.min(D,H)-Math.max(B,F));
        // 1+2-repeat
        return areaA+areaB-repeat;
    }

}
