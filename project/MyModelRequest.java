package com.example.demo;

public class MyModelRequest {

    private Operator operation_type;
    private Integer x;
    private Integer y;

    public Operator getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(Operator operation_type) {
        this.operation_type = operation_type;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
