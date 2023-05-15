package Bai9.TriangleClassifier;

public class TriangleClassifier {
    public static String triangleClassifier(double fistEdge, double secondEdge, double thirdEdge) {
        boolean checkTriangle = false;
        boolean checkRightTriangle = false;
        boolean checkEquilateralTriangle = false;
        boolean checkIsoscelesTriangle = false;

        if (fistEdge + secondEdge > thirdEdge &&
                fistEdge + thirdEdge > secondEdge &&
                secondEdge + thirdEdge > fistEdge) {
            checkTriangle = true;
        }

        if (fistEdge == secondEdge && secondEdge == thirdEdge) {
            checkEquilateralTriangle = true;
        }

        if (checkTriangle) {
            if ((fistEdge == secondEdge && fistEdge != thirdEdge) ||
                    (fistEdge == thirdEdge && fistEdge != secondEdge) ||
                    (secondEdge == thirdEdge && secondEdge != fistEdge)) {
                checkIsoscelesTriangle = true;
            }
        }

        if (fistEdge * fistEdge + secondEdge * secondEdge == thirdEdge * thirdEdge ||
                fistEdge * fistEdge + thirdEdge * thirdEdge == secondEdge * secondEdge ||
                secondEdge * secondEdge + thirdEdge * thirdEdge == fistEdge * fistEdge) {
            checkRightTriangle = true;
        }
        if (checkIsoscelesTriangle)
            return "Là tam giác cân.";

        if (checkEquilateralTriangle) {
            return "Là tam giác đều.";
        }

        if (checkRightTriangle) {
            return ("Là tam giác vuông.");
        }

        if (checkTriangle) {
            return "Là tam giác thường.";
        } else {
            return "Không là tam giác.";
        }
    }

}
