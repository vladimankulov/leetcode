package HundredEasySolvedProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementingQueueUsingStacks {

    class MyQueue {
        private Queue<Integer> queue;

        public MyQueue() {
            queue = new LinkedList();
        }

        public void push(int x) {
            queue.add(x);
        }

        public int pop() {
            return queue.poll();
        }

        public int peek() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

}
