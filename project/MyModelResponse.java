package com.example.demo;

public class MyModelResponse {

    private String slackUsername;
    private Integer result;
    private Operator operation_type;

    public MyModelResponse(String slackUsername, Integer result, Operator operation_type) {
        this.slackUsername = slackUsername;
        this.result = result;
        this.operation_type = operation_type;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Operator getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(Operator operation_type) {
        this.operation_type = operation_type;
    }
}
