package com.timerchina.collaborative.similarity.util;

import java.io.File;

import com.timerchina.collaborative.cache.FileStore;
import com.timerchina.collaborative.cache.Store;
import com.timerchina.collaborative.similarity.naive.SimilarityMatrix;

public class SimilarityMatrixCache {

    private Store store;
    private String location;
    
    public SimilarityMatrixCache(File location) {
        store = new FileStore(location);
        this.location = location.getAbsolutePath();
    }
    
    public String getLocation() {
        return location;
    }
    
    public void put(String id, SimilarityMatrix similarityMatrix) {
        if( store.exists(id) ) {
            store.remove(id);
        }
        store.put(id, similarityMatrix);
    }
    
    public SimilarityMatrix get(String id) {
        SimilarityMatrix s = null;
        if( store.exists(id) ) {
            s = (SimilarityMatrix)store.get(id);
        }
        return s;
    }
    
    public void remove(String id) {
        store.remove(id);
    }
}
