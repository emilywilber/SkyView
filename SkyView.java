import java.util.List;
import java.util.Arrays;

/**
 * Write a description of class SkyView here.
 *
 * @author Emily Wilber
 * @version March 13, 2019
 */
public class SkyView
{
    // a rectuangular array that holds the data representing 
    //a rectangular area of the sky
    private double[][] view;

    /**
     * constructs a skyview object from a 1 dimensional array of scan data
     * @param numRows  the number of rows represented in the view
     *        precondition: numRows > 0
     * @param numCols  the number of columns represented in the view
     *        precondition: numCols > 0
     * @param scanned  the data received from the telescope, sorted in telescope order
     *        precondition: scanned.length == numRows * numCols
     * postcondition:  view has been created as a rectangular 2- demensional array
     *                 with numRows rows and numCols columns and the values in
     *                 scanned have been copied to view and are ordered as
     *                 in the original rectangular aray of sky
     */
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        double[][] view = new double[numRows][numCols];
        int index = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (row % 2 == 0) {
                    view[row][col] = scanned[index];
                }
                else {
                    view[row][numCols  - 1 - col] = scanned[index];
                }
                index++;
            }
        }
        
    }
    
    public String toString() {
        String result = "Skyview:\n";
        
        for (int r = 0; r < view.length; r++) {
            result += " ";
            for (int c = 0; c < view[r].length; c++) {
                result += view[r][c] + "\t";
            }
            result += "\n";
        }
        return result.trim();
    }
    
    
    /**
     * Returns the average of the values in a rectangular section of view.
     * @param startRow  the first row index of the section
     * @param endRow    the last row index of the sction
     * @param startCol  the first columns index of the section
     * @param endCol    the last column index of the section
     * Precondition: 0 <= startRow <= endRow < view.length
     * Precondition: 0 <= startCol <= endCol < view[0].length
     * @return          the average of the values in the specified section of view
     */
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0; 
        double totalNums = (endRow - startRow + 1) * (endCol - startCol + 1);
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col]; // null pointer exception 
            }
        }
        return sum / totalNums;
    }
}
