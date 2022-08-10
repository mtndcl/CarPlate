package com.carplate.carplate.result;

public class Result {


    private String message="No available message";

    private boolean result=true;

    private  Object object=null;

    public  Result(){

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public boolean isResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public void setResult(boolean result) {
        this.result=result;
    }
}
