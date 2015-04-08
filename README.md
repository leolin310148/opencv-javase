# opencv-javase
Example using opencv with java


1. Download opencv from [http://opencv.org/downloads.html](http://opencv.org/downloads.html)


2. Follow [this guide](http://docs.opencv.org/doc/tutorials/introduction/desktop_java/java_dev_intro.html#java-dev-intro) to install opencv.
 

3. Copy {opencv-dir}/build/bin/opencv-{version}.jar to your project.


4. Load opencv library before using it.
 
        import org.opencv.core.Core;
        import org.opencv.core.Mat;
    
        public class HelloOpenCv {
    
            static {
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            }
    
            public static void main(String[] args) {
                Mat mat = new Mat();
                System.out.println(mat);
            }
        }
    
5. Add library path to jvm arguments

        -Djava.library.path={opencv-dir}/build/lib
