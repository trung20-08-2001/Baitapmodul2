package Bai9.TriangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassifier() {
        double fistEdge=2;
        double secondEdge=2;
        double thirdEdge=2;
        String expected="Là tam giác đều.";
        String result=TriangleClassifier.triangleClassifier(fistEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier1() {
        double fistEdge=2;
        double secondEdge=2;
        double thirdEdge=3;
        String expected="Là tam giác cân.";
        String result=TriangleClassifier.triangleClassifier(fistEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier2() {
        double fistEdge=3;
        double secondEdge=4;
        double thirdEdge=5;
        String expected="Là tam giác vuông.";
        String result=TriangleClassifier.triangleClassifier(fistEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier3() {
        double fistEdge=6;
        double secondEdge=5;
        double thirdEdge=4;
        String expected="Là tam giác thường.";
        String result=TriangleClassifier.triangleClassifier(fistEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier4() {
        double fistEdge=8;
        double secondEdge=2;
        double thirdEdge=3;
        String expected="Không là tam giác.";
        String result=TriangleClassifier.triangleClassifier(fistEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }

    @Test
    void triangleClassifier5() {
        double fistEdge=-1;
        double secondEdge=2;
        double thirdEdge=1;
        String expected="Không là tam giác.";
        String result=TriangleClassifier.triangleClassifier(fistEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }
}