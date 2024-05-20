/*
class TriangleTypeChecker {
    public static String classifyTriangle(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return "Invalid";
        } else if (isRightAngled(a, b, c)) {
            return "Right-angled";
        } else if (isAcute(a, b, c)) {
            return "Acute-angled";
        } else if (isObtuse(a, b, c)) {
            return "Obtuse-angled";
        } else {
            return "Cannot determine triangle type";
        }
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean isRightAngled(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
               Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
               Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }

    private static boolean isAcute(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2) &&
               Math.pow(a, 2) + Math.pow(c, 2) > Math.pow(b, 2) &&
               Math.pow(b, 2) + Math.pow(c, 2) > Math.pow(a, 2);
    }

    private static boolean isObtuse(double a, double b, double c) {
        return !isRightAngled(a, b, c) && !isAcute(a, b, c);
    }
}
*/
class TriangleTypeChecker {
    public static String classifyTriangle(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return "Invalid";
        } else if (isRightAngled(a, b, c)) {
            return "Right-angled";
        } else if (isAcute(a, b, c)) {
            return "Acute-angled";
        } else if (isObtuse(a, b, c)) {
            return "Obtuse-angled";
        } else {
            return "Cannot determine triangle type";
        }
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean isRightAngled(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
               Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
               Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }

    private static boolean isAcute(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2) &&
               Math.pow(a, 2) + Math.pow(c, 2) > Math.pow(b, 2) &&
               Math.pow(b, 2) + Math.pow(c, 2) > Math.pow(a, 2);
    }

    private static boolean isObtuse(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2) ||
               Math.pow(a, 2) + Math.pow(c, 2) < Math.pow(b, 2) ||
               Math.pow(b, 2) + Math.pow(c, 2) < Math.pow(a, 2);
    }
}

public class Main{
	public static void main(String[] args) {
		
	}
}
