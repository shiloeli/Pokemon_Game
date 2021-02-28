package Classes;

import api.geo_location;
import api.node_data;
import gameClient.util.Point3D;

/**
 * This implement node_data that represents the set of operations applicable on a
 * node (vertex) in a (directional) weighted graph.
 * The node in the graph consists of four things:
 * info- Contains some characteristic of the node such as color and more .. In this project it stores the parent node.
 * tag-Temporal data which can be used be algorithms.
 * location- location of this node.
 * weight- Weight of the node.
 */

public class NodeData implements node_data {

    /**
     * ID of node
     */
    private int key;
    /**
     * temporal data
     */
    private String info;
    private int tag;
    private geo_location location;
    private double weight;

    public NodeData(int key){
        this.key = key;
        this.location = new Point3D(0,0,0);
        this.weight = 0;
    }

    /**
     * Copy constructor
     * @param other
     */
    public NodeData(node_data other){
        this.key = other.getKey();
        this.info = other.getInfo();
        this.tag = other.getTag();
        this.weight = other.getWeight();
        this.location = other.getLocation();
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public geo_location getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(geo_location p) {
        this.location = p;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double w) {
        this.weight = w;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }


    public String toString(){
        return "{\"pos\":\""+this.getLocation().x()+","+this.getLocation().y()+","+this.getLocation().z()
                +"\",\"id\":"+this.key+"}";
    }

}
