import java.util.Arrays;
public class CS3310Project1TestCases extends CS3310Project1 {

    public static void main(String[] args){

        //Creating the Test Matricies

        //2x2 matrix
        int[][] matrix2Up = sequentialMatrixUp(2);
        int[][] matrix2Down = sequentialMatrixDown(2);

        //4x4 matrix
        int[][] matrix4Up = sequentialMatrixUp(4);
        int[][] matrix4Down = sequentialMatrixDown(4);

        //8x8 matrix
        int[][] matrix8Up = sequentialMatrixUp(8);
        int[][] matrix8Down = sequentialMatrixDown(8);

        //16x16 matrix
        int[][] matrix16Up = sequentialMatrixUp(16);
        int[][] matrix16Down = sequentialMatrixDown(16);

        //32x32 matrix
        int[][] matrix32Up = sequentialMatrixUp(32);
        int[][] matrix32Down = sequentialMatrixDown(32);

        //64x64 matrix
        int[][] matrix64Up = sequentialMatrixUp(64);
        int[][] matrix64Down = sequentialMatrixDown(64);

        //128x128 matrix
        int[][] matrix128Up = sequentialMatrixUp(128);
        int[][] matrix128Down = sequentialMatrixDown(128);

        //256x256 matrix
        int[][] matrix256Up = sequentialMatrixUp(256);
        int[][] matrix256Down = sequentialMatrixDown(256);

        //512x512 matrix
        int[][] matrix512Up = sequentialMatrixUp(512);
        int[][] matrix512Down = sequentialMatrixDown(512);

        //1024 x 1024 matrix
        int[][] matrix1024Up = sequentialMatrixUp(1024);
        int[][] matrix1024Down = sequentialMatrixDown(1024);


        //Matrix testing
        //All will be done by this format: A * B, A * A, B * B, B * A

        //2x2 Matrix
        //A * B
        System.out.println("2x2 A*B Cases:");
        long startTime = System.nanoTime();
        bruteForce(matrix2Up,matrix2Down,2);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Test 2x2 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix2Up,matrix2Down,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix2Up,matrix2Down,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n2x2 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix2Up,matrix2Up,2);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix2Up,matrix2Up,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix2Up,matrix2Up,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n2x2 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix2Down,matrix2Down,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix2Down,matrix2Down,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix2Down,matrix2Down,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n2x2 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix2Down,matrix2Up,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix2Down,matrix2Up,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix2Down,matrix2Up,2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 2x2 B * A took " + duration + " nanoseconds for strassen");

        //4x4 Matrix
        //A * B
        System.out.println("\n\n\n4x4 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix4Up,matrix4Down,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 A * B took" + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix4Up,matrix4Down,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix4Up,matrix4Down,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n4x4 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix4Up,matrix4Up,4);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix4Up,matrix4Up,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix4Up,matrix4Up,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n4x4 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix4Down,matrix4Down,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix4Down,matrix4Down,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix4Down,matrix4Down,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n4x4 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix4Down,matrix4Up,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix4Down,matrix4Up,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix4Down,matrix4Up,4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 4x4 B * A took " + duration + " nanoseconds for strassen");

        //8x8 Matrix
        //A * B
        System.out.println("\n\n\n8x8 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix8Up,matrix8Down,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * B took" + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix8Up,matrix8Down,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix8Up,matrix8Down,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n8x8 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix8Up,matrix8Up,8);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix8Up,matrix8Up,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix8Up,matrix8Up,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n8x8 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix8Down,matrix8Down,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix8Down,matrix8Down,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix8Down,matrix8Down,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n8x8 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix8Down,matrix8Up,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix8Down,matrix8Up,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix8Down,matrix8Up,8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 B * A took " + duration + " nanoseconds for strassen");

        //16x16 Matrix
        //A * B
        System.out.println("\n\n\n16x16 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix16Up,matrix16Down,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix16Up,matrix16Down,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix16Up,matrix16Down,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n16x16 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix16Up,matrix16Up,16);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix16Up,matrix16Up,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 8x8 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix16Up,matrix16Up,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n16x16 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix16Down,matrix16Down,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix16Down,matrix16Down,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix16Up,matrix16Up,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n16x16 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix16Down,matrix16Up,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix16Down,matrix16Up,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix16Down,matrix16Up,16);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 16x16 B * A took " + duration + " nanoseconds for strassen");

        //32x32 Matrix
        //A * B
        System.out.println("\n\n\n32x32 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix32Up,matrix32Down,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix32Up,matrix32Down,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix32Up,matrix32Down,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n32x32 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix32Up,matrix32Up,32);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix32Up,matrix32Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix32Up,matrix32Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n32x32 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix32Down,matrix32Down,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix32Down,matrix32Down,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix32Up,matrix32Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n32x32 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix32Down,matrix32Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix32Down,matrix32Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix32Down,matrix32Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 32x32 B * A took " + duration + " nanoseconds for strassen");

        //64x64 Matrix
        //A * B
        System.out.println("\n\n\n64x64 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix64Up,matrix64Down,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix64Up,matrix64Down,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix64Up,matrix64Down,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n64x64 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix64Up,matrix64Up,64);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix64Up,matrix64Up,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix64Up,matrix64Up,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n64x64 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix64Down,matrix64Down,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix64Down,matrix64Down,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix64Up,matrix64Up,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n64x64 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix64Down,matrix64Up,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix64Down,matrix64Up,32);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix64Down,matrix64Up,64);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 64x64 B * A took " + duration + " nanoseconds for strassen");

        //128x128 Matrix
        //A * B
        System.out.println("\n\n\n128x128 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix128Up,matrix128Down,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix128Up,matrix128Down,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix128Up,matrix128Down,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n128x128 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix128Up,matrix128Up,128);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix128Up,matrix128Up,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix128Up,matrix128Up,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n128x128 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix128Down,matrix128Down,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix128Down,matrix128Down,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix128Up,matrix128Up,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n128x128 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix128Down,matrix128Up,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix128Down,matrix128Up,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix128Down,matrix128Up,128);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * A took " + duration + " nanoseconds for strassen");

        //256x256 Matrix
        //A * B
        System.out.println("\n\n\n256x256 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix256Up,matrix256Down,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix256Up,matrix256Down,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix256Up,matrix256Down,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n256x256 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix256Up,matrix256Up,256);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix256Up,matrix256Up,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix256Up,matrix256Up,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n256x256 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix256Down,matrix256Down,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix256Down,matrix256Down,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix256Up,matrix256Up,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n256x256 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix256Down,matrix256Up,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 128x128 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix256Down,matrix256Up,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix256Down,matrix256Up,256);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 256x256 B * A took " + duration + " nanoseconds for strassen");

        //512x512 Matrix
        //A * B
        System.out.println("\n\n\n512x512 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix512Up,matrix512Down,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix512Up,matrix512Down,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix512Up,matrix512Down,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n512x512 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix512Up,matrix512Up,512);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix512Up,matrix512Up,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix512Up,matrix512Up,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n512x512 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix512Down,matrix512Down,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix512Down,matrix512Down,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix512Up,matrix512Up,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n512x512 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix512Down,matrix512Up,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix512Down,matrix512Up,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix512Down,matrix512Up,512);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 B * A took " + duration + " nanoseconds for strassen");

        //1024x1024 Matrix
        //A * B
        System.out.println("\n\n\n1024x1024 A*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix1024Up,matrix1024Down,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 A * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix1024Up,matrix1024Down,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix1024Up,matrix1024Down,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 512x512 A * B took " + duration + " nanoseconds for strassen");

        //A * A
        System.out.println("\n1024x1024 A*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix1024Up,matrix1024Up,1024);
        endTime= System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 A * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix1024Up,matrix1024Up,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 A * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix1024Up,matrix1024Up,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 A * A took " + duration + " nanoseconds for strassen");

        //B * B
        System.out.println("\n1024x1024 B*B Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix1024Down,matrix1024Down,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 B * B took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix1024Down,matrix1024Down,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 B * B took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix1024Up,matrix1024Up,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 B * B took " + duration + " nanoseconds for strassen");

        //B * A
        System.out.println("\n1024x1024 B*A Cases:");
        startTime = System.nanoTime();
        bruteForce(matrix1024Down,matrix1024Up,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 B * A took " + duration + " nanoseconds for brute force");

        startTime = System.nanoTime();
        divideAndConquer(matrix1024Down,matrix1024Up,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 B * A took " + duration + " nanoseconds for divide and conquer");

        startTime = System.nanoTime();
        strassen(matrix1024Down,matrix1024Up,1024);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Test 1024x1024 B * A took " + duration + " nanoseconds for strassen");

        //Sanity Checks
        int[][] A = {{2,0,-1,6},{3,7,8,0},{-5,1,6,-2},{8,0,1,7}};
        int[][] B = {{0,1,6,3},{-2,8,7,1},{2,0,-1,0},{9,1,6,-2}};

        System.out.println(Arrays.deepToString(bruteForce(A,B,4)));
        System.out.println(Arrays.deepToString(divideAndConquer(A,B,4)));
        System.out.println(Arrays.deepToString(strassen(A,B,4)));

    

        

    }
    
}
