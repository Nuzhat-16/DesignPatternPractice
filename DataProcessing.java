package com.nujhat.dataprocessing;
public abstract class DataPipeline {
    public final boolean processData(String URL) {
        connect(URL);
        transformData();
        storeData();
        return true;
    }

    protected abstract void connect(String URL);
    protected abstract void transformData();
    protected abstract void storeData();
}

// Concrete class for Database processing
class DatabasePipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("connecting databases...");
    }
    @Override
    protected void transformData() {
        System.out.println("transforming data in databases...");
      
    }

    @Override
    protected void storeData() {
        System.out.println("storing data in databases...");
      
    }
}

// Concrete class for Cloud processing
class CloudPipeline extends DataPipeline {
    @Override
    protected void connect(String URL) {
        System.out.println("connecting cloud...");
       
    }

    @Override
    protected void transformData() {
        System.out.println("transforming data in cloud...");
    }
    @Override
    protected void storeData() {
        System.out.println("storing data in cloud...");
    }
}
// Main class 
public class DataProcessing {
    public static void main(String[] args) {
        DataPipeline dbPipeline = new DatabasePipeline();
        DataPipeline cldPipeline = new CloudPipeline();
        dbPipeline.processData("A random URL");
        cldPipeline.processData("A random URL");
    }
}

