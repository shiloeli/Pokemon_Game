package Classes;//package Classes;
//
//import api.directed_weighted_graph;
//import api.node_data;
//import org.junit.jupiter.api.Test;
////import test.DWGraph_DSTest;
////
//import static org.junit.jupiter.api.Assertions.*;
//
//class AgentTest {
//
//    @Test
//    void setTarget() {
//        directed_weighted_graph dwg = AgentTest.graph_creator(5,0);
//        node_data n1 = new NodeData(1);
//
//
//        node_data n2 = new NodeData(2);
//        node_data n3 = new NodeData(3);
//
//    }
//
//    @Test
//    void getTarget() {
//    }
//
//    @Test
//    void update() {
//    }
//
//    @Test
//    void getSrcNode() {
//    }
//
//    @Test
//    void toJSON() {
//    }
//
//    @Test
//    void setNextNode() {
//    }
//
//    @Test
//    void setCurrNode() {
//    }
//
//    @Test
//    void isMoving() {
//    }
//
//    @Test
//    void testToString() {
//    }
//
//    @Test
//    void toString1() {
//    }
//
//    @Test
//    void getID() {
//    }
//
//    @Test
//    void getLocation() {
//    }
//
//    @Test
//    void getValue() {
//    }
//
//    @Test
//    void getNextNode() {
//    }
//
//    @Test
//    void getSpeed() {
//    }
//
//    @Test
//    void setSpeed() {
//    }
//
//    @Test
//    void get_curr_fruit() {
//    }
//
//    @Test
//    void set_curr_fruit() {
//    }
//
//    @Test
//    void set_SDT() {
//    }
//
//    @Test
//    void get_curr_edge() {
//    }
//
//    @Test
//    void get_sg_dt() {
//    }
//
//    @Test
//    void set_sg_dt() {
//    }
//
//    public static directed_weighted_graph graph_creator(int v_size, int e_size) {
//        directed_weighted_graph g = new DWGraph_DS();
//        for (int i = 0; i < v_size; i++) {
//            g.addNode(new NodeData(i));
//        }
//
//        for (int i = 0; i < v_size; i++) {
//            for (int j = 1; j < v_size; j++) {
//                if (g.edgeSize() < e_size) {
//                    g.connect(i, j, 4);
//                }
//            }
//            if (g.edgeSize() >= e_size) {
//                break;
//            }
//        }
//
//        return g;
//    }
//}