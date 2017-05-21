package com.timerchina.collaborative.evaluation;

import java.util.List;

import com.timerchina.collaborative.model.Rating;

/**
 * Interface to access previously generated evaluation data.  
 */
public interface EvaluationDataProvider {
    List<Rating> loadTrainingRatings(int testSize, int testSequence);
    List<Rating> loadTestRatings(int testSize, int testSequence);
}
