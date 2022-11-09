package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : StockGraphApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class StockGraphApplication {
    public static void main(String[] args) {
        StockGraph stockGraph = new StockGraph();
        Graph graph = new Graph();

        Report r = new Report();
        r.drawing(stockGraph);
        r.drawing(graph);
    }
}
