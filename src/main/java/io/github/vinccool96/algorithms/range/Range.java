package io.github.vinccool96.algorithms.range;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    private int firstNum;

    private int lastNum;

    public Range(int lastNum) {
        this(0, lastNum);
    }

    public Range(int firstNum, int lastNum) {
        this.firstNum = firstNum;
        this.lastNum = lastNum;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(this.firstNum, this.lastNum);
    }

    private static class RangeIterator implements Iterator<Integer> {

        private RangeNode rangeNode;

        public RangeIterator(int firstNum, int lastNum) {
            rangeNode = new RangeNode(firstNum);
            RangeNode previousNode = rangeNode;
            for (int i = firstNum + 1; i < lastNum; i++) {
                RangeNode currentNode = new RangeNode(i);
                previousNode.setNextNode(currentNode);
                previousNode = currentNode;
            }
        }

        @Override
        public boolean hasNext() {
            return this.rangeNode.hasNext();
        }

        @Override
        public Integer next() {
            Integer value = rangeNode.getCurrentValue();
            this.rangeNode = this.rangeNode.getNextNode();
            return value;
        }

    }

    private static class RangeNode {

        private RangeNode nextNode;

        private Integer currentValue;

        RangeNode(Integer currentValue) {
            this.currentValue = currentValue;
        }

        RangeNode getNextNode() {
            return nextNode;
        }

        void setNextNode(RangeNode nextNode) {
            this.nextNode = nextNode;
        }

        Integer getCurrentValue() {
            return currentValue;
        }

        private boolean hasNext() {
            return this.nextNode != null;
        }

    }

}
