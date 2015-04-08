package me.leolin;

import org.opencv.core.Core;
import org.opencv.core.Mat;

/**
 * @author leolin
 */
public class HelloOpenCv {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        Mat mat = new Mat();
        System.out.println(mat);
    }
}

