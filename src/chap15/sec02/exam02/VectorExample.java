package chap15.sec02.exam02;

import chap15.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        List<Board> list = new Vector<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        Thread threadB = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
        }

        int size = list.size();
        for (Board board : list) {
            System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
