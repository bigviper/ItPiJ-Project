package pl.polsl.patryk.zmijewski.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;


/**
 * Class defying data type in which content of Pascal Triangle is stored
 * @version 1.1.0
 * @author Patryk Żmijewski
 * @param <N> type of the variable that is stored inside the structure
 */
public class PascalTriangleStructure<N> implements Iterable<N>{
    /**
     * Contains a structure of a Pascal Triangle 
     */
    private ArrayList<ArrayList<N>> contents;
    
    /**
     * Inner, private class of an iterator of PascalTriangleStructure
     * @version 1.1.0
     * @author Patryk Żmijewski
     * @param <N> type of the varible stored in PascalTriangleStructure
     */
    private class PascalTriangleIterator<N> implements Iterator<N>{
        /**
         * Index of the iterator
         */
        int currentIndex;
        
        /**
         * Public constructor of the class
         */
        public PascalTriangleIterator(){
            this.currentIndex = 0;
        }
        /**
         * Method chceking if PascalTriangleStructure has more rows than currentIndex
         * @return true if has, false if currentIndex points to a last (or further) element
         */
        @Override
        public boolean hasNext() {
            return this.currentIndex < PascalTriangleStructure.this.contents.size();
        }
        /**
         * Method of obtaining a next element stored in PascalTriangleStructure
         * Usable in for-each loop
         * @return the row of a PascalTriangleStructure.contents indexed by currentIndex
         */
        @Override
        public N next(){
            return (N)PascalTriangleStructure.this.get(currentIndex++);
        }
    }
    
    /**
     * Public constructor of a class
     */
    public PascalTriangleStructure() {
        contents = new ArrayList<>();
    }
    
    /**
     * Method of addition of an element to a structure contents
     * @param row a row of a Pascal Triangle we want to store in a structure
     */
    public void add(ArrayList<N> row) {
        contents.add(row);
    }
    
    /**
     * Method of getting a row stored in contents, at place of index
     * @param index - place at which the row we want to get is stored
     * @return Row of a Pascal Triangle in contents at place given by index
     */
    public ArrayList<N> get(int index) {
        return contents.get(index);
    }
    
    /**
     * Method of initializing of iterator of a PascalTriangleStructure
     * @return PascalTriangleIterator defined in the inner class
     */
    @Override
    public Iterator iterator()
    {
	return new PascalTriangleIterator();
    }


}
