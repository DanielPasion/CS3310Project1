import java.util.Random;

public class CS3310Project1{

    //Brute Force approach
    public static int[][] bruteForce(int[][] givenArray1,int[][] givenArray2,int dimension){
        int[][] solution = new int[dimension][dimension];
        int currentProduct = 0;

        for(int i = 0; i < dimension; i++){

            for(int j = 0; j < dimension; j++){

                for(int k = 0; k < dimension; k++){
                    currentProduct += givenArray1[i][k] * givenArray2[k][j];

                }

                solution[i][j] = currentProduct;
                currentProduct = 0;

            }
        
        }
        


        return solution;

    }

    //Divide and Conquer Approach
    public static int[][] divideAndConquer(int[][] givenArray1,int[][] givenArray2,int dimension){

        int[][] answer = new int[dimension][dimension];

        //Base Case
        if (dimension == 2){

            //First half
            int matrixC11 = (givenArray1[0][0]*givenArray2[0][0] + givenArray1[0][1]*givenArray2[1][0]);
            int matrixC12 = givenArray1[0][0]*givenArray2[0][1] + givenArray1[0][1]*givenArray2[1][1];
            int matrixC21 = givenArray1[1][0]*givenArray2[0][0] + givenArray1[1][1]*givenArray2[1][0];
            int matrixC22 = givenArray1[1][0]*givenArray2[0][1] + givenArray1[1][1]*givenArray2[1][1];

            int[][] solution = {{matrixC11, matrixC12},{matrixC21,matrixC22}};
            return solution;
        }

        //Breaking the larger arrays into smaller arrays
        else {
            int[][] matrixA11 = new int[dimension/2][dimension/2];
            int[][] matrixA12 = new int[dimension/2][dimension/2];
            int[][] matrixA21 = new int[dimension/2][dimension/2];
            int[][] matrixA22 = new int[dimension/2][dimension/2];
            int[][] matrixB11 = new int[dimension/2][dimension/2];
            int[][] matrixB12 = new int[dimension/2][dimension/2];
            int[][] matrixB21 = new int[dimension/2][dimension/2];
            int[][] matrixB22 = new int[dimension/2][dimension/2];

            //Splitting 4 matrices
            for(int i = 0; i < dimension/2; i++){

                for(int j = 0; j < dimension/2; j++){

                    matrixA11[i][j] = givenArray1[i][j]; 
                    matrixB11[i][j] = givenArray2[i][j];

                    matrixA12[i][j] = givenArray1[i][j + dimension/2];
                    matrixB12[i][j] = givenArray2[i][j + dimension/2];

                    matrixA21[i][j] = givenArray1[i + dimension/2][j];
                    matrixB21[i][j] = givenArray2[i + dimension/2][j];

                    matrixA22[i][j] = givenArray1[i + dimension/2][j + dimension/2];
                    matrixB22[i][j] = givenArray2[i + dimension/2][j + dimension/2];
                }

            }

            //Recursively calling the functions 8 times
            int[][] matrixC11Part1 = divideAndConquer(matrixA11,matrixB11,dimension/2);
            int[][] matrixC11Part2 = divideAndConquer(matrixA12,matrixB21,dimension/2);

            int[][] matrixC12Part1 = divideAndConquer(matrixA11,matrixB12,dimension/2);
            int[][] matrixC12Part2 = divideAndConquer(matrixA12,matrixB22,dimension/2);

            int[][] matrixC21Part1 = divideAndConquer(matrixA21,matrixB11,dimension/2);
            int[][] matrixC21Part2 = divideAndConquer(matrixA22,matrixB21,dimension/2);

            int[][] matrixC22Part1 = divideAndConquer(matrixA21,matrixB12,dimension/2);
            int[][] matrixC22Part2 = divideAndConquer(matrixA22,matrixB22,dimension/2);

            //Adding them together
            int[][] matrixC11 = add(matrixC11Part1,matrixC11Part2,dimension);
            int[][] matrixC12 = add(matrixC12Part1,matrixC12Part2,dimension);
            int[][] matrixC21 = add(matrixC21Part1,matrixC21Part2,dimension);
            int[][] matrixC22 = add(matrixC22Part1,matrixC22Part2,dimension);

            //Iterating it back into one matrix
            for(int i = 0; i < dimension/2; i++){

                for(int j = 0; j < dimension/2; j++){
                    answer[i][j] = matrixC11[i][j];

                    answer[i][j + dimension/2] = matrixC12[i][j];

                    answer[i + dimension/2][j] = matrixC21[i][j];

                    answer[i + dimension/2][j + dimension/2] = matrixC22[i][j];
                }

            }


            return answer;




        }


    }

    //Stassen's method
    public static int[][] strassen(int[][] givenArray1,int[][] givenArray2,int dimension){

        int[][] answer = new int[dimension][dimension];
        int half = dimension/2;

        //Base Case
        if (dimension == 2){

            //Making parts 1-7

            int P1 = givenArray1[0][0] * (givenArray2[0][1] - givenArray2[1][1]);
            int P2 = (givenArray1[0][0] + givenArray1[0][1]) * givenArray2[1][1];
            int P3 = (givenArray1[1][0] + givenArray1[1][1]) * givenArray2[0][0];
            int P4 = givenArray1[1][1] * (givenArray2[1][0] - givenArray2[0][0]);
            int P5 = (givenArray1[0][0] + givenArray1[1][1]) * (givenArray2[0][0] + givenArray2[1][1]);
            int P6 = (givenArray1[0][1] - givenArray1[1][1]) * (givenArray2[1][0] + givenArray2[1][1]);
            int P7 = (givenArray1[0][0] - givenArray1[1][0]) * (givenArray2[0][0] + givenArray2[0][1]);
            
            int[][] solution = {{P4 + P5 + P6 - P2, P1 + P2},{P3 + P4, P1 - P3 + P5 - P7}};
            return solution;
        }

        //Breaking the larger arrays into smaller arrays
        else {
            int[][] matrixA11 = new int[half][half];
            int[][] matrixA12 = new int[half][half];
            int[][] matrixA21 = new int[half][half];
            int[][] matrixA22 = new int[half][half];
            int[][] matrixB11 = new int[half][half];
            int[][] matrixB12 = new int[half][half];
            int[][] matrixB21 = new int[half][half];
            int[][] matrixB22 = new int[half][half];

            //Splitting 4 matrices
            for(int i = 0; i < half; i++){

                for(int j = 0; j < half; j++){

                    matrixA11[i][j] = givenArray1[i][j]; 
                    matrixB11[i][j] = givenArray2[i][j];

                    matrixA12[i][j] = givenArray1[i][j + half];
                    matrixB12[i][j] = givenArray2[i][j + half];

                    matrixA21[i][j] = givenArray1[i + half][j];
                    matrixB21[i][j] = givenArray2[i + half][j];

                    matrixA22[i][j] = givenArray1[i + half][j + half];
                    matrixB22[i][j] = givenArray2[i + half][j + half];
                }

            }

            int[][] matrixP1 = strassen(matrixA11,
                                        sub(matrixB12,matrixB22,dimension)
                                        ,half);

            int[][] matrixP2 = strassen(add(matrixA11,matrixA12,dimension),
                                        matrixB22,
                                        half);
            
            int[][] matrixP3 = strassen(add(matrixA21,matrixA22,dimension),
                                        matrixB11,
                                        half);

            int[][] matrixP4 = strassen(matrixA22,
                                        sub(matrixB21,matrixB11,dimension),
                                        half);

            int[][] matrixP5 = strassen(add(matrixA11,matrixA22,dimension),
                                        add(matrixB11,matrixB22,dimension),
                                        half);

            int[][] matrixP6 = strassen(sub(matrixA12,matrixA22,dimension),
                                        add(matrixB21,matrixB22,dimension),
                                        half);
            
            int[][] matrixP7 = strassen(sub(matrixA11,matrixA21,dimension),
                                        add(matrixB11,matrixB12,dimension),
                                        half);
            
            int[][] matrixC11 = add(add(matrixP4,matrixP5,dimension),sub(matrixP6,matrixP2,dimension),dimension);
            int[][] matrixC12 = add(matrixP1,matrixP2,dimension);
            int[][] matrixC21 = add(matrixP3,matrixP4,dimension);
            int[][] matrixC22 = add(sub(matrixP1,matrixP3,dimension),sub(matrixP5,matrixP7,dimension),dimension);

            //Putting everything back together

            for(int i = 0; i < dimension/2; i++){

                for(int j = 0; j < dimension/2; j++){
                    answer[i][j] = matrixC11[i][j];

                    answer[i][j + dimension/2] = matrixC12[i][j];

                    answer[i + dimension/2][j] = matrixC21[i][j];

                    answer[i + dimension/2][j + dimension/2] = matrixC22[i][j];
                }

            }
                                    
        }
        
        return answer;
    }









    //Helper Methods
    //Add matrices
    private static int[][] add(int[][] a,int[][] b,int size){

        int[][] solution = new int[size/2][size/2];
        for(int i = 0; i < size/2; i++){

            for(int j = 0; j < size/2; j++){
                solution[i][j] = a[i][j] + b[i][j];
            }
            
        }

        return solution;
    }

    //Sub matrices
    private static int[][] sub(int[][] a,int[][] b,int size){

        int[][] solution = new int[size/2][size/2];
        for(int i = 0; i < size/2; i++){

            for(int j = 0; j < size/2; j++){
                solution[i][j] = a[i][j] - b[i][j];
            }
            
        }

        return solution;
    }

    //Creating a matrix that goes from 1 - N x N
    public static int[][] sequentialMatrixUp(int size){
        int[][] solution = new int[size][size];
        int counter = 1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                solution[i][j] = counter;
                counter++;
            }
        }

        return solution;
    }

    //Matrix that goes from N x n to 1
    public static int[][] sequentialMatrixDown(int size){
        int[][] solution = new int[size][size];
        int counter = size*size;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                solution[i][j] = counter;
                counter--;
            }
        }

        return solution;
    }


    public static int[][] sequentialMatrixBy10(int size){
        int[][] solution = new int[size][size];
        int counter = 10;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                solution[i][j] = counter;
                counter+=10;
            }
        }

        return solution;
    }


}