package practicing;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> minH; //store larger half
    PriorityQueue<Integer> maxH; //store smaller half
    public MedianFinder() {
        //constructor
        minH = new PriorityQueue<Integer>();
        maxH = new PriorityQueue<Integer>(Comparator.reverseOrder());
        //to assign in reverse order
    }
    
    public void addNum(int num) {
        maxH.add(num);
        minH.add(maxH.poll()); // smallest number from maxH will be added to minH
        if(minH.size()>maxH.size()){
            maxH.add(minH.poll());
        }
        
    }
    
    public double findMedian() {
        if(minH.size()==maxH.size())
            return (double) (maxH.peek()+minH.peek())*0.5;
        else
            return (double) maxH.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */