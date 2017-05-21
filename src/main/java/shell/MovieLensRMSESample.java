package shell;

import com.timerchina.collaborative.data.MovieLensData;
import com.timerchina.collaborative.data.MovieLensDataset;
import com.timerchina.collaborative.evaluation.RMSEEstimator;
import com.timerchina.collaborative.recommender.MovieLensDelphi;


public class MovieLensRMSESample {

    
    public static void main(String[] args) throws Exception {
    	
    	int testSize = Integer.parseInt(args[0]);
    	
    	MovieLensDataset ds = MovieLensData.createDataset(testSize);

    	// Create an instance of our recommender
    	MovieLensDelphi delphi = new MovieLensDelphi(ds);
    	        
    	// Create an instance of the RMSE estimator
    	RMSEEstimator rmseEstimator = new RMSEEstimator();
    	        
    	// Calculate the RMSE
    	// rmseEstimator.calculateRMSE(delphi);

    	// Compare RMSEs
    	for (int i=0; i<25; i++) {
    		delphi.setSimilarityThreshold(0.05d+i*0.01d);
    		rmseEstimator.compareRMSEs(delphi);
    	}
    }
}
